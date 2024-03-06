package android.edu.ex3_simplesumapp;

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
    public void XuLyCong(View v){
        //tìm tham chiếu
        EditText valueA = findViewById(R.id.edt_a);
        EditText valueB = findViewById(R.id.edt_b);

        //Chuyển thành kiểu số nguyên
        int numA = Integer.parseInt(valueA.getText().toString());
        int numB = Integer.parseInt(valueB.getText().toString());

        //tính tổng
        int tong = numA + numB;

        EditText result = findViewById(R.id.edtResult);
        result.setText(String.valueOf(tong));

    }
}