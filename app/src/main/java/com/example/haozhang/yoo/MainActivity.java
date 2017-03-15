package com.example.haozhang.yoo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("ConstantConditions")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText)findViewById(R.id.name);
        Button[] buttons = new Button[4];
        for (int i = 0; i < 4; i++) {
            int id = getResources().getIdentifier("btn_" + (i+1), "id", getPackageName());
            buttons[i] = (Button) findViewById(id);
        }

        for (int i = 0; i < 4; i++) {
            buttons[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text = editText.getText().toString();
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            });
        }

    }
}
