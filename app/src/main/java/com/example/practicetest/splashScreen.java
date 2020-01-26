package com.example.practicetest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class splashScreen<userpin> extends AppCompatActivity {

    Animation animation,alpha,round;
    Button button;
    TextView txt1,txt2,txt3,txt4;
    int pin=1221,userpin;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        button=(Button)findViewById(R.id.button);
        txt2=(TextView)findViewById(R.id.text1);
        txt3=(TextView)findViewById(R.id.text2);
        txt1=(TextView)findViewById(R.id.text3);
        txt4=(TextView)findViewById(R.id.text4);
        sharedPreferences=getSharedPreferences("share",MODE_PRIVATE);
        alpha=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
        round=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.round);
        txt1.setAnimation(alpha);
        txt2.setAnimation(alpha);
        txt3.setAnimation(alpha);
        txt4.setAnimation(alpha);
        button.setAnimation(round);
        userpin=sharedPreferences.getInt("pin",0);
    }
        public void open(View view) {
            if (pin != userpin) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Enter pin");

                final EditText input = new EditText(splashScreen.this);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                builder.setView(input);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        userpin = Integer.parseInt(input.getText().toString());

                        if (Integer.parseInt(input.getText().toString()) == pin) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putInt("pin", userpin);
                            edit.commit();
                            startActivity(new Intent(getApplicationContext(), startActivity.class));
                            splashScreen.this.finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "you have enter incorrect pin", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.show();
            } else {
                startActivity(new Intent(getApplicationContext(), startActivity.class));
                splashScreen.this.finish();
            }
        }




}
