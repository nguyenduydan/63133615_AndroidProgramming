package ntu.edu.menu_bottom;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView;
        FrameLayout frameLayout;
        bottomNavigationView =(BottomNavigationView) findViewById(R.id.bottom_bar);
        frameLayout = (FrameLayout) findViewById(R.id.frame_layout);

       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               int itemID = item.getItemId();

               if(itemID == R.id.bag){

               }if(itemID == R.id.add){
                   loadFragment(new AddFragment());

               }if(itemID == R.id.cart){
                   loadFragment(new ShoppingFragment());

               }if(itemID == R.id.lib){
                   loadFragment(new VideoFragment());

               }
               loadFragment(new AddFragment());

               return true;
           }
       });
   }

    public void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}