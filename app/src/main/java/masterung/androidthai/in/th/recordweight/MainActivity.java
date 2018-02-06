package masterung.androidthai.in.th.recordweight;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import masterung.androidthai.in.th.recordweight.utility.MyManager;
import masterung.androidthai.in.th.recordweight.utility.MyOpenHelperSQLite;

public class MainActivity extends AppCompatActivity {

    private MyManager myManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManager = new MyManager(MainActivity.this);

//        Test Add User
//        testAddUser();


//        Delete All userTABLE
        deleteAllUserTABLE();


    }   // Main Method

    private void deleteAllUserTABLE() {
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelperSQLite.databaseName ,
                MODE_PRIVATE , null);
        sqLiteDatabase.delete("userTABLE" , null , null);
    }

    private void testAddUser() {
        myManager.addValueToUserTABLE("nick" , "start" ,
                "weight" , "height" , "gender" ,
                "age");
    }

}   // Main Class
