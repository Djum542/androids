package com.example.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private BeerExcrept excrept = new BeerExcrept();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickFindBeer(View view){
        TextView brand = (TextView) findViewById(R.id.text);
        // lay gia trij cuar spiner
        Spinner color = (Spinner) findViewById(R.id.spiner);
        //
        String beerType = String.valueOf(color.getSelectedItem());
        //
//        brand.setText(beerType);
        // lấy dữ liệu từ beerExcrept
        List<String> brandsList = excrept.getBrand(beerType);
        // đưa ra một chuỗi sử dụng giá trị từ danh sách
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brands : brandsList){
            brandsFormatted.append(brands).append("/n");
            // hiển thị xuống dòng
        }
        // quy tắc cho hiên thị chữ
        brand.setText(brandsFormatted);
    }
}