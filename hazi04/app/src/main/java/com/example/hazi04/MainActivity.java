package com.example.hazi04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"EUR","USD","GBP","AUD",
            "CAD","CHF","DKK","HUF" };

    String[] infoArray = {
            "Euro",
            "US Dollar",
            "UK Font",
            "AUS Dollar",
            "Canadian Dollar",
            "Swiss franc",
            "Danish crown",
            "Forint HUN"
    };

    Integer[] imageArray = {
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter valami = new CustomListAdapter(this,nameArray,infoArray,imageArray);
        listView = findViewById(R.id.listviewID);
        listView.setAdapter(valami);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"asdasd",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                String message=nameArray[position];
                intent.putExtra("animal",message);

                startActivity(intent);
            }
        });
    }
}