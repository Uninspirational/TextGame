package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//this runs if you choose to leave the city
public class Adv11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv11);

        TextView text1 = (TextView) findViewById(R.id.Adv11text1);
        text1.setText(Strings.line14);

        Button button1 = (Button) findViewById(R.id.Adv11button1);
        button1.setText("Continue");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv11.this, Adv13.class));
            }
        });
    }
}
