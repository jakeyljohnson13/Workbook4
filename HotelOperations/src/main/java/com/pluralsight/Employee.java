package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {

        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours(){
        double regularHours;
        if (hoursWorked <= 40.0){
            regularHours = hoursWorked;
        } else if (hoursWorked > 40.0) {
            regularHours = 40.0;
        }
        return regularHours;
    }
    public double getOvertimeHours(){
        double overtimeHours;
        if (hoursWorked > 40.0){
            overtimeHours = hoursWorked - 40;
        } else overtimeHours = 0.0;
        return overtimeHours;
    }

    public double getTotalPay(){
        double totalPay;
        totalPay = (getRegularHours() * getPayRate()) + (getOvertimeHours() * (getPayRate() * 1.5));
        return  totalPay;
    }
    double timeIn;
    public double punchIn(double timeIn){
        System.out.println(name + "punched in at " + timeIn);
        return timeIn;
    }
    public void punchOut(double timeOut){
        System.out.println(name + "punched out at " + timeOut);
        hoursWorked += timeOut - timeIn;
        System.out.println(name + "'s total hours worked so far is " + hoursWorked);
    }
}
