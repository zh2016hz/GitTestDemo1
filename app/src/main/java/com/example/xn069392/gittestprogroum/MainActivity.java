package com.example.xn069392.gittestprogroum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    }
}
