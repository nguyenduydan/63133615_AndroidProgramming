package ntu.edu.ex_sqllite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        //step 1: Create database -- Chỉ dùng lần đầu
            SQLiteDatabase db;
           db = openOrCreateDatabase("QLSach.db", MODE_PRIVATE,  null);
//
//        // run test and see if  csdl has been created?
//        //Step 2: create table
//        String sqlDelTablehad ="DROP TABLE IF EXISTS Books;";
//        db.execSQL(sqlDelTablehad); //execSQL is queries to table
//        String BOOK =  "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
//                "BookName text, " +
//                "Page integer, " +
//                "Price Float, " +
//                "Description text);";
//        db.execSQL(BOOK);
//        String sqlThem1 = "INSERT INTO Books VALUES(1, 'Java', 100, 9.99, 'sách về java');";
//        String sqlThem2 = "INSERT INTO Books VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');";
//        String sqlThem3 = "INSERT INTO Books VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc cho vui');";
//        String sqlThem4 = "INSERT INTO Books VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ');";
//        String sqlThem5 = "INSERT INTO Books VALUES(5, 'CNXH', 1, 1, 'chuyện cổ tích');";
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);
//        db.execSQL(sqlThem3);
//        db.execSQL(sqlThem4);
//        db.execSQL(sqlThem5);
//        // Để quan sát trực quan file .db ? ==> Dùng ứng dụng DB Browser for SQLite
//        // Để mở được, ta file save file từ điện thoại ra đĩa cứng
//
//        // Ta đóng lại để check
//        db.close();

        // Truy vấn
        //B2: thực hiện câu lệnh truy vấn
        String sqlSelect ="Select * from Books;";
        Cursor cs = db.rawQuery(sqlSelect,null);
        cs.moveToFirst(); // đưa con trỏ bản ghi về hang đầu tiên
        //B3: Đổ vào biến nào đó để xử lý
            //3.1 Xây dựng model/class cho bảng Book, ví dụ Book.java
            //3.2 Tạo biến ArrayList<Book> dsSach;
        ArrayList<Book> dsSach = new ArrayList<Book>();
        while (cs.moveToNext()) // còn bản ghi để chuyển tới
        {
            // Lấy dữ liệu từng côột ở dòng hiện tại
            int idSach = cs.getInt(0);  // lấy dữ liệu ở côt 0, kiểu int
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            // Tạo một đối tượng sách và thêm vào danh sách
            Book b = new Book(idSach,tenSach,soTrang,gia,mota);
            dsSach.add(b);
        }

    }
}