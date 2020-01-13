package com.example.practicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class neet2alert extends AppCompatActivity {
    CheckBox checkBox;
    Button startButton;
    TextView wish;
    EditText name;
    public static String Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet2alert);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        startButton=(Button)findViewById(R.id.startbutton);
        wish=(TextView) findViewById(R.id.wish);
        name=(EditText)findViewById(R.id.name);
        wish.setVisibility(View.INVISIBLE);




    }

    public void start(View view) {
        Name=name.getText().toString();
        wish.setVisibility(View.VISIBLE);
        if(checkBox.isChecked()&&!Name.isEmpty()) {
            Intent in = new Intent(neet2alert.this, neetest2.class);
            neet2alert.this.finish();
            startActivity(in);
        }
        else
            Toast.makeText(neet2alert.this,"Enter your name and agree to continue to test",Toast.LENGTH_SHORT).show();
    }
}
