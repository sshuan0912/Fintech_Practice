package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        RandomizedSet randomizedSet = new RandomizedSet();
//        System.out.println(randomizedSet.insert(2));
//        System.out.println(randomizedSet.insert(3));
//        System.out.println(randomizedSet.insert(2));
//        System.out.println(randomizedSet.insert(5));
//        System.out.println(randomizedSet.insert(6));
//        randomizedSet.map.forEach(System.out::println);
//
//        System.out.println(randomizedSet.remove(4));
//        System.out.println(randomizedSet.remove(3));
//        randomizedSet.map.forEach(System.out::println);
//
//        System.out.println("get random element:" + randomizedSet.getRandom());

//        RandomizedSetWithDuplicates randomizedSetWithDuplicates = new RandomizedSetWithDuplicates();
////        System.out.println(randomizedSetWithDuplicates.insert(1));
////        System.out.println(randomizedSetWithDuplicates.insert(1));
////        System.out.println(randomizedSetWithDuplicates.insert(2));
////        randomizedSetWithDuplicates.list.forEach(System.out::println);
////        System.out.println(randomizedSetWithDuplicates.map);
////        System.out.println("get random element:" + randomizedSetWithDuplicates.getRandom());
////
////        System.out.println(randomizedSetWithDuplicates.remove(1));
////        System.out.println("After remove: ");
////        randomizedSetWithDuplicates.list.forEach(System.out::println);
////        System.out.println(randomizedSetWithDuplicates.map);
////
////        System.out.println("get random element 2nd time:" + randomizedSetWithDuplicates.getRandom());
////
//        System.out.println(randomizedSetWithDuplicates.insert(1));
//        System.out.println(randomizedSetWithDuplicates.remove(1));
//        randomizedSetWithDuplicates.list.forEach(System.out::println);
//        System.out.println(randomizedSetWithDuplicates.map);

//        RelevantShopping relevantShopping = new RelevantShopping();
//        List<String> l1 = new ArrayList<>(List.of("Casper", "Purple", "Wayfair"));
//        List<String> l2 = new ArrayList<>(List.of("Purple", "Wayfair", "Tradesy"));
//        List<String> l3 = new ArrayList<>(List.of("Wayfair", "Tradesy", "Peloton"));
//        List<String> l4 = new ArrayList<>(List.of("Casper", "Purple", "Wayfair"));
//        List<String> l5 = new ArrayList<>(List.of("Purple", "Wayfair", "Tradesy"));
//        List<String> l6 = new ArrayList<>(List.of("Wayfair", "Tradesy", "Peloton"));
//        List<List<String>> input = new ArrayList<>(List.of(l1,l2,l3,l4,l5,l6));
//        relevantShopping.countMeetingTimes(input);
//

//        ShortestUniqueSubstring shortestUniqueSubstring = new ShortestUniqueSubstring();
//        List<String> input = new ArrayList<>(List.of("cheapair", "cheapoair", "peloton", "pelican"));
//        System.out.println(shortestUniqueSubstring.findShortestSubstring(input));

        int[] array = new int[52];
        for(int i = 0; i < 52; i++){
            array[i] = i+1;
        }

        CardGame cardGame = new CardGame();
        cardGame.gameResults(array);




    }
}