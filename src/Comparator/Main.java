package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Laptop> laptopList = new ArrayList<>();
        Laptop laptop = new Laptop("Mac", 1000, "XDF");
        Laptop laptop1 = new Laptop("Dell", 2000,  "DER");
        Laptop laptop2 = new Laptop("Acer", 4000, "WQW");

        laptopList.add(laptop);
        laptopList.add(laptop1);
        laptopList.add(laptop2);

//        Collections.sort(laptopList);
//
//        for(Laptop l : laptopList){
//            System.out.println(l);
//        }

        Comparator<Laptop> comparator = (Laptop l1, Laptop l2) -> {

            int brandCompare = l1.getModelName().compareTo(l2.getModelName());
            if (brandCompare != 0)
                return brandCompare;
            return brandCompare;
        };

        Collections.sort(laptopList, comparator);

        for(Laptop l : laptopList){
            System.out.println(l);
        }


        /*
        * Need to define a comparator based on descending order of the price
        *
        * */

        System.out.println("Sorting in descending order by price");
        Comparator<Laptop> priceComparator = ((Laptop l1, Laptop l2) -> {

            int priceCompare = Integer.compare(l2.getPrice(), l1.getPrice());
            if(priceCompare!=0)
                return priceCompare;
            return priceCompare;
        });

        laptopList.sort(priceComparator);

        laptopList.forEach(System.out::println);
    }
}
