package org.example;

import java.util.*;

//Step1: insert(int val) O(1); key Random() O(1) --> HashMap<>(val, index)/ HashSet<>(val)
//step2: insert(int val) O(1); value Random() O(1) --> HashMap<>(index, val)
//step3: remove(int val) O(1)  --> HashMap<val, index> + ArrayList()
public class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;

    public RandomizedSet(){
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public boolean insert(int val){
        if(map.containsKey(val)){
            return false;
        }else{
            map.put(val, map.size());
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val){

        if(map.containsKey(val)){
            int index = map.get(val);
            //switch value in index with last value in list, so no empty value in all index
            if(index != list.size()-1){
                int lastElement =  list.get(list.size()-1);
                list.set(index, lastElement);
                list.set(list.size()-1, val);
                //update map
                map.put(lastElement, index);
            }
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }else{
            return false;
        }

    }

    public int getRandom(){
        Random random = new Random();
        int size = map.size();
        int index =  random.nextInt(size);
        return list.get(index);

    }



//    public int getRandom(){
//        List<Integer> arr = new ArrayList<>();
//        arr.addAll(set);
//        Random random = new Random();
//        int size = set.size();
//        int index = random.nextInt(size);
//        return arr.get(index);
//    }
}
