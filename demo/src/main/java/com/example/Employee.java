package com.example;

abstract class Employee extends Person{

    private int id;
    private String educationLevel;
    private  boolean directDeposit;

    public Employee(){
            super();
    }

    public Employee(String firstName, String lastName, Address address, int id, String ssn) {
            super(firstName, lastName, address, ssn);
            this.id = id;
    }

    public int getId() {
            return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getEducationLevel() {
            return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
            this.educationLevel = educationLevel;
    }

    public boolean isDirectDeposit() {
            return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
            this.directDeposit = directDeposit;
    }

    @Override
    public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", educationLevel='" + educationLevel + '\'' +
                    ", directDeposit=" + directDeposit +
                    '}';
    }
}