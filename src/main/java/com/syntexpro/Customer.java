package com.syntexpro;

public class Customer {

    private String name;        //Property name of type String
    private String size;        //Property size of type String

    //Method for getting name
    public String getName() {
        return name;
    }

    // Method for setting name
    public void setName(String name) {
        this.name = name;
    }

    // Getters and setters for size
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void setSizeBasedOnMeasurement(Customer customer, int measurement) {
        switch (measurement) {
            case 1:
                customer.setSize("S");
                break;
            case 2:
                customer.setSize("M");
                break;
            case 3:
                customer.setSize("L");
                break;
            default:
                customer.setSize("X");
                break;
        }
    }

    public static void main(String[] args) {

        Customer c1 = new Customer();

        c1.setName("John");

        int measurement = 3;        // Setting size of the customer based on the measurement value

        System.out.println("Hello, " + c1.getName() + "!");     // Greeting message
    }

}
