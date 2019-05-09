package com.example.admin.sqlite.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.admin.sqlite.R;
import com.example.admin.sqlite.databinding.DongItemNguoidungBinding;
import com.example.admin.sqlite.model.Nguoidung;
import com.example.admin.sqlite.viewmodel.Itemmodel;

import java.util.ArrayList;
import java.util.List;

public class NguoidungAdapter extends ArrayAdapter<Nguoidung> {

    ArrayList<Nguoidung> data = new ArrayList<>();
    public NguoidungAdapter(Context context, int resource, List<Nguoidung> objects) {
        super(context, resource, objects);
        data = (ArrayList<Nguoidung>) objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater  = LayoutInflater.from(getContext());
        DongItemNguoidungBinding dongItemNguoidungBinding = DataBindingUtil.inflate(layoutInflater,R.layout.dong_item_nguoidung,parent,false);
        Nguoidung nguoidung = getItem(position);

        dongItemNguoidungBinding.setItemmodel(new Itemmodel(nguoidung));
        return dongItemNguoidungBinding.getRoot();
    }
    public void updateData(List<Nguoidung> data){
        if (data == null || data.isEmpty()) {
            this.data.clear();
        } else {
            this.data.addAll(data);
        }
        notifyDataSetChanged();
    }
}
