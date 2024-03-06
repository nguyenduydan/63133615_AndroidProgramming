package android.edu.ex5_addsubmuldiv_anynomous;

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
        //Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý cộng
                double numA = Double.parseDouble(valueA.getText().toString());
                double numB = Double.parseDouble(valueB.getText().toString());
                double result;
                result = numA + numB;
                String chuoiKq = String.valueOf(result);
                Kq.setText(chuoiKq);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //xử lý trừ
                double numA = Double.parseDouble(valueA.getText().toString());
                double numB = Double.parseDouble(valueB.getText().toString());
                double result;
                result = numA - numB;
                String chuoiKq = String.valueOf(result);
                Kq.setText(chuoiKq);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý nhân
                double numA = Double.parseDouble(valueA.getText().toString());
                double numB = Double.parseDouble(valueB.getText().toString());
                double result;
                result = numA * numB;
                String chuoiKq = String.valueOf(result);
                Kq.setText(chuoiKq);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý chia
                double numA = Double.parseDouble(valueA.getText().toString());
                double numB = Double.parseDouble(valueB.getText().toString());
                double result;
                result = numA / numB;
                String chuoiKq = String.valueOf(result);
                Kq.setText(chuoiKq);
            }
        });
    }
}