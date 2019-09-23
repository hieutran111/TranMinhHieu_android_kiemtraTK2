package com.example.student.tmh_cau2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KetQuaActivity extends AppCompatActivity {
    Button btnChuyen;
    TextView tvKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ket_qua);
        btnChuyen = findViewById(R.id.btnChuyen);
        tvKetQua = findViewById(R.id.tvKetQua);
        Intent intent1 = getIntent();
        float a = intent1.getFloatExtra("a", 0);
        float b = intent1.getFloatExtra("b", 0);
        float c = intent1.getFloatExtra("c", 0);
        tvKetQua.setText(giaiPT(a, b, c));
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KetQuaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public String giaiPT(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                return ("Phương trình vô nghiệm!");
            } else {
                return ("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            return ("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            return ("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            return ("Phương trình vô nghiệm!");
        }

    }
}
