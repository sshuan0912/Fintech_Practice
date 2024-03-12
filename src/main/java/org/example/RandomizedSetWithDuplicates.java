package org.example;

import java.util.*;

public class RandomizedSetWithDuplicates {
    Map<Integer, Set<Integer>> map; //set can remove or add element, but list can only remove index
    List<Integer> list;

    public RandomizedSetWithDuplicates (){
//        this.mapList = new ArrayList<>();
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public boolean insert(int val){
        if(!map.containsKey(val)){
            map.put(val, new HashSet<>());
        }
        map.get(val).add(list.size());
        list.add(val);
        return map.get(val).size() == 1;
    }

    public boolean remove(int val){
        // if don't contain or contain val previously, but delete all, list is empty, return false
        if(!map.containsKey(val) || map.get(val).size() == 0) return false;

        //delete the last one in indexSet
        Set<Integer> indexSet = map.get(val);
        int index = indexSet.iterator().next();  //get 1st element in set
        //list = {1,1,2}, map = {1:(0,1); 2:(2)}, remove 1
        //index = 0

        //swap the value in index with last value in list, then delete the last value
        int lastValue = list.get(list.size()-1);
        list.set(index, lastValue);
        list.set(list.size()-1, val);

        //lastValue = 2, list = {1,2,1}

        //update map, remove last index in list and add new index
        map.get(lastValue).add(index);
        map.get(lastValue).remove(list.size()-1);

        list.remove(list.size()-1);

        return true;

    }

    public int getRandom(){
        Random random = new Random();
        int size = list.size();
        int index =  random.nextInt(size);
        return list.get(index);

    }

}
