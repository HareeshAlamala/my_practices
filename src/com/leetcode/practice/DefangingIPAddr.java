package com.leetcode.practice;

public class DefangingIPAddr {

    public static void main(String[] args) {

        System.out.println(new DefangingIPAddr().defangIPaddr("122.121.225.121"));
    }

    public String defangIPaddr(String address) {
        StringBuilder ipAddress = new StringBuilder(address.length()+12);
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                ipAddress.append("[.]");
            } else
                ipAddress.append(address.charAt(i));
        }

        return ipAddress.toString();
    }
}
