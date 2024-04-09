package ntu.edu.bt_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //3.Chuẩn bị dữ liệu cho landScapeList
        recyclerViewDatas = getDataForRecyclerView();
        //4. Tìm điều khiển Recycler
        //5. Tạo layout manager để đặt bố cục cho Recycler
        //6. Tạo adapter gắn với nguồn dữ liệu
        //7. Gắn adapter với Recycler

    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsData = new ArrayList<>();
        LandScape landScape = new LandScape("1","Ảnh đẹp 4k - ảnh nên máy tính");
        dsData.add(landScape);
        dsData.add(new LandScape("2","Ảnh đẹp 4k - ảnh nên máy tính"));
        dsData.add(new LandScape("3","Ảnh đẹp 4k - ảnh nên máy tính"));
        dsData.add(new LandScape("4","Ảnh đẹp 4k - ảnh nên máy tính"));
        return dsData;
    }
}