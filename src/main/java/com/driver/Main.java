package com.driver;

public class Main {

    public static class Product{

        public static int product(int x, int y) {
            return x*y;
        }


        public static int product(int x, int y, int z) {


            return x*y*z;
        }


        public double product(double x, double y) {

            return x*y;
        }

    }


    public static void main(String args[])
    {
        Product obj = new Product();
        System.out.println(obj.product(2,3));
        System.out.println(obj.product(1,2,3));
        System.out.println(obj.product(1.5,2.5));

    }

}