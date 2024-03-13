package android.edu.ex_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTinhThanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //B1: Cần có dữ liệu

        dsTinhThanh = new ArrayList<String>();
        //Thêm dũ liệu
        dsTinhThanh.add("Hà Nội");
        dsTinhThanh.add("Khánh Hòa");
        dsTinhThanh.add("Phú Yên");
        dsTinhThanh.add("Bình Thuận");

        // B2. Tạo adapter
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTinhThanh);

        // B3. Gắn vào điều khiển hiển thị ListView
        //3.1 Tìm
        ListView lvTenTinhThanh = (ListView) findViewById(R.id.list_item);
        //3.2 Gắn
        lvTenTinhThanh.setAdapter(adapter);
        //3.3 Lắng nghe và xử lý sự kiện user tương tác
        //Gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    //Tạo bộ lắng nghe và xử lý sự kiện OnItemClick, đặt vào một biến
    //vd: BoLangNghevaXL

    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Code xử lý ở đây
            // i là vị trí phần tử vừa được Click
            //ví dụ xử lý ở đây, là hiện lên màn hình một thông báo nhanh về vị trí của phần tử vừa chọn
            //Lấy giá trị
            String strTenTinhThanh = dsTinhThanh.get(i);
            Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + strTenTinhThanh, Toast.LENGTH_LONG).show();

        }
    };

}