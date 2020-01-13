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

public class jadvalert2 extends AppCompatActivity {
    CheckBox checkBox;
    Button startButton;
    TextView wish;
    EditText name;
    public static String Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadvalert2);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        startButton=(Button)findViewById(R.id.startbutton);
        name=(EditText)findViewById(R.id.name);
        wish=(TextView) findViewById(R.id.wish);
        wish.setVisibility(View.INVISIBLE);




    }

    public void start(View view) {
        Name=name.getText().toString();
        wish.setVisibility(View.VISIBLE);
        if(checkBox.isChecked()&&!Name.isEmpty()) {
            Intent in = new Intent(jadvalert2.this, jadv2.class);
            jadvalert2.this.finish();
            startActivity(in);
        }
        else
            Toast.makeText(jadvalert2.this,"Enter name and agree to continue to test",Toast.LENGTH_SHORT).show();
    }
}
