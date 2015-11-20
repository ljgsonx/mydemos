package com.example.administrator.alldemos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
            "sharedPreferences test",
            "SQLite Test",
            "ContentProvider Test"
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
                    default:
                        break;
                }
            }
        });
    }

}
