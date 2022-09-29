package com.example;

class Contractor extends Employee {

    private Double basePay;

    public Contractor(){
        super();
    }

    public Contractor(String firstName, String lastName, Address address, int id,  Double basePay, String ssn) {
        super(firstName, lastName, address, id, ssn);
        this.basePay = basePay;
    }

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "basePay=" + basePay +
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

        return basePay * numHrs;
    }
}