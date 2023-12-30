package com.example.febflix;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Count extends AppCompatActivity {

    private TextView mShowCount;
    private int currentCount = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        // Inisialisasi TextView
        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        // Menambahkan nilai perhitungan dan menampilkan di TextView
        currentCount++;
        mShowCount.setText(String.valueOf(currentCount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
}