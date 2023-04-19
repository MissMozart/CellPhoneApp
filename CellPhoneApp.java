package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone c1 = new CellPhone(1234567, "Google Phone", "Cricket", "4694083551", "Anne Koehler");
        System.out.printf("%s belongs to %s", c1.phoneNumber, c1.owner);
    }
}
