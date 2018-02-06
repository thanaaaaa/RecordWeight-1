package masterung.androidthai.in.th.recordweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import masterung.androidthai.in.th.recordweight.utility.MyManager;

public class MainActivity extends AppCompatActivity {

    private MyManager myManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManager = new MyManager(MainActivity.this);

//        Test Add User
        myManager.addValueToUserTABLE("nick" , "start" ,
                "weight" , "height" , "gender" ,
                "age");


    }   // Main Method

}   // Main Class
