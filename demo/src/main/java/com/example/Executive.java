package com.example;

class Executive extends Employee {
    private double yearlyBonus, yearlyCompensation;

    public Executive(){
        super();
    }

    public Executive(String firstName, String lastName, Address address, int id, double pay, double bonus, String ssn) {
        super(firstName, lastName, address, id, ssn);
        this.yearlyBonus = bonus;
        this.yearlyCompensation = pay;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public double getYearlyCompensation() {
        return yearlyCompensation;
    }

    public void setYearlyCompensation(double yearlyCompensation) {
        this.yearlyCompensation = yearlyCompensation;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "yearlyBonus=" + yearlyBonus +
                ", yearlyCompensation=" + yearlyCompensation +
                '}';
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN == true) {
            System.out.println("We can not display the SSN.");
        } else {
            System.out.println(toString());
        }
    }

    public double computePay(){

        return yearlyBonus + yearlyCompensation;
    }
}
