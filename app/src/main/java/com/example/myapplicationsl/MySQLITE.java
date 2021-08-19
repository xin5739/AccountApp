package com.example.myapplicationsl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLITE extends SQLiteOpenHelper {
    public MySQLITE(@Nullable Context context) {
        super(context, "item.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE info (_id INTEGER PRIMARY KEY AUTOINCREMENT ,name VARCHAR(20) ,phone VARCHAR(20))");
        db.execSQL("CREATE TABLE infomor (_id INTEGER PRIMARY KEY AUTOINCREMENT ,name INTEGER , password INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
