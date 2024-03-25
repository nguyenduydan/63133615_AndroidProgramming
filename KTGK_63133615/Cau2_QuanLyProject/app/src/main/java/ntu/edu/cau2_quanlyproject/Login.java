package ntu.edu.cau2_quanlyproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button btn_login;
    EditText edtName,edtPwd;

    void FindId(){
        btn_login = (Button) findViewById(R.id.btn_login);
        edtName = (EditText) findViewById(R.id.edt_username);
        edtPwd = (EditText) findViewById(R.id.edt_pwd);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        FindId();
        Login();
    }

    public void Login(){

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtName.getText().toString().equals("admin") && edtPwd.getText().toString().equals("admin")){
                    Toast.makeText(Login.this, "Đăng nhập thành công!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Login.this, "Đăng nhập không thành công!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}