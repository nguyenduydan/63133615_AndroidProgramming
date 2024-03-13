package android.edu.dsmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsMonAn;
    ArrayAdapter<String> adapter_MonAn;
    ListView lvMonAn;
    EditText edtName;
    Button btn_Add, btn_Del, btn_Edit;
    void findControl(){
        dsMonAn = new ArrayList<String>();
        lvMonAn = (ListView) findViewById(R.id.list_item);
        edtName = (EditText) findViewById(R.id.edtName);
        btn_Add = (Button) findViewById(R.id.btnAdd);
        btn_Del = (Button) findViewById(R.id.btnDel);
        btn_Edit = (Button) findViewById(R.id.btnEdit);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        findControl();
        CreateAdapter();
        setOnClick();
    }

    void CreateAdapter(){
        adapter_MonAn = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsMonAn);
        lvMonAn = (ListView) findViewById(R.id.list_item);
        lvMonAn.setAdapter(adapter_MonAn);
    }

    void setOnClick(){
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_NameMonAn = edtName.getText().toString();
                if(!str_NameMonAn.equals("")){
                    Toast.makeText(MainActivity.this, "Bạn vừa thêm: " + str_NameMonAn , Toast.LENGTH_LONG).show();
                    dsMonAn.add(str_NameMonAn);
                    adapter_MonAn.notifyDataSetChanged();
                    edtName.setText("");
                }else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập giá trị!", Toast.LENGTH_LONG).show();
                }
            }
        });

        // Bắt sự kiện
        lvMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtName.setText(dsMonAn.get(position));
            }
        });

    }
}