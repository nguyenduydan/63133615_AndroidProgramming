package android.edu.ex4_addsubmuldiv_onclick;

import static java.lang.Integer.parseInt;

import android.os.Bundle;
import android.view.View;
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
    }

    //Hàm xử lý cộng
    public void XuLyCong(View view){
        //lấy tham số
        EditText valueA = (EditText) findViewById(R.id.edt_a);
        EditText valueB = (EditText) findViewById(R.id.edt_b);
        EditText Kq = (EditText) findViewById(R.id.edtkq);

        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA + numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    //Hàm xử lý trừ
    public void XuLyTru(View view){
        EditText valueA = (EditText) findViewById(R.id.edt_a);
        EditText valueB = (EditText) findViewById(R.id.edt_b);
        EditText Kq = (EditText) findViewById(R.id.edtkq);

        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA - numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    //Hàm xử lý nhân
    public void XuLyNhan(View view){
        EditText valueA = (EditText) findViewById(R.id.edt_a);
        EditText valueB = (EditText) findViewById(R.id.edt_b);
        EditText Kq = (EditText) findViewById(R.id.edtkq);

        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA * numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    //Hàm xử lý chia
    public void XuLyChia(View view){
        EditText valueA = (EditText) findViewById(R.id.edt_a);
        EditText valueB = (EditText) findViewById(R.id.edt_b);
        EditText Kq = (EditText) findViewById(R.id.edtkq);

        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA / numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }

}