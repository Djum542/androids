package com.java.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// khởi tạo sự kiện
//    TextView text = this.findViewById(R.id.mess);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //sử lý sự kiện khi người dùng nhấn  click
    public void onsendmessage(View view){
        EditText mesageView = (EditText) findViewById(R.id.message);
        String mesageText = mesageView.getText().toString();
//      intent.putExtra("mesage", mesageText);
        Intent intent = new Intent(this, ReceiMesage.class);
        intent.putExtra(ReceiMesage.EXTRA_MESSAGE, mesageText);
        startActivity(intent);
        // lấy chuỗi qua intent .
//        Intent intent1 = getIntent();
//        String string = intent1.getStringExtra("mesage");
//        int intNum = intent.getIntExtra("name", text);
    }
}