package com.pritesh.w2019listviewosdata.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pritesh.w2019listviewosdata.R;
import com.pritesh.w2019listviewosdata.models.Employee;

import java.util.ArrayList;

public class EmployeeAdapter extends BaseAdapter
{
    private Context context;
    private ArrayList<Employee>employeeArrayList;

    //public constructor
    public EmployeeAdapter(Context context, ArrayList<Employee> employeeArrayList) {
        this.context = context;
        this.employeeArrayList = employeeArrayList;
    }

    @Override
    public int getCount()
    {
        return employeeArrayList.size();
    }

    @Override
    public Employee getItem(int i)
    {
        return employeeArrayList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup)
    {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.list_item_student, viewGroup, false);
        }

        TextView txtEid = convertView.findViewById(R.id.txtStudentId);
        TextView txtEnm = convertView.findViewById(R.id.txtStudentName);
        TextView txtECountry = convertView.findViewById(R.id.txtCountryName);

        Employee mEmployee = getItem(i);

        txtEid.setText(String.valueOf(mEmployee.getEmployeeId()));
        txtEnm.setText(mEmployee.getEmployeeName());
        txtECountry.setText(mEmployee.getCountryName());




        return convertView;
    }
}
