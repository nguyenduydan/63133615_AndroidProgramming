package ntu.edu.cau2_quanlyproject;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button btn_login;
    ImageButton btn_showPwd;
    EditText edtName,edtPwd;

    void FindId(){
        btn_login = (Button) findViewById(R.id.btn_login);
        edtName = (EditText) findViewById(R.id.edt_username);
        edtPwd = (EditText) findViewById(R.id.edt_pwd);
        btn_showPwd = (ImageButton) findViewById(R.id.btn_showPwd);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        FindId();
        Login();
        showPwd();
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

    public void showPwd(){
        btn_showPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lưu trữ các thuộc tính hiện tại của EditText
                int inputType = edtPwd.getInputType();
                int textSize = (int) edtPwd.getTextSize();
                int textColor = edtPwd.getCurrentTextColor();
                Typeface typeface = edtPwd.getTypeface();
                // Lưu trữ vị trí con trỏ
                int cursorPosition = edtPwd.getSelectionStart();

                // Thay đổi kiểu hiển thị của EditText
                if ((inputType & InputType.TYPE_TEXT_VARIATION_PASSWORD) == InputType.TYPE_TEXT_VARIATION_PASSWORD) {
                    // Nếu đang ở chế độ mật khẩu, chuyển sang chế độ text thường
                    edtPwd.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
                } else {
                    // Nếu đang ở chế độ text thường, chuyển sang chế độ mật khẩu
                    edtPwd.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }

                // Thiết lập lại các thuộc tính sau khi thay đổi
                edtPwd.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
                edtPwd.setTextColor(textColor);
                edtPwd.setTypeface(typeface);

                // Thiết lập lại vị trí con trỏ
                edtPwd.setSelection(cursorPosition);
            }
        });
    }


}