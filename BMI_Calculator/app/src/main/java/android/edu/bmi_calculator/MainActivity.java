package android.edu.bmi_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnResult,btnReset;
    EditText edt_Weight, edt_Height;
    EditText txtResult;

    void findControl(){
        btnResult = (Button) findViewById(R.id.btnResult);
        edt_Height = (EditText) findViewById(R.id.edtHeight);
        edt_Weight = (EditText) findViewById(R.id.edtWeight);
        txtResult = (EditText) findViewById(R.id.txtResult);
        btnReset = (Button) findViewById(R.id.btnReset);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        findControl();
        cal_BMI();
        setBtnReset();
    }

    public void cal_BMI(){
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value_Weight = edt_Weight.getText().toString();
                String value_Height = edt_Height.getText().toString();
                Double num_Weight = Double.parseDouble(value_Weight);
                Double num_Height = Double.parseDouble(value_Height);
                Double result;
                result = num_Weight/(num_Height * num_Height);
                result = (double)Math.round(result * 10) / 10;
                if(result < 18.5){
                    txtResult.setText(String.valueOf(result) + " --> " + "Nhẹ cân" );
                }else if(result < 22.9){
                    txtResult.setText(String.valueOf(result) + " --> " + "Bình thường" );
                } else if (result < 24.9) {
                    txtResult.setText(String.valueOf(result) + " --> " + "Thừa cân" );
                }else {
                    txtResult.setText(String.valueOf(result) + " --> " + "Béo phì" );
                }
            }
        });
    }

    void setBtnReset(){
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
                edt_Height.setText("");
                edt_Weight.setText("");
            }
        });
    }
}