package com.java.messanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiMesage extends AppCompatActivity {
// giá trị extra đưa cho intent
    public static final String EXTRA_MESSAGE = "mesage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recei_mesage);
        Intent intent = getIntent();
        String mesageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView mesageView = (TextView) findViewById(R.id.message);
        mesageView.setText(mesageText);
        // thêm một text từ message textview
    }
}