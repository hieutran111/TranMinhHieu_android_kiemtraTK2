package com.example.student.tmh_cau2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnGiai;
    EditText etA, etB, etC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGiai = findViewById(R.id.btnGiai);
        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etC = findViewById(R.id.etC);

        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KetQuaActivity.class);
                intent.putExtra("a", Float.parseFloat(etA.getText().toString()));
                intent.putExtra("b", Float.parseFloat(etB.getText().toString()));
                intent.putExtra("c", Float.parseFloat(etC.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
