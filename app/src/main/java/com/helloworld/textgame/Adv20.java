package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//if player tries to steal treasure
public class Adv20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv20);

        TextView text1 = (TextView) findViewById(R.id.Adv20text1);
        text1.setText(Strings.line25);
        Button button1 = (Button) findViewById(R.id.Adv20button1);
        button1.setText("Fight for your life");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv20.this, Fight10.class));
            }
        });
    }
}
