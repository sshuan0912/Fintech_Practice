package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestUniqueSubstring {
    public ShortestUniqueSubstring(){};
    //Input: ["cheapair", "cheapoair", "peloton", "pelican"]

    public Map<String, String> findShortestSubstring(List<String> input){

        Map<String, String> res = new HashMap<>();
        //iterate each string and fetch substring from (i, j)
        //check if other strings contain substring, if contains, move to next substring
        //if none contains, use shortest string to store it, add to map

        for(String str1: input){
            String shortest = str1;

            //iterate i和j，取substring(i, j)
            for(int i = 0; i < str1.length(); i++){
                for(int j = i + 1; j < str1.length(); j++){
                    String sub = str1.substring(i, j);
                    //是否this sub应该被add进res
                    boolean addSub = false;
                    for(String str2: input){
                        if(str2.equals(str1)) continue;
                        //if 其他string contain this sub，sub不是unqiue，addsub设为false，同时跳出loop，找下一个substring比较
                        if(str2.contains(sub)){
                            addSub = false;
                            break;
                        }else{
                            //if 这个string不含sub，不代表其他string不含sub，暂时将addsub设置为true
                            addSub = true;
                        }
                    }
                    //当所有的string都不含sub，addSub为true，判断该sub是否比之前的sub短，更短计入shortest
                    if(addSub == true && sub.length() < shortest.length()){
                        shortest = sub;
                    }
                }
            }
            //将shortest的push into map
            res.put(str1, shortest);
        }
        return res;

    }
}
