package StreamsAPI;



/*
 * Data is passed as a pipeline and we can perform for filtering
 *
 * */


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {


        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(1000);
        salaryList.add(2000);
        salaryList.add(3000);
        salaryList.add(4000);
        salaryList.add(5000);
        salaryList.add(6000);
        salaryList.add(7000);
        salaryList.add(8000);


        List<Integer> newList = salaryList.stream().filter(salary -> salary < 5000).collect(toList());
        newList.forEach(System.out::println);

        long count = newList.stream().filter(salary -> salary < 4000).count();
        System.out.println(count);

        Stream<Integer> streamFromIterate = Stream.iterate(1000, (n) -> n + 1).limit(100);
        streamFromIterate.forEach(System.out::println);


        List<String> nameList = new ArrayList<>(Arrays.asList("Shreyansh", "Nalini", "Singh", "Bbau", "Atul", "Sunita"));

        List<String> filteredList = nameList.stream().filter(name -> name.length() <= 6).collect(toList());
        filteredList.forEach(System.out::println);


        List<String> upperCaseList = nameList.stream().map(String::toUpperCase).collect(toList());
        upperCaseList.forEach(System.out::println);


        List<List<String>> list = new ArrayList<>();

        List<String> firstName = new ArrayList<>(Arrays.asList("Shreyansh ", "Anushka ", "Nalini "));
        List<String> lastName = new ArrayList<>(Arrays.asList("Khandelwal ", "khandelwal ", "singh "));
        list.add(firstName);
        list.add(lastName);


        List<String> fullName = list.stream().flatMap(Collection::stream).map(String::toUpperCase).collect(toList());
        fullName.forEach(System.out::print);

        long distinctCount = fullName.stream().distinct().count();
        System.out.println(distinctCount);

        List<String> numbers = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));

        List<Integer> numberInt = numbers.stream()
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
//        numberInt.forEach(System.out::println);


       long count1 = numberInt.stream().filter(val-> val > 2).peek(System.out::println).count();
//        System.out.println(count1);



        /*
        * Very good example to show how intermediate operations are lazy
        *
        *
        * */

        List<Integer> numbersOne = Arrays.asList(2, 1, 4, 7, 10);

        long parallelStream = System.currentTimeMillis();
        numbersOne.stream().parallel().map(val -> val * 2).forEach(System.out::println);

        System.out.println( "Time  : " +(System.currentTimeMillis() - parallelStream));

        List<Integer> sortedNumberList = numbersOne.stream().
                filter(v -> v >=3).
                peek(v-> System.out.println("after filtering value is :" + v)).
                map(v-> -v).peek(v-> System.out.println("after negating value is: " +v)).
                sorted((a, b) -> b - a).peek(System.out::println).collect(toList());

//        sortedNumberList.forEach(System.out::println);

        Optional<Integer> optionalI = sortedNumberList.stream().reduce(Integer::sum);
        if(optionalI.isPresent())
            System.out.println(optionalI.toString());

        Optional<Integer> optionalInteger = sortedNumberList.stream().min((a, b) -> b-a);
        System.out.println(optionalInteger);
    }
}
