package com.example.myapplicationsl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DeleteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deletelayout);
        final EditText editText = findViewById(R.id.edit_zhanghao22);
        Button button = findViewById(R.id.but22);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AccountManage accountManage = new AccountManage();
                accountManage.delete(DeleteActivity.this,editText.getText().toString().trim());
            }
        });

    }
}
