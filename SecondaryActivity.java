package com.example.sudhanshukumar21cs1050;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        String name = getIntent().getStringExtra("data_key");
        TextView textView = findViewById(R.id.textViewData);
        textView.setText("Hello " + name);

        Button buttonGoToA = findViewById(R.id.buttonGoToA);
        buttonGoToA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
