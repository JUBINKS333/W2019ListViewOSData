package com.pritesh.w2019listviewosdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class OperatingSystemListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    private ListView lstOperatingSystem;
    String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
            "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
            "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
            "Android", "iPhone", "WindowsMobile" };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating_system_list);

        lstOperatingSystem = findViewById(R.id.lstOperatingSystem);

        ArrayAdapter<String>mArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, values);

        lstOperatingSystem.setAdapter(mArrayAdapter);
        lstOperatingSystem.setOnItemClickListener(this);

       /* lstOperatingSystem.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(OperatingSystemListActivity.this, values[i], Toast.LENGTH_SHORT).show();
            }
        });*/

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        Toast.makeText(OperatingSystemListActivity.this, values[i], Toast.LENGTH_SHORT).show();
    }
}
