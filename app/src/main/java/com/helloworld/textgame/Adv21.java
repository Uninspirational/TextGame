package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv21);

        TextView text1 = (TextView) findViewById(R.id.Adv21text1);
        text1.setText(Strings.line26);
        Button button1 = (Button) findViewById(R.id.Adv21button1);
        button1.setText("Start again");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv21.this, StartScreen.class));
            }
        });
    }
}
