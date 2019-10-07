package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText et, et2,et3;
    String firstName, lastName, department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et = findViewById(R.id.editText4);
        et2 = findViewById(R.id.editText6);
        et3 = findViewById(R.id.editText5);

        Button button3=findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, ProfileActivity.class);

                firstName = et.getText().toString();
                intent.putExtra("Value", firstName);


                lastName = et2.getText().toString();
                intent.putExtra("UserLastName", lastName);

                department = et3.getText().toString();
                intent.putExtra("UserDepartment",department);

                startActivityForResult(intent,1);
                finish();
            }


        });

        String mondat = getIntent().getStringExtra("result");
        TextView text = findViewById(R.id.textView_result);
        text.setText(mondat);

    }
}
