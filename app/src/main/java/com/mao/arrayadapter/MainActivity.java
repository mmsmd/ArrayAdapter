package com.mao.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] objects={"功能1","功能2","功能3","功能4","功能5","功能6","功能7","功能8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv=(ListView)findViewById(R.id.lv_array);

        /*
        * 1、context：上下文
        *
        * 2、textViewResourceId：textView资源
        *
        * 3、list对象或数组*/
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,R.layout.my_textview,objects);
        lv.setAdapter(arrayAdapter);
    }

}
