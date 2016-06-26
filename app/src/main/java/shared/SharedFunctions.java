package shared;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by SACHIN on 25-Jun-16.
 */
public class SharedFunctions {

    private static SharedFunctions sharedFunctions;

    public static SharedFunctions getInstance(){

      if(sharedFunctions == null)

          sharedFunctions = new SharedFunctions();

       return sharedFunctions;

    }

    public void writeSP(Context context,String value){

        SharedPreferences sharedPreferences = context.getSharedPreferences("My_File",Context.MODE_PRIVATE);

        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("key",value);
        edit.commit();

    }

    public String getSP(Context context,String key){

        SharedPreferences sharedPreferences = context.getSharedPreferences("My_File",Context.MODE_PRIVATE);
        return  sharedPreferences.getString(key,"");

    }
}
