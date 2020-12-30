import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(ArrayList<Integer> candles) {
        HashMap<Integer, Integer> gyertyak = new HashMap<>();
        for (Integer e : candles) {
            gyertyak.put(e, gyertyak.getOrDefault(e, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : gyertyak.entrySet()) {
            System.out.println(e.getKey() + e.getValue());
        }
return 0;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner be=new Scanner(System.in);
        int n=be.nextInt();
        Scanner be2=new Scanner(System.in);
        String input=be2.nextLine();
        ArrayList<Integer>candles=new ArrayList<>();
        String temp[]=input.split(" ");
        for (int i = 0; i < temp.length; i++) {
            candles.add(Integer.parseInt(temp[i]));
        }
        //System.out.println(candles);


        HashMap<Integer, Integer> gyertyak = new HashMap<>();
        for (Integer e : candles) {
            gyertyak.put(e, gyertyak.getOrDefault(e,0)+1);
        }
        int max=0;
        for (Map.Entry<Integer, Integer> e : gyertyak.entrySet()) {
            //System.out.println(e.getKey() +"-"+ e.getValue());
            max=Integer.max(max,e.getValue());
        }
        System.out.println(max);

    }
}

