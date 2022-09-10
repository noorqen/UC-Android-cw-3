package com.example.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String age = bundle.getString("age");

        TextView toviewname = findViewById(R.id.viewname);
        TextView toviewage = findViewById(R.id.viewage);

        toviewname.setText(name);
        toviewage.setText(age);

    }
}