package ntu.edu.intern_nhaplieu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn_nhaplieu = (Button) findViewById(R.id.btn_nhaplieu);

        btn_nhaplieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNhapLieu = new Intent(MainActivity.this, ManHinhNhapLieu.class);
                startActivityForResult(iNhapLieu,8000);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestResult, int resultCode, @Nullable Intent data) {
        if(requestResult == 8000){
            if(resultCode == RESULT_OK){
                String ten = data.getStringExtra("ten");
                String namSinh = data.getStringExtra("namsinh");
                TextView tv_ten = (TextView) findViewById(R.id.tv_ten);
                TextView tv_namsinh = (TextView) findViewById(R.id.tv_namsinh);
                tv_ten.setText(ten);
                tv_namsinh.setText(namSinh);
                Toast.makeText(this,"Thành công",Toast.LENGTH_LONG).show();
            }
            else
                Toast.makeText(this,"Thất bại",Toast.LENGTH_LONG).show();

        }
        else
            super.onActivityResult(requestResult, resultCode, data);

    }

}