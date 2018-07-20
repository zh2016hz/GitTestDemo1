package com.example.xn069392.gittestprogroum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  viewById = (Button) findViewById(R.id.bt_1);
        Button  viewById2 = (Button) findViewById(R.id.bt_2);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"!!!!!!!!!!!",Toast.LENGTH_LONG).show();
            }
        });
        viewById2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"!!!!!!!!!!!",Toast.LENGTH_LONG).show();
            }
        });
        viewById2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"XXXXXXXX",Toast.LENGTH_LONG).show();
            }
        });
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("name","服从你");
        viewById2.setText(stringStringHashMap.get("name"));
        String  sss = "少时诵诗书所所所所";

        String s = new String();
        Log.e("shabig", "onCreate: "+"cao尼玛" );
        s+= sss;

    }
}
