package com.syntexpro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @DisplayName("Testing data for Customer Name")
    @Test
    void customerTest() {
        customer.setName("John");

        assertEquals("John", customer.getName());
    }

    @DisplayName("Testing size for measurement 1")
    @Test
    void testSizeForMeasurement_S() {
        Customer.setSizeBasedOnMeasurement(customer, 1);
        assertEquals("S", customer.getSize(), "Customer size should be S for measurement 1");
    }

    @DisplayName("Testing size for measurement 2")
    @Test
    void testSizeForMeasurement_M() {
        Customer.setSizeBasedOnMeasurement(customer, 2);
        assertEquals("M", customer.getSize(), "Customer size should be M for measurement 2");
    }

    @DisplayName("Testing size for measurement 3")
    @Test
    void testSizeForMeasurement_L() {
        Customer.setSizeBasedOnMeasurement(customer, 3);
        assertEquals("L", customer.getSize(), "Customer size should be L for measurement 3");
    }

    @DisplayName("Testing size for other measurements")
    @Test
    void testSizeForMeasurement_X() {
        Customer.setSizeBasedOnMeasurement(customer, 4);
        assertEquals("X", customer.getSize(), "Customer size should be X for measurements other than 1,2, or 3");
    }
}
