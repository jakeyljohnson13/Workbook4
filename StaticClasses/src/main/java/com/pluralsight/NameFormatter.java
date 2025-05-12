package com.pluralsight;

import java.security.PrivateKey;

public class NameFormatter {
    private String first;
    private String last;
    private String middle;
    private String prefix;
    private String suffix;

    private NameFormatter(String first, String last, String middle, String prefix, String suffix) {
        this.first = first;
        this.last = last;
        this.middle = middle;
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public static String format(String first,String last) {
        String formattedName;
        formattedName = last + ", " + first;
        return formattedName;
    }
    public static String format(String prefix,
                                String first,
                                String middle,
                                String last,
                                String suffix){
        String formattedName = last + " " + prefix + " " + first + " " + middle + ", " + suffix;
        return formattedName;
    }
    public static String format(String fullName) {
        String formattedName = "";
        String[] parts = fullName.split(" ");
        switch (parts.length) {
            case 3:
                if (fullName.contains(",")) {
                    formattedName = parts[1] + " " + parts[0] + ", " + parts[1];
                } else {
                    formattedName = parts[2] + ", " + parts[0] + " " + parts[1];
                }
                break;
            case 4:
                if (fullName.contains(",")) {
                    formattedName = parts[2] + " " + parts[0] + " " + parts[1] + ", " + parts[3];
                }
                else {
                    formattedName = parts[3] + ", " + parts[0] + " " + parts[1] + " " + parts[2];
                }
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
        return formattedName;
    }
}
