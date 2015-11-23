package com.example.administrator.alldemos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.alldemos.activities.Activity1;
import com.example.administrator.alldemos.activities.Activity10;
import com.example.administrator.alldemos.activities.Activity11;
import com.example.administrator.alldemos.activities.Activity12;
import com.example.administrator.alldemos.activities.Activity13;
import com.example.administrator.alldemos.activities.Activity14;
import com.example.administrator.alldemos.activities.Activity15;
import com.example.administrator.alldemos.activities.Activity16;
import com.example.administrator.alldemos.activities.Activity17;
import com.example.administrator.alldemos.activities.Activity2;
import com.example.administrator.alldemos.activities.Activity3;
import com.example.administrator.alldemos.activities.Activity4;
import com.example.administrator.alldemos.activities.Activity5;
import com.example.administrator.alldemos.activities.Activity6;
import com.example.administrator.alldemos.activities.Activity7;
import com.example.administrator.alldemos.activities.Activity8;
import com.example.administrator.alldemos.activities.Activity9;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] demos=new String[]{
            "ListView by SimpleActivity",
            "ListView by BaseActivity",
            "ListView by SimpleCursorAdapter",
            "Spinner Test",
            "Create and Read File",
            "Create and Read SdCard File",
            "Create and Read Xml File",
            "SharedPreferences test",
            "SQLite Test",
            "ContentProvider Test",
            "ExpendableListView Test",
            "GridView Test",
            "DrawerLayout Test",
            "DrawerLayout + ActionBar",
            "FragmentTabHost Test",
            "Dialog Test",
            "ContextMenu Test"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, demos));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, Activity1.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, Activity2.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, Activity3.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, Activity4.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, Activity5.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, Activity6.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this, Activity7.class));
                        break;
                    case 7:
                        startActivity(new Intent(MainActivity.this, Activity8.class));
                        break;
                    case 8:
                        startActivity(new Intent(MainActivity.this, Activity9.class));
                        break;
                    case 9:
                        startActivity(new Intent(MainActivity.this, Activity10.class));
                        break;
                    case 10:
                        startActivity(new Intent(MainActivity.this, Activity11.class));
                        break;
                    case 11:
                        startActivity(new Intent(MainActivity.this, Activity12.class));
                        break;
                    case 12:
                        startActivity(new Intent(MainActivity.this, Activity13.class));
                        break;
                    case 13:
                        startActivity(new Intent(MainActivity.this, Activity14.class));
                        break;
                    case 14:
                        startActivity(new Intent(MainActivity.this, Activity15.class));
                        break;
                    case 15:
                        startActivity(new Intent(MainActivity.this, Activity16.class));
                        break;
                    case 16:
                        startActivity(new Intent(MainActivity.this, Activity17.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }

}
