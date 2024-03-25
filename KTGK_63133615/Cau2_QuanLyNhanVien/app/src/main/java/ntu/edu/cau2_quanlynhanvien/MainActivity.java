package ntu.edu.cau2_quanlynhanvien;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    Button btn_add, btn_del, btn_edit;
    TableLayout tableLayout;
    EditText edt_hoten,edt_ngaysinh;
    Spinner chucvu;
    RadioGroup gioitinh;
    void FindID(){
        btn_add = (Button) findViewById(R.id.btn_them);
        btn_edit = (Button) findViewById(R.id.btn_sua);
        btn_del = (Button) findViewById(R.id.btn_xoa);
        chucvu = (Spinner) findViewById(R.id.spinner);
        edt_hoten = (EditText) findViewById(R.id.edt_name);
        edt_ngaysinh = (EditText) findViewById(R.id.edt_ngaysinh);
        tableLayout = (TableLayout) findViewById(R.id.tablelayout);
        gioitinh = (RadioGroup) findViewById(R.id.radioGroup);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        FindID();
        ShowChuvu();
        Control();
    }

    public void Control(){
        TableRow row = new TableRow(this);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msnv = generateMSNV();
                String hoten = edt_hoten.getText().toString();
                String ngaysinh = edt_ngaysinh.getText().toString();
                String chucVu = chucvu.getSelectedItem().toString();
                String gender = "";
                // Lấy ID của RadioButton được chọn từ RadioGroup
                int selectedRadioButtonId = gioitinh.getCheckedRadioButtonId();
                // Kiểm tra xem RadioButton nào được chọn
                if (selectedRadioButtonId != -1) {
                    // Tìm RadioButton được chọn bằng ID
                    RadioButton radioButton = findViewById(selectedRadioButtonId);

                    // Lấy giới tính từ RadioButton và hiển thị thông báo
                    gender = radioButton.getText().toString();
                }

                // Tạo một TableRow mới
                TableRow row = new TableRow(MainActivity.this);
                // Tạo các TextView chứa dữ liệu
                TextView tvMSNV = new TextView(MainActivity.this);
                tvMSNV.setText(msnv);
                tvMSNV.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                tvMSNV.setPadding(8, 8, 8, 8);
                row.addView(tvMSNV);

                TextView tvHoTen = new TextView(MainActivity.this);
                tvHoTen.setText(hoten);
                tvHoTen.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                tvHoTen.setPadding(8, 8, 8, 8);
                row.addView(tvHoTen);

                TextView tvGioiTinh = new TextView(MainActivity.this);
                tvGioiTinh.setText(gender);
                tvGioiTinh.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                tvGioiTinh.setPadding(8, 8, 8, 8);
                row.addView(tvGioiTinh);

                TextView tvTuoi = new TextView(MainActivity.this);
                tvTuoi.setText(ngaysinh);
                tvTuoi.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                tvTuoi.setPadding(8, 8, 8, 8);
                row.addView(tvTuoi);

                // Thêm TableRow vào TableLayout
                tableLayout.addView(row);

                edt_hoten.setText("");
                edt_ngaysinh.setText("");
            }

        });
    }

    public void ShowChuvu(){
        List<String> chucvuList = new ArrayList<>();
        chucvuList.add("Nhân viên");
        chucvuList.add("Giám đốc");
        chucvuList.add("Phó giám đốc");

        // Tạo ArrayAdapter cho Spinner chucvu
        ArrayAdapter<String> chucvuAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, chucvuList);

        // Thiết lập kiểu dropdown cho Spinner
        chucvuAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Thiết lập ArrayAdapter cho Spinner chucvu
        chucvu.setAdapter(chucvuAdapter);
    }


    public static String generateMSNV() {
        // Lấy thời gian hiện tại
        long timestamp = System.currentTimeMillis();

        // Chuyển đổi thời gian thành chuỗi
        String dateString = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(timestamp));

        // Tạo MSNV từ chuỗi thời gian
        String msnv = "NV" + dateString.substring(0, 9);

        return msnv;
    }

}