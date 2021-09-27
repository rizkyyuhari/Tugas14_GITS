package com.example.tugas14_rizky.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugas14_rizky.API.ApiService;
import com.example.tugas14_rizky.API.RetroConfig;
import com.example.tugas14_rizky.R;
import com.example.tugas14_rizky.model.ResponseModel;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TambahActivity extends AppCompatActivity {


    private Button btnAdd;
    private TextInputEditText tieName;
    private TextInputEditText tieTelepon;
    private TextInputEditText tieEmail;
    private String nama;
    private String telepon;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);
        initView();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = tieName.getText().toString();
                telepon = tieTelepon.getText().toString();
                email = tieEmail.getText().toString();

                if(nama.trim().equals("")){
                    tieName.setError("Nama Harus Diisi");
                }
                if(telepon.trim().equals("")){
                    tieTelepon.setError("Telepon Harus diisi");
                }
                  if(email.trim().equals("")){
                    tieEmail.setError("Email Harus Diisi");
                }
                  else{
                      createData();
                  }

            }
        });
    }

    private void initView() {
        btnAdd = findViewById(R.id.btn_add);
        tieName = findViewById(R.id.tie_name);
        tieTelepon = findViewById(R.id.tie_telepon);
        tieEmail = findViewById(R.id.tie_email);
    }

    private void createData(){
        ApiService ardData = RetroConfig.retrofitConnect().create(ApiService.class);
        Call<ResponseModel> simpanData = ardData.insertData(nama,telepon,email);

        simpanData.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                String pesan = response.body().getPesan();
                Toast.makeText(TambahActivity.this, pesan,Toast.LENGTH_SHORT).show();
                finish();
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });
    }
}