package com.example.admin.sqlite.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.admin.sqlite.model.Nguoidung;


public class Itemmodel extends BaseObservable {
    private int Id;
    private String Ten;
    private String Namsinh;
    private String Diachi;

    public Itemmodel(Nguoidung nguoidung){
        Id = nguoidung.Id;
        Ten = nguoidung.Ten;
        Namsinh = nguoidung.Namsinh;
        Diachi = nguoidung.Diachi;
    }

    @Bindable
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
//        notifyPropertyChanged();

    }

    @Bindable
    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    @Bindable
    public String getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(String namsinh) {
        Namsinh = namsinh;
    }

    @Bindable
    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
