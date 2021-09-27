package com.example.tugas14_rizky.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseModel {

    private int kode;
    private String pesan;
    private List<ContactModel> data;

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<ContactModel> getData() {
        return data;
    }

    public void setData(List<ContactModel> data) {
        this.data = data;
    }
}
