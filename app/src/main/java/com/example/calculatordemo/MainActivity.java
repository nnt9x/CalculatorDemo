package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // View
    private EditText edtA, edtB;
    private Button btnPlus, btnMin, btnMul, btnDiv;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind id
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        btnPlus = findViewById(R.id.btnPlus);
        btnMin = findViewById(R.id.btnMin);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        tvResult = findViewById(R.id.tvResult);

        // Bắt sự kiện
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khối lệnh chạy khi btnPlus dc nhấn

                // Bước 1: lấy dữ liệu input, kiểm tra rỗng hay ko?
                String strA = edtA.getText().toString();
                if(strA.isEmpty()){
                    edtA.setError("Hãy nhập số A!");
                    return;
                }

                String strB = edtB.getText().toString();
                if(strB.isEmpty()){
                    edtB.setError("Hãy nhập số B!");
                    return;
                }
                double a = Double.parseDouble(strA);
                double b = Double.parseDouble(strB);

                // Bước 2: Tính toán
                double t = a  + b;

                // Bước 3: In ra textView kết quả
                tvResult.setText(String.valueOf(t));

            }
        });
    }
}