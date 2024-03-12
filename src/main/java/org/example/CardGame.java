package org.example;

import java.util.Random;

public class CardGame {

    public int[] shuffleArray(int[] array){
        Random random = new Random();
        int size = array.length;
        for(int i = 0; i < array.length; i++) {
            int index = random.nextInt(size);
            //swap element
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    public void gameResults(int[] array){
        int[] newArray = shuffleArray(array);
        int firstScore = 0;
        int secondScore = 0;
        int i = 0;
        while(i+1 < newArray.length){
            if(newArray[i] > newArray[i+1]){
                firstScore +=2;
            }else{
                secondScore += 2;
            }
            i += 2;
        }
        if(firstScore >= secondScore){
            System.out.println("winner is: firstPerson with " + firstScore + " score");
            System.out.println("loser is: secondPerson with " + secondScore + " score");
        } else{
            System.out.println("winner is: secondPerson with " + secondScore + " score");
            System.out.println("loser is: firstPerson with " + firstScore + " score");
        }


    }


}
