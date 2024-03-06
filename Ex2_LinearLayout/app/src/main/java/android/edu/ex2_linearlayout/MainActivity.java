package android.edu.ex2_linearlayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnTinh = (Button) findViewById(R.id.btnTinh);
        btnTinh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText result = (EditText) findViewById(R.id.txtResult);
                EditText a = (EditText) findViewById(R.id.etx_a);
                EditText b = (EditText) findViewById(R.id.etx_b);

                //lấy giá trị số tự editText
                int numA = Integer.parseInt(a.getText().toString());
                int numB = Integer.parseInt(b.getText().toString());

                int tong  = numA + numB;
                result.setText(String.valueOf(tong));
            }
        });
    }
}