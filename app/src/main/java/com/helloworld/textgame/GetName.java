package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GetName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_name);
        final Button button = (Button) findViewById(R.id.startb);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Strings words = new Strings();
                EditText Name = (EditText) findViewById(R.id.getName);
                words.set(Name.getText().toString());
                startActivity(new Intent(GetName.this, Adv1.class));
            }
        });

    }


}
