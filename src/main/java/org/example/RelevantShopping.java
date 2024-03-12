package org.example;

import java.util.*;

public class RelevantShopping {

    //map<String, Set<Integer>> to record each unique string and its location in each bucket
    // {'Casper': (0,3), 'Purple':(0,1,3,4), 'Wayfair':(0,1,2,3,4,5)}

    //iterate each unique string and count times other string with it in the same bucket and use max to record max
    //Map<String, Integer> for another string and its meeting times
    //{'Purple': 2; 'Wayfair': 2}, max = 2
    //iterate this map and find string whose value == max, and add it into a list
    public RelevantShopping(){}

    public Map<String, List<String>> countMeetingTimes(List<List<String>> input){

        Map<String, List<String>> res = new HashMap<>();

        Map<String, Set<Integer>> locationMap = new HashMap<>();
        for(int i = 0; i < input.size(); i++){
            for(String s: input.get(i)){
                if(!locationMap.containsKey(s)){
                    locationMap.put(s, new HashSet<>());
                }
                locationMap.get(s).add(i);
            }
        }

        //locationMap, value is the bucket number: {Tradesy=[1, 2, 4, 5], Purple=[0, 1, 3, 4],
        //                    Casper=[0, 3], Peloton=[2, 5], Wayfair=[0, 1, 2, 3, 4, 5]}

        for(String s: locationMap.keySet()){
            Map<String, Integer> cntMeetingTimes = new HashMap<>();
            int max = 0;
            for( String anotherS: locationMap.keySet()){
                int cnts = 0;
                if(anotherS.equals(s)) continue;
                else {
                    for (int loc : locationMap.get(s)) {
                        if (locationMap.get(anotherS).contains(loc)) {
                            cnts++;
                            max = Math.max(cnts, max);
                        }

                    }
                }
                cntMeetingTimes.put(anotherS, cnts);
            }
            List<String> highestRelevant = new ArrayList<>();
            for(String anotherS: cntMeetingTimes.keySet()){
                if(cntMeetingTimes.get(anotherS) == max){
                    highestRelevant.add(anotherS);
                }
            }
            res.put(s, highestRelevant);
        }

        System.out.println(res);


        return res;

    }
}
