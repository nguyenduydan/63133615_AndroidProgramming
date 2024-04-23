package ntu.edu.intern_nhaplieu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ManHinhNhapLieu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Button btn_comfirm = (Button) findViewById(R.id.btn_main);
        Button btn_cancel = (Button) findViewById(R.id.btn_cancel);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

        btn_comfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                EditText edt_ten = (EditText) findViewById(R.id.edt_ten);
                EditText edt_namsinh = (EditText) findViewById(R.id.edt_namsinh);
                String edtTen = edt_ten.getText().toString();
                String edtnamsinh = edt_namsinh.getText().toString();
                intent.putExtra("ten",edtTen);
                intent.putExtra("namsinh",edtnamsinh);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}