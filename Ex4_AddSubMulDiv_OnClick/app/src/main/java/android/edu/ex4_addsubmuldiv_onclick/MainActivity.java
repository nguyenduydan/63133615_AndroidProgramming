package android.edu.ex4_addsubmuldiv_onclick;

import static java.lang.Integer.parseInt;

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
    //khai báo cá đối tượng
    EditText valueA;
    EditText valueB;
    EditText Kq;
    Button btnAdd,btnSub,btnMul,btnDiv;
    void TimDieuKhien(){
        valueA = (EditText) findViewById(R.id.edt_a);
        valueB = (EditText) findViewById(R.id.edt_b);
        Kq = (EditText) findViewById(R.id.edtkq);
        btnAdd = (Button) findViewById(R.id.btnCong);
        btnSub = (Button) findViewById(R.id.btnTru);
        btnMul = (Button) findViewById(R.id.btnNhan);
        btnDiv = (Button) findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }



    //Hàm xử lý cộng
    public void XuLyCong(View view){
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA + numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    //Hàm xử lý trừ
    public void XuLyTru(View view){
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA - numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    //Hàm xử lý nhân
    public void XuLyNhan(View view){
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA * numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    //Hàm xử lý chia
    public void XuLyChia(View view){
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA / numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }

}