package com.pluralsight;

public class Employee {
    private int employeeID;
    private String employeeName;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double regularHours;
    private double overtimeHours;

    public Employee (int employeeID, String employeeName, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public String getEmployeeName() {
        return employeeName();
    }

    public double getPayRate() {
        return getPayRate();
    }

    public double getHoursWorked() {
        return getHoursWorked();
    }

    public double getTotalPay() {
        return totalPay;
    }

    public double getRegularHours() {
            return getRegularHours();
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }
}
