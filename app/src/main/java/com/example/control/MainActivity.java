package com.example.control;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
{
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.selection);
        // Khởi tạo dữ liệu cho mảng arr(còn gọi là data source)
        final String arr1[]= {"Iphone 15 promax", "Samsung Galaxy S25 Ultra", "Huawei Mate 90pro", "Iphone 15", "Samsung Galaxy S25", "Samsung Z-Fold 5", "Samsung Z-Flip 5"};
        // Khai báo Adapter và gán Data source vào ArrayAdapter
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr1);
        // Khai báo listview và đưa adapter vào listview
        ListView lv1 = findViewById(R.id.lv1);
        lv1.setAdapter(adapter1);
        // Viet su kien Click vao 1 dong tren listview
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int i, long arg3)
            {
                txt1.setText("Vi tri"+(i+1)+":"+ arr1[i]);
            }
        });
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
    }
}