package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task4P2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4_p2);

        final TextView text1 = (TextView) findViewById(R.id.Task4P2text1);
        text1.setText(Strings.Task4P2);

        final Button button1 = (Button) findViewById(R.id.Task4P2button1);
        button1.setText("Continue");
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Task4P2.this, Adv15.class));
            }
        });
    }
}
