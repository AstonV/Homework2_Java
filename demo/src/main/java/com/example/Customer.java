package com.example;

class Customer extends Person {
    private int customerID;
    private String payPreference;

    public Customer(){
        super();
    }

    public Customer(String firstName, String lastName, Address address, int customerID, String ssn) {
        super(firstName, lastName, address, ssn);
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPayPreference() {
        return payPreference;
    }

    public void setPayPreference(String payPreference) {
        this.payPreference = payPreference;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", payPreference='" + payPreference + '\'' +
                '}';
    }

    public void introduce(){
        System.out.println(toString());
    }

    public void makePayment(){
        System.out.println("Pay Preference: "+getPayPreference());
    }


}
