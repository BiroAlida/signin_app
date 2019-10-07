package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {



    String firstName, lastName, department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        if(getIntent().getStringExtra("UserDepartment") == null)
        {
            firstName = getIntent().getExtras().getString("First Name");
            TextView tv = findViewById(R.id.textView);
            tv.setText(firstName);
            lastName = getIntent().getExtras().getString("Last Name");
            TextView tv2 = findViewById(R.id.textView2);
            tv2.setText(lastName);

        }
        else{
            firstName = getIntent().getExtras().getString("Value");
            TextView tv = findViewById(R.id.textView);
            tv.setText(firstName);
            lastName = getIntent().getExtras().getString("UserLastName");
            TextView tv2 = findViewById(R.id.textView2);
            tv2.setText(lastName);
            department = getIntent().getExtras().getString("UserDepartment");
             TextView tv3 = findViewById(R.id.textView3);
             tv3.setText(department);
             Intent i = new Intent();
             i.putExtra("result", firstName + department );
             setResult(Activity.RESULT_OK, i);
             //finish();

        }




    }
}
