package com.leetcode.practice;

public class Cashier {

    int luck;

    int discount ;

    int[] products;

    int prices[];

    public Cashier(int n, int discount, int[] products, int[] prices) {
    luck = n;
    this.discount = discount;
    this.products = products;
    this.prices = prices;
    }

    public double getBill(int[] product, int[] amount) {
        luck--;
        double bill = 0.0;
        for (int i = 1; i <= product.length; i++) {
          bill = bill + prices[product[i-1]] * amount[i-1];
        }
        if (luck == 0) {
            bill = bill - (discount/100);
        }

        return bill;
    }

    public static void main(String[] args) {
        Cashier c  = new Cashier(3,50, new int[]{1,2,3,4,5,6,7},new int[]{100,200,300,400,300,200,100});
        System.out.println(c.getBill(new int[]{1,2},new int[]{1,2}));
        try {

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
