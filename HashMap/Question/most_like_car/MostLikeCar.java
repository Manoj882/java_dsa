/*

Question -> We asked 8 diffenrent people to tell their favourite cars. All of their favourites cars store in
car list. Now, Find a car which is liked the most.

 Input: 
 cars[] = {"Tesla","Ferrari","Honda", "BMW", "Tesla","BMW", "Tesla","Ferrari"};

 OutPut: Tesla

 */

import java.util.*;

public class MostLikeCar {

    public static void main(String[] args) {
        
        String[] cars = {"Tesla","Ferrari","Honda", "BMW", "Tesla","BMW", "Tesla","Ferrari"};

        Map<String, Integer> carFreq = new HashMap<String, Integer>();

        for(String car : cars){
            if(!carFreq.containsKey(car)){
                 carFreq.put(car, 1);
            } else {
                carFreq.put(car, carFreq.get(car) + 1);
            }
        }

        System.out.println(carFreq);

        System.out.println();
        
        int mostLikeFreq = 0;
        String mostLikeCar = "";

        for(String car : carFreq.keySet()){
            if(carFreq.get(car) > mostLikeFreq){
                mostLikeFreq = carFreq.get(car);
                mostLikeCar = car;
            }


        }

        System.out.printf("%s is the most like car and it " 
        + "is admired by %d people.", mostLikeCar, mostLikeFreq);

    }


    
}
