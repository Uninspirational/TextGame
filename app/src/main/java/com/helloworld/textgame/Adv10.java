package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv10);
        TextView text1 = (TextView) findViewById(R.id.Adv10text1);
        text1.setText(Strings.line13);

        Button button1 = (Button) findViewById(R.id.Adv10button1);
        Button button2 = (Button) findViewById(R.id.Adv10button2);
        button1.setText("Leave the city");
        button2.setText("Wander around");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv10.this, Adv11.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv10.this, Adv12.class));
            }
        });

    }
}
