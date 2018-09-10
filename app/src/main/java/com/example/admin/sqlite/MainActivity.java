package com.example.admin.sqlite;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLite sqLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tao database
        sqLite = new SQLite(this,"Quanlynguoidung.sql",null,1);
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
        String laydulieu = "SELECT * FROM Nguoidung";
        Cursor cursor = sqLite.GetData(laydulieu);

        //Cach kiem tra vi tri cua cot
//        int id = cursor.getColumnIndex("Id");
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String ten = cursor.getString(1);
            String namsinh = cursor.getString(2);
            String diachi = cursor.getString(3);
        }
//
    }
}
