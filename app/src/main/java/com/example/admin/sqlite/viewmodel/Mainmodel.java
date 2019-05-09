package com.example.admin.sqlite.viewmodel;

import android.content.Context;
import android.database.Cursor;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ListView;

import com.android.databinding.library.baseAdapters.BR;
import com.example.admin.sqlite.Adapter.NguoidungAdapter;
import com.example.admin.sqlite.database.SQLite;
import com.example.admin.sqlite.model.Nguoidung;

import java.util.ArrayList;
import java.util.List;

public class Mainmodel extends BaseObservable {

    private NguoidungAdapter nguoidungAdapter;
    private ArrayList<Nguoidung> data;


    public Mainmodel(Context context , int layout){
        this.data = new ArrayList<>();
        nguoidungAdapter = new NguoidungAdapter(context,layout,data);
    }

    @Bindable
    public NguoidungAdapter getNguoidungAdapter() {
        return nguoidungAdapter;
    }

    @Bindable
    public ArrayList<Nguoidung> getData() {
        return data;
    }

    public void setUpdata(SQLite sqLite){
        if (sqLite != null){
            String laydulieu = "SELECT * FROM Nguoidung";
            Cursor cursor = sqLite.GetData(laydulieu);
            while (cursor.moveToNext()){
                int id = cursor.getInt(0);
                String ten = cursor.getString(1);
                String namsinh = cursor.getString(2);
                String diachi = cursor.getString(3);
                data.add(new Nguoidung(id , ten,namsinh,diachi));
            }
            notifyPropertyChanged(BR.data);
        }
    }

    @BindingAdapter({"app:adapter", "app:data"})
    public static void bind(ListView listView, NguoidungAdapter adapter, List<Nguoidung> data) {
        listView.setAdapter(adapter);
        adapter.updateData(data);
    }
}
