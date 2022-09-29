package com.example;

abstract class FullTimeEmployee extends Employee {
    private double basePay;

    public FullTimeEmployee(){
        super();
    }

    public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay, String ssn) {
        super(firstName, lastName, address, id, ssn);
        this.basePay = basePay;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "basePay=" + basePay +
                '}';
    }
}