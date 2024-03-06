package android.edu.ex5_tinhtoanmorong;

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
    Button btnAdd,btnSub,btnMul,btnDiv,btnDienTich,btnChuVi;
    void TimDieuKhien(){
        valueA = (EditText) findViewById(R.id.edt_a);
        valueB = (EditText) findViewById(R.id.edt_b);
        Kq = (EditText) findViewById(R.id.edtkq);
        btnAdd = (Button) findViewById(R.id.btnCong);
        btnSub = (Button) findViewById(R.id.btnTru);
        btnMul = (Button) findViewById(R.id.btnNhan);
        btnDiv = (Button) findViewById(R.id.btnChia);
        btnDienTich = (Button) findViewById(R.id.btnDienTich_HCN);
        btnChuVi = (Button) findViewById(R.id.btnChuvi_HCN);
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
                XuLy_Cong();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Tru();
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Nhan();
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               XuLy_Chia();
            }
        });
        btnDienTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_DienTich();
            }
        });
        btnChuVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Chuvi();
            }
        });
    }
    public void XuLy_Cong(){
        //Xử lý cộng
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA + numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    public void XuLy_Tru(){
        //xử lý trừ
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA - numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    public void XuLy_Nhan(){
    //Xử lý nhân
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA * numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    public void XuLy_Chia(){
        //Xử lý chia
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = numA / numB;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
    public void XuLy_DienTich(){
        XuLy_Nhan();
    }
    public void XuLy_Chuvi(){
        double numA = Double.parseDouble(valueA.getText().toString());
        double numB = Double.parseDouble(valueB.getText().toString());
        double result;
        result = (numA + numB)*2;
        String chuoiKq = String.valueOf(result);
        Kq.setText(chuoiKq);
    }
}