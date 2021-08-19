package com.example.myapplicationsl;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UpActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uplayout);
        final EditText editText2 = findViewById(R.id.edit_zhanghao);
        final EditText editText = findViewById(R.id.edit_up);
        Button button = findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AccountManage accountManage = new AccountManage();
                accountManage.update(UpActivity.this,editText2.getText().toString().trim(),editText.getText().toString().trim());
            }
        });
    }
}
