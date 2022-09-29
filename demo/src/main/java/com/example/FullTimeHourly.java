package com.example;

class FullTimeHourly extends FullTimeEmployee{
    private double overtimePay;

    public FullTimeHourly(){
        super();
    }

    public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtimePay,String ssn) {
        super(firstName, lastName, address, id, basePay, ssn);
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public String toString() {
        return "FullTimeHourly{" +
                "overtimePay=" + overtimePay +
                '}';
    }

    public void introduce(boolean displaySSN) {
        if(displaySSN == true) {
            System.out.println("We can not display the SSN.");
        }
        System.out.println(toString());
    }

    public double computePay(int numHrs) {
        return ((getBasePay()/8760)*numHrs) + overtimePay;
    }
}
