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

public class neet4alert extends AppCompatActivity {

    CheckBox checkBox;
    Button startButton;
    TextView wish;
    EditText name;
    public static String Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet4alert);
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
            Intent in = new Intent(neet4alert.this,neettest5.class);
            neet4alert.this.finish();
            startActivity(in);
        }
        else
            Toast.makeText(neet4alert.this,"Enter your name and agree to continue to test",Toast.LENGTH_SHORT).show();

    }
}
