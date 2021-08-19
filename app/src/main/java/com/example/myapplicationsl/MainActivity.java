package com.example.myapplicationsl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MySQLITE mySQLITE ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySQLITE = new MySQLITE(this);
        TextView butoon = findViewById(R.id.register);
        TextView textView = findViewById(R.id.btn_login);
        final EditText editText = findViewById(R.id.account);
        final EditText editText1 = findViewById(R.id.password);
        TextView t = findViewById(R.id.delete);
        TextView textView1 = findViewById(R.id.upmima);


        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DeleteActivity.class);
                startActivity(intent);
            }
        });
//        final TextView textView1 = findViewById(R.id.show);
        butoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ReActivity.class);
                startActivity(intent);
            }
        });

//        textView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,UpActivity.class);
//                startActivity(intent);
//            }
//        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AccountManage accountManage = new AccountManage();
                accountManage.qury(MainActivity.this,editText.getText().toString().trim(),editText1.getText().toString().trim());
//                Cursor cursor = db.query("infomor",null,null,null,null,null,null,null);
//                while (cursor.moveToNext()){
//                    String x = cursor.getString(cursor.getColumnIndex("name"));
//                    String y = cursor.getString(cursor.getColumnIndex("password"));
//                    if(editText.getText().toString().trim().equals(x) && editText1.getText().toString().trim().equals(y)){
//                        Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
//                    }else {
//                        Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,UpActivity.class);
                startActivity(intent);
            }
        });
//        SQLiteDatabase db;
//        db.beginTransaction(); 开启数据事务
//        db.setTransactionSuccessful(); 设置事务标志为成功，当事务结束时，提交事务
//        db.endTransaction(); 关闭事务
    }
}
