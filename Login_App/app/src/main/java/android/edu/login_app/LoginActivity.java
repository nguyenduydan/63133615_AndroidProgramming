package android.edu.login_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText txt_user, txt_pass;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        txt_user = (EditText) findViewById(R.id.username);
        txt_pass = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btn_login);
        register = (Button) findViewById(R.id.btn_signup);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_user.getText().toString().equals("admin") && txt_pass.getText().toString().equals("admin")) {
                    Toast.makeText(LoginActivity.this, "Đăng nhập thành công!", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(LoginActivity.this, "Đăng nhập không thành công!",Toast.LENGTH_LONG).show();
                }
            }
        });
        chuyenManHinh();
    }

    public void chuyenManHinh(){
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iregister = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(iregister);
            }
        });
    }

}