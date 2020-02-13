package com.example.android_seminar_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText_1 = findViewById(R.id.edTxt_1);
        final EditText editText_2 = findViewById(R.id.edTxt_2);
        final TextView txtV = findViewById(R.id.txtV);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edTxt_1 = editText_1.getText().toString();
                try{
                    edTxt_1 = edTxt_1.toUpperCase();
                } catch (Exception e) {
                    txtV.setVisibility(View.VISIBLE);
                    txtV.setText(e.getMessage());
                }
                editText_2.setText(edTxt_1);
            }
        });
    }
}
