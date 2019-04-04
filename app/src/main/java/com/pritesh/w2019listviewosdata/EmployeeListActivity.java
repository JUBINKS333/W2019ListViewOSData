package com.pritesh.w2019listviewosdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.pritesh.w2019listviewosdata.adapters.EmployeeAdapter;
import com.pritesh.w2019listviewosdata.models.Employee;

import java.util.ArrayList;

public class EmployeeListActivity extends AppCompatActivity
{

    private ListView lstStudentData;
    private ArrayList<Employee>employeeArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        initData();

        lstStudentData = findViewById(R.id.lstStudentData);

        EmployeeAdapter mEmployeeAdapter = new EmployeeAdapter(this, employeeArrayList);
        lstStudentData.setAdapter(mEmployeeAdapter);


        lstStudentData.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Employee mEmployee = employeeArrayList.get(i);

            }
        });
    }

    private void initData()
    {
        employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee(1, "Pritesh", "India"));
        employeeArrayList.add(new Employee(2, "Denis", "Brazil"));
        employeeArrayList.add(new Employee(3, "Subham", "India"));
        employeeArrayList.add(new Employee(4, "Payal", "Canada"));
        employeeArrayList.add(new Employee(5, "Kirti","Italy"));
        employeeArrayList.add(new Employee(6, "Aaryash", "Mexico"));
        employeeArrayList.add(new Employee(7, "Karan", "Turkey"));
        employeeArrayList.add(new Employee(8, "Dhruvi", "Brazil"));
        employeeArrayList.add(new Employee(9, "Shweta", "Sri Lanka"));
        employeeArrayList.add(new Employee(10, "Nikhil", "USA"));
    }
}
