package com.example.admin.sqlite.activity;

import android.database.Cursor;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.sqlite.Adapter.NguoidungAdapter;
import com.example.admin.sqlite.R;
import com.example.admin.sqlite.database.SQLite;
import com.example.admin.sqlite.databinding.ActivityMainBinding;
import com.example.admin.sqlite.viewmodel.Mainmodel;

public class MainActivity extends AppCompatActivity {

    SQLite sqLite;
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Mainmodel mainmodel = new Mainmodel(this,android.R.layout.simple_list_item_1);
        sqLite = new SQLite(this,"Quanlynguoidung.sql",null,1);
        mainmodel.setUpdata(sqLite);

        activityMainBinding.setMainmodel(mainmodel);
        activityMainBinding.executePendingBindings();


        //Tao database

        //Tao bang
//        String createTable = "CREATE TABLE IF NOT EXISTS Nguoidung (Id INTEGER PRIMARY KEY AUTOINCREMENT , Ten VARCHAR , Namsinh VARCHAR , Diachi VARCHAR)";
//
//        sqLite.QueryData(createTable);
        // Them du lieu vao trong bang
//        String insert = "INSERT INTO Nguoidung VALUES (null , 'Nguyen Van A' , '1990' , 'Quan 1')";
//        String insert1 = "INSERT INTO Nguoidung VALUES (null , 'Nguyen Van B' , '1991' , 'Quan 2')";
//        String insert2 = "INSERT INTO Nguoidung VALUES (null , 'Nguyen Van C' , '1992' , 'Quan 3')";
//        String insert3 = "INSERT INTO Nguoidung VALUES (null , 'Nguyen Van D' , '1993' , 'Quan 4')";
//        String insert4 = "INSERT INTO Nguoidung VALUES (null , 'Nguyen Van E' , '1994' , 'Quan 5')";
//        sqLite.QueryData(insert);
//        sqLite.QueryData(insert1);
//        sqLite.QueryData(insert2);
//        sqLite.QueryData(insert3);
//        sqLite.QueryData(insert4);
        //Lay du lieu


        //Cach kiem tra vi tri cua cot
//        int id = cursor.getColumnIndex("Id");

//

    }
}
