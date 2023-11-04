package com.example.sudhanshukumar21cs1050;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = findViewById(R.id.editText);

        Button buttonGoToB = findViewById(R.id.buttonGoToB);
        buttonGoToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = e.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                intent.putExtra("data_key", name);
                startActivity(intent);
            }
        });
    }
}
