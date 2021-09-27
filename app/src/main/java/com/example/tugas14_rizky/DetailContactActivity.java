package com.example.tugas14_rizky;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailContactActivity extends AppCompatActivity {

    private TextView tvDetailnama;
    private TextView tvDetailemail;
    private TextView tvDetailtelpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_contact);
        String nama = getIntent().getStringExtra("nama");
        String telepon = getIntent().getStringExtra("telepon");
        String email = getIntent().getStringExtra("email");
        initView();
        tvDetailnama.setText(nama);
        tvDetailtelpon.setText(telepon);
        tvDetailemail.setText(email);
    }

    private void initView() {
        tvDetailnama = findViewById(R.id.tv_detailnama);
        tvDetailemail = findViewById(R.id.tv_detailemail);
        tvDetailtelpon = findViewById(R.id.tv_detailtelpon);
    }
}