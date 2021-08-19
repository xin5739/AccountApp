package com.example.myapplicationsl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

public class AccountManage {
    //查询数据库的内容
   public void qury (Context context,String id,String password){
       MySQLITE mySQLITE = new MySQLITE(context);
       SQLiteDatabase db = mySQLITE.getReadableDatabase();
       Cursor cursor = db.query("infomor", null, "name = ? and password= ? ", new String[]{id, password}, null, null, null);
           if (cursor.getCount() > 0) {
               Toast.makeText(context, "登录成功", Toast.LENGTH_SHORT).show();
           }else{
               Toast.makeText(context, "登录失败", Toast.LENGTH_SHORT).show();
       }
   }
   //插入数据
   public void insert(Context context,String id, String password){
       MySQLITE mySQLITE = new MySQLITE(context);
       SQLiteDatabase db = mySQLITE.getWritableDatabase();
       ContentValues values = new ContentValues();
       values.put("name",id);
       values.put("password",password);
       db.insert("infomor",null,values);
       db.close();
   }
   //更新数据(以修改密码为例)
    public void update(Context context , String id ,String password){
        MySQLITE mySQLITE = new MySQLITE(context);
        Log.d("aaaaa", "update: "+ id+" "+ password);
        SQLiteDatabase db = mySQLITE.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("password",password);
        db.update("infomor",values,"name=?",new String[]{id});
        Toast.makeText(context, "修改成功", Toast.LENGTH_SHORT).show();
        db.close();
    }
   //删除数据(以账户为删除条件)
    public void delete(Context context , String id ){
        MySQLITE mySQLITE = new MySQLITE(context);
        SQLiteDatabase db = mySQLITE.getWritableDatabase();
        db.delete("infomor","name = ?",new String[]{id});
        Toast.makeText(context,"删除成功",Toast.LENGTH_SHORT).show();
        db.close();
    }

}
