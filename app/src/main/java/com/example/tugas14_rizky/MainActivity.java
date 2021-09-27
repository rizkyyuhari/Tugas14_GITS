package com.example.tugas14_rizky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas14_rizky.API.ApiService;
import com.example.tugas14_rizky.API.RetroConfig;
import com.example.tugas14_rizky.activity.TambahActivity;
import com.example.tugas14_rizky.adapter.RVAdapter;
import com.example.tugas14_rizky.model.ContactModel;
import com.example.tugas14_rizky.model.ResponseModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvData;
    private RecyclerView.Adapter adData;
    private RecyclerView.LayoutManager lmData;
    private List<ContactModel> listData = new ArrayList<>();
    private ImageButton btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvData = findViewById(R.id.rv_data);
        lmData = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvData.setLayoutManager(lmData);
        getData();
        initView();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this , TambahActivity.class));
            }
        });
    }

    public void getData() {
        ApiService ardData = RetroConfig.retrofitConnect().create(ApiService.class);
        Call<ResponseModel> showData = ardData.getAllContact();

        showData.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {

                int kode = response.body().getKode();
                String pesan = response.body().getPesan();
               // Toast.makeText(MainActivity.this, pesan, Toast.LENGTH_SHORT).show();
                listData = response.body().getData();
                adData = new RVAdapter(MainActivity.this, listData);
                rvData.setAdapter(adData);
                adData.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Gagal Konek ke Server" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initView() {
        btnAdd = findViewById(R.id.btn_add);
    }
}