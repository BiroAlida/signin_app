package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et, et2; // et -> a First Name beiras mezojenek valtozoja, et2 -> Last Name
    String firstName, lastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


        et = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);

        Button button_signin=findViewById(R.id.button);

        button_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);

                firstName = et.getText().toString();
                intent.putExtra("First Name", firstName);


                lastName = et2.getText().toString();
                intent.putExtra("Last Name", lastName);


                startActivity(intent);
                finish();
            }
        });

    }

}
