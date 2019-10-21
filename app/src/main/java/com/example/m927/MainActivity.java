package com.example.m927;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bbb;
    boolean ClickTime = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbb = (Button) findViewById(R.id.B_login);


    }

    public void buttonClick(View view) {
        Toast toast = Toast.makeText(this, R.string.ButtonOnClickMessage, Toast.LENGTH_SHORT);
        toast.show();
        if(ClickTime==true) {
            bbb.setText(R.string.logoutMessage);
            ClickTime=false;
        }
        else {
            bbb.setText(R.string.buttonText);
            ClickTime=true;
        }
    }
}
