package com.example.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.editTextname);
        EditText age = findViewById(R.id.editTextage);
        Button next = findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = name.getText().toString();
                String b = age.getText().toString();

                if (a.equals("") || b.equals("")) {
                    Context context = getApplicationContext();
                    CharSequence text = "please enter data";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else{

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", a);
                intent.putExtra("age", b);
                startActivity(intent);}
            }
        });

        ImageButton call = findViewById(R.id.callButton);
        ImageButton email = findViewById(R.id.emailButton);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",
                        "234234312", null));
                startActivity(intent2);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Intent.ACTION_SENDTO);
                intent3.setData(Uri.parse("mailto:"));
                intent3.putExtra(Intent.EXTRA_EMAIL, "Airways@Android.kw");
                startActivity(Intent.createChooser(intent3,"Gmail"));
            }
        });
    }
}