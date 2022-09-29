package com.example;

class PartTimeHourly extends Employee {

    private Double baseHourlyPay;

    public PartTimeHourly() {
        super();
    }

    public PartTimeHourly(String firstName, String lastName, Address address, int id, Double baseHourlyPay, String ssn) {
        super(firstName, lastName, address, id, ssn);
        this.baseHourlyPay = baseHourlyPay;
    }

    public Double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    public void setBaseHourlyPay(Double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }

    @Override
    public String toString() {
        return "PartTimeHourly{" +
                "baseHourlyPay=" + baseHourlyPay +
                '}';
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN == true) {
            System.out.println("We can not display the SSN.");
        } else {
            System.out.println(toString());
        }
    }

    public double computePay(int numHrs){

        return baseHourlyPay * numHrs;
    }
}