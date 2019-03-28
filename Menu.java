package com.example.emirhan.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Menu extends ListActivity {
    String sehirler[]={"İstanbul","Amasya","Ankara","Tekirdağ","Sivas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_menu);

        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, sehirler));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position==0) {
            Toast.makeText(getApplicationContext(), "İstanbul", Toast.LENGTH_SHORT).show();
        }
        if(position==1){
            Toast.makeText(getApplicationContext(),"Amasya",Toast.LENGTH_LONG).show();
        }
        if(position==2){
            Toast.makeText(getApplicationContext(),"Ankara",Toast.LENGTH_LONG).show();
        }
        if(position==3){
            Toast.makeText(getApplicationContext(), "Tekirdağ", Toast.LENGTH_SHORT).show();
        }
        if(position==4){
            Toast.makeText(getApplicationContext(), "Sivas", Toast.LENGTH_SHORT).show();
        }
    }
}
