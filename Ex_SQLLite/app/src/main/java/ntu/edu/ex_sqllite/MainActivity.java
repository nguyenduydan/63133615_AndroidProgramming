package ntu.edu.ex_sqllite;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

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
       //step 1: Create database
        SQLiteDatabase dbBook;
        dbBook = openOrCreateDatabase("QLSach", MODE_PRIVATE,  null);

        // run test and see if  csdl has been created?
        //Step 2: create table
        String sqlDelTablehad ="DROP TABLE IF EXISTS Books;";
        dbBook.execSQL(sqlDelTablehad); //execSQL is queries to table
        String BOOK = "CREATE TABLE BOOKS (id integer PRIMARY KEY,"" );";
        dbBook.execSQL(BOOK);

    }
}