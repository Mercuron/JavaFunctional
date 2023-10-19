package org.example.ch1;

import java.util.Arrays;
import java.util.List;

public class ch1code {

    public static void run_1(){

        List<String> cities = Arrays.asList("Albany", "Boulder", "Chicago", "Denver", "Eugene");

        boolean found = false;

        for(String city: cities){
            if(city.equals("Chicago")){
                found=true;
                break;
            }
        }

        System.out.println("Found chicago? " + found);

        // Better way

        System.out.println("Found(ver2) chicago? " + cities.contains("Chicago"));
    }

    public static void run_2(){
        final List<Integer> prices = Arrays.asList(10, 30, 17, 20, 18, 45, 12);
        // 1 bad way
        double totalOfDiscountedPrices = 0.0;

        for(int price:prices){
            if(price>20){
                totalOfDiscountedPrices+=price*0.9;
            }
        }

        System.out.println("Total: " + totalOfDiscountedPrices);

        // 2 better

        final double total2=prices.stream()
                .filter(price->price>20)
                .mapToDouble(price->price*0.9)
                .sum();

        System.out.println("Total2 "+total2);


    }
}
