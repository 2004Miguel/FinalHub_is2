package com.miguel.final_is2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLOpenHelper extends SQLiteOpenHelper {

    public AdminSQLOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE admin(usuario text primary key,password text)");
        String usuario ="admin";
        String password ="12345";
        ContentValues datosAdmin = new ContentValues();
        datosAdmin.put("usuario",usuario);
        datosAdmin.put("password",password);
        db.insert("admin","(usuario,password)",datosAdmin);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}


