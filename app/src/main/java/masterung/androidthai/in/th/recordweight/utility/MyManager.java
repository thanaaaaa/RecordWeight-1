package masterung.androidthai.in.th.recordweight.utility;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterung on 30/1/2018 AD.
 */

public class MyManager {

    private Context context;
    private MyOpenHelperSQLite myOpenHelperSQLite;
    private SQLiteDatabase sqLiteDatabase;

    public MyManager(Context context) {
        this.context = context;

        myOpenHelperSQLite = new MyOpenHelperSQLite(context);
        sqLiteDatabase = myOpenHelperSQLite.getWritableDatabase();


    }   // Constructor

    //    Add Value to userTABLE
    public long addValueToUserTABLE(String nickNameString,
                                    String startAppString,
                                    String weightString,
                                    String heightString,
                                    String genderString,
                                    String ageString) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("NickName",nickNameString );
        contentValues.put("StartApp",startAppString );
        contentValues.put("Weight",weightString );
        contentValues.put("Height",heightString );
        contentValues.put("Gender",genderString );
        contentValues.put("Age",ageString );

        return sqLiteDatabase.insert("userTABLE" , null , contentValues);





    }


}   // Main Class
