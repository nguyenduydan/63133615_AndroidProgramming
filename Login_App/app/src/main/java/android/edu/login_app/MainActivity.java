package android.edu.login_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        EditText txt_user, txt_pass;
        Button login;

        txt_user = (EditText) findViewById(R.id.username);
        txt_pass = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_user.getText().toString().equals("admin") && txt_pass.getText().toString().equals("admin"))
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công!",Toast.LENGTH_LONG).show();
                else {
                    Toast.makeText(MainActivity.this, "Đăng nhập không thành công!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}