package com.pritesh.w2019listviewosdata.models;

import java.io.Serializable;

/**
 * Created by Pritesh Patel.
 */

public class Employee implements Serializable {

    private int employeeId;
    private String employeeName;
    private String countryName;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String countryName)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.countryName = countryName;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
