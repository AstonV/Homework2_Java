package com.example;

public class BusinessTest {
    private static boolean displaySSN = false;
    public static void main(String[] args) {

        int numHrs = 40, numWeeks = 2;

        // create new addresses
        Address address1 = new Address(123,"San Filipe Rd", "San Jose", "9511", "CA");
        Address address2 = new Address(456,"King Rd", "San Jose", "95125", "CA");
        Address address3 = new Address(789,"Tully Rd", "San Jose", "95121", "CA");
        Address address4 = new Address(5526,"Yerba Buena Rd", "San Jose", "95121", "CA");
        Address address5 = new Address(5286,"Hellyer Ave", "San Jose", "95111", "CA");
        Address address6 = new Address(1344,"Country Club Parkway", "San Jose", "95138", "CA");
        Address address7 = new Address(9753,"Ruby Rd", "San Jose", "95148", "CA");
        Address address8 = new Address(2872,"Brahamn Ave", "San Jose", "95111", "CA");
        Address address9 = new Address(2908,"Angeloni Ave", "San Jose", "95111", "CA");
        Address address10 = new Address(5201,"White Rd", "San Jose", "95148", "CA");
        Address address11 = new Address(1311,"Tully Rd", "San Jose", "95121", "CA");
        Address address12 = new Address(563,"Story Rd", "San Jose", "95122", "CA");

        // create new executive and display their information
        System.out.println("Executive");
        Executive executive = new Executive("Binh", "Vu", address1, 000001,
                250000.00, 15000.00, "1234-56-7891"); executive.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", executive.computePay());

        System.out.println("\n");
        Executive executive1 = new Executive("Angelia", "Jolie", address2, 000002,
                100000.00, 25000.00, "4314-32-1234"); executive1.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", executive1.computePay());
        System.out.println("\n\n------------------------------------\n");

        // create new FullTimeSalaried and display their information
        System.out.println("Full Time Salaried Employee");
        FullTimeSalaried fullSalaried = new FullTimeSalaried("Jason", "Statham",
                address3, 112233, 150000.00, "2321-49-6611"); fullSalaried.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", fullSalaried.computePay(numWeeks));

        System.out.println("\n");
        FullTimeSalaried fullSalaried1 = new FullTimeSalaried("Yasuo", "Feed",
                address4, 256146, 250000.00, "1124-11-1124"); fullSalaried1.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", fullSalaried1.computePay(numWeeks));
        System.out.println("\n\n------------------------------------\n");

        // create new FullTimeHourly and display their information
        System.out.println("Full Time Hourly Employee");
        FullTimeHourly fullHourly = new FullTimeHourly("Zed", "Troll",
                address5, 223344, 100000.00, 10500.00, "8125-19-1243"); fullHourly.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", fullHourly.computePay(numHrs));

        System.out.println("\n");
        FullTimeHourly fullHourly1 = new FullTimeHourly("Kaisa", "Fanboy",
                address6, 645134, 120000.00, 55200.00, "4231-13-1351"); fullHourly1.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", fullHourly1.computePay(numHrs));
        System.out.println("\n\n------------------------------------\n");

        // create new PartTimeHourly and display their information
        System.out.println("Part Time Hourly Employee");
        PartTimeHourly partTime = new PartTimeHourly("Jennie Kim", "Blackpink",
                address7, 012645, 30.00, "4124-41-4254"); partTime.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", partTime.computePay(numHrs));

        System.out.println("\n");
        PartTimeHourly partTime1 = new PartTimeHourly("Johnny", "Dang",
                address8, 512142, 25.00, "1561-13-7521"); partTime1.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", partTime1.computePay(numHrs));
        System.out.println("\n\n------------------------------------\n");

        // create new Contractor and display their information
        System.out.println("Hourly Paid Contractor");
        Contractor contractor = new Contractor("Róse", "Blackpink",
                address9, 020406, 50.00, "1423-25-8124"); contractor.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", contractor.computePay(numHrs));

        System.out.println("\n");
        Contractor contractor1 = new Contractor("Tony", "Stark",
                address10, 541372, 40.00, "4124-24-1242"); contractor1.introduce(displaySSN);
        System.out.printf("Paid: $%.2f", contractor1.computePay(numHrs));
        System.out.println("\n\n------------------------------------\n");

        // create new customer and display their information
        System.out.println("Customer");
        Customer customer = new Customer("Jisoo", "BlackPink", address11,
                146132, "3134-42-4211"); customer.setPayPreference("Master Card"); customer.introduce();
        customer.makePayment();

        System.out.println();
        Customer customer1 = new Customer("Faker", "Lee", address12,
                541278, "4124-12-1123"); customer1.setPayPreference("Visa Card"); customer1.introduce();
        customer1.makePayment();

    }
}