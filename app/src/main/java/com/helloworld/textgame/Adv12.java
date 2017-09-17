package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//this runs if you choose to wander the city
public class Adv12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv12);

        TextView text1 = (TextView) findViewById(R.id.Adv12text1);
        text1.setText(Strings.line15);

        Button button1 = (Button) findViewById(R.id.Adv12button1);
        button1.setText("Continue");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Adv12.this, Task3.class));
            }
        });
    }
}
