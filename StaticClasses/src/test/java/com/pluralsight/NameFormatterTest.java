package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void formatFirstLast() {
        String result = NameFormatter.format("Mel","Johnson");
        assertEquals("Johnson, Mel",result);
    }

    @org.junit.jupiter.api.Test
    void formatPrefixSuffix() {
        String result = NameFormatter.format("Dr.","Mel","B.","Johnson,","Phd");
        assertEquals("Johnson, Dr. Mel B., Phd",result);
    }

    @org.junit.jupiter.api.Test
    void formatFull() {
        String result = NameFormatter.format("Mel B. Johnson");
        assertEquals("Johnson, Mel B.",result);
    }
}