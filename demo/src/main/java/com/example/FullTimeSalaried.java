package com.example;

class FullTimeSalaried extends FullTimeEmployee {

    private double salary;

    public FullTimeSalaried(){
        super();
    }

    public FullTimeSalaried(String firstName, String lastName, Address address, int id, double salary, String ssn) {
        super(firstName, lastName, address, id, salary, ssn);
    }

    @Override
    public String toString() {
        return "FullTimeSalaried{" +
                "salary=" + salary +
                '}';
    }

    public void introduce(boolean displaySSN) {
        if(displaySSN == true) {
            System.out.println("We can not display the SSN.");
        }
        System.out.println(toString());
    }

    public double computePay(int numWeeks) {
        return (getBasePay()/52) * numWeeks;
    }
}
