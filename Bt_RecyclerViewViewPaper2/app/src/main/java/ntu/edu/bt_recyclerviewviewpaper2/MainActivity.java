package ntu.edu.bt_recyclerviewviewpaper2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> viewPaperDatas;
    ViewPager2 viewPager2Land;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        viewPaperDatas = getDataForViewPaper();
        viewPager2Land = findViewById(R.id.vpland);
        landScapeAdapter = new LandScapeAdapter(this, viewPaperDatas);
        viewPager2Land.setAdapter(landScapeAdapter);
        viewPager2Land.setPageTransformer(new ZoomOutPageTransformer());
        viewPager2Land.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

    ArrayList<LandScape> getDataForViewPaper(){
        ArrayList<LandScape> dsData = new ArrayList<>();
        LandScape landScape = new LandScape("anh1","Ảnh đẹp 4k - ảnh nên máy tính");
        dsData.add(landScape);
        dsData.add(new LandScape("anh2","Ảnh đẹp 4k - ảnh nên máy tính"));
        dsData.add(new LandScape("anh3","Ảnh đẹp 4k - ảnh nên máy tính"));
        dsData.add(new LandScape("anh4","Ảnh đẹp 4k - ảnh nên máy tính"));
        return dsData;
    }
}