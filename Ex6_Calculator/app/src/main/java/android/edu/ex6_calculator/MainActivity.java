package android.edu.ex6_calculator;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Khai báo biến
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    EditText displayText;
    void findControl(){
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        displayText = (EditText) findViewById(R.id.edtResult);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        findControl();

        //Giảm kích thước văn bản khi nhiều kí tự
        displayText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // No need to implement anything here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // No need to implement anything here
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Giới hạn số lượng ký tự
                int maxLength = 12; // Số ký tự tối đa bạn muốn cho phép
                if (s.length() > maxLength) {
                    displayText.setText(s.subSequence(0, maxLength));
                    displayText.setSelection(maxLength);
                }

                // Giảm kích thước văn bản khi chế độ RTL
                float defaultTextSize = 80; // Kích thước văn bản mặc định
                float minTextSize = 50; // Kích thước văn bản tối thiểu
                float textSizeStep = 5.0f; // Bước giảm kích thước văn bản

                if (s.length() > maxLength / 2) {
                    float newSize = defaultTextSize - ((s.length() - maxLength / 2) * textSizeStep);
                    if (newSize < minTextSize) newSize = minTextSize;
                    displayText.setTextSize(newSize);
                } else {
                    displayText.setTextSize(defaultTextSize);
                }
            }
        });

        //Gắn bộ lắng nghe
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumberToDisplay("9");
            }
        });
    }

    // Phương thức để thêm số vào EditText
    private void appendNumberToDisplay(String number) {
        String currentText = displayText.getText().toString();
        if("0".equals(currentText)) //Kiểm tra xem có số 0 ban đầu không
        {
            displayText.setText(number);
        }else {
            displayText.setText(currentText + number);
        }
    }
}