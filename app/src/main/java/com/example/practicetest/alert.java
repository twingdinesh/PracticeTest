package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class alert extends AppCompatActivity {

    CheckBox checkBox;
    Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        startButton=(Button)findViewById(R.id.startbutton);


    }

    public void start(View view) {
        if(checkBox.isChecked()) {
            Intent in = new Intent(alert.this, MainActivity.class);
            alert.this.finish();
            startActivity(in);
        }
        else
            Toast.makeText(alert.this,"agree to continue to test",Toast.LENGTH_SHORT).show();
    }
}
