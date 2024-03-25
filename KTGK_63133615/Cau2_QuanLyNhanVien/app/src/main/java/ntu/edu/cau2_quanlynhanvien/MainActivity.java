package ntu.edu.cau2_quanlynhanvien;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private Button btn_add, btn_del, btn_edit;
    private TableLayout tableLayout;
    private EditText edt_hoten;
    private Spinner chucvu;
    private int STT = 0;
    RadioGroup gioitinh;
    private DatePickerDialog datePickerDialog;
    private Button dateButton;

    void FindID(){
        btn_add = (Button) findViewById(R.id.btn_them);
        btn_edit = (Button) findViewById(R.id.btn_sua);
        btn_del = (Button) findViewById(R.id.btn_xoa);
        chucvu = (Spinner) findViewById(R.id.spinner);
        edt_hoten = (EditText) findViewById(R.id.edt_name);
        tableLayout = (TableLayout) findViewById(R.id.tablelayout);
        gioitinh = (RadioGroup) findViewById(R.id.radioGroup);
        dateButton = (Button) findViewById(R.id.ngaysinh);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        FindID();
        ShowChucvu();
        Control();
        initDatePicker();
        dateButton.setText(getTodaysDate());
    }

    public void Control(){
        TableRow row = new TableRow(this);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msnv = generateMSNV();
                String hoten = edt_hoten.getText().toString();
                String gender = "";
                String ngaySinhStr = dateButton.getText().toString(); // Giả sử ngày sinh được chọn từ DatePickerDialog và hiển thị trên button
                int tuoi = tinhTuoi(ngaySinhStr);
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
                tvMSNV.setPadding(10, 8, 10, 8);
                row.addView(tvMSNV);

                TextView tvHoTen = new TextView(MainActivity.this);
                tvHoTen.setText(hoten);
                tvHoTen.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                tvHoTen.setPadding(10, 8, 10, 8);
                row.addView(tvHoTen);

                TextView tvGioiTinh = new TextView(MainActivity.this);
                tvGioiTinh.setText(gender);
                tvGioiTinh.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                tvGioiTinh.setPadding(10, 8, 10, 8);
                row.addView(tvGioiTinh);

                TextView tvTuoi = new TextView(MainActivity.this);
                tvTuoi.setText(String.valueOf(tuoi));
                tvTuoi.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                tvTuoi.setPadding(10, 8, 10, 8);
                row.addView(tvTuoi);


                // Thêm TableRow vào TableLayout
                tableLayout.addView(row);
                edt_hoten.setText("");

            }

        });
    }

    public void ShowChucvu(){
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

    public String generateMSNV() { //Sinh MSNV ngẫu nhiên không trùng
        String chucVu = chucvu.getSelectedItem().toString();
        String[] words = chucVu.split("\\s+"); // Tách chuỗi thành các từ
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.charAt(0)); // Lấy chữ cái đầu của từ
            }
        }
        String chuoiRutGon = result.toString();

        // Tạo MSNV từ chuỗi thời gian
        String msnv = chuoiRutGon + "_" + STT++;
        return msnv;
    }

    // Hàm tính tuổi từ ngày sinh đến ngày hiện tại
    public int tinhTuoi(String ngaySinh) {
        // Chuyển đổi chuỗi ngày sinh thành đối tượng Date
        Calendar ngaySinhCal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Định dạng của chuỗi ngày sinh
        Date dateOfBirth;
        try {
            dateOfBirth = sdf.parse(ngaySinh);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1; // Trả về -1 nếu có lỗi xảy ra
        }

        // Chuyển đổi đối tượng Date thành đối tượng Calendar
        ngaySinhCal.setTime(dateOfBirth);

        // Tính toán tuổi
        Calendar ngayHienTai = Calendar.getInstance();
        int tuoi = ngayHienTai.get(Calendar.YEAR) - ngaySinhCal.get(Calendar.YEAR);

        return tuoi;
    }

    private String getTodaysDate()
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }

    private void initDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener()
        {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day)
            {
                month = month + 1;
                String date = makeDateString(day, month, year);
                dateButton.setText(date);
            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_DEVICE_DEFAULT_DARK;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);
    }

    private String makeDateString(int day, int month, int year)
    {
        return day + "/"  +month+  "/" + year;
    }

    public void openDatePiker(View view) {
        datePickerDialog.show();
    }
}