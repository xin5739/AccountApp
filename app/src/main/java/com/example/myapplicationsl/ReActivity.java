package com.example.myapplicationsl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReActivity extends AppCompatActivity {
    boolean x = false;
    MySQLITE mySQLITE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relayout);
        final EditText editAccount = findViewById(R.id.edit_account);
        final EditText editPassword = findViewById(R.id.edit_password);
        final EditText editPasswordConfirm = findViewById(R.id.edit_password_confirm);
        final EditText editname = findViewById(R.id.edit_name);
        final TextView textView = findViewById(R.id.btn_register);
        mySQLITE = new MySQLITE(this);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init();
                String id = editAccount.getText().toString().trim();
                String name = editname.getText().toString().trim();
                String password = editPassword.getText().toString().trim();
               AccountManage accountManage = new AccountManage();
               accountManage.insert(ReActivity.this,id,password);
                if(x==true){
                    finish();
                }
            }
        });
    }

    public void init(){
        final EditText editAccount = findViewById(R.id.edit_account);
        final EditText editPassword = findViewById(R.id.edit_password);
        final EditText editPasswordConfirm = findViewById(R.id.edit_password_confirm);
        final EditText editname = findViewById(R.id.edit_name);
        if(TextUtils.isEmpty(editAccount.getText().toString())){
            Toast.makeText(this,"请输入id",Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(editname.getText().toString())){
            Toast.makeText(this,"请输入匿名",Toast.LENGTH_SHORT).show();
        }
        if (TextUtils.isEmpty(editPassword.getText().toString())){
            Toast.makeText(this,"请输入密码",Toast.LENGTH_SHORT).show();
        }
        if(editPassword.getText().toString().equals(editPasswordConfirm.getText().toString())){
            Toast.makeText(this,"注册成功",Toast.LENGTH_SHORT).show();
            x = true;
        }else {
            Toast.makeText(this,"密码不符合错误",Toast.LENGTH_SHORT).show();
        }
    }

}