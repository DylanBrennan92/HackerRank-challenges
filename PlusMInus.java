import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.DecimalFormat;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        
    ArrayList<Float> floatArrayList = new ArrayList<>();
    float arrLength=0;   
    float zeroCount=0;
    float negativeCount=0;
    float positiveCount=0;
    float posRatio=0;
    float negRatio=0;
    float zeroRatio =0;
    
    for(int i=0; i<arr.size(); i++){
        if(arr.get(i)>=1){
            positiveCount++;
        }
        else if(arr.get(i)<0){
            negativeCount++;
        }
        else{
            zeroCount++;
        }
    }
    
    arrLength = arr.size();
    
     for(int i=0; i<arr.size(); i++){
            floatArrayList.add(arr.get(i).floatValue());
        }
        
    posRatio = (positiveCount / arrLength);
    negRatio = negativeCount / arrLength;
    zeroRatio = zeroCount / arrLength;
    
    System.out.printf("%.6f\n", posRatio);
    System.out.printf("%.6f\n", negRatio);
    System.out.printf("%.6f\n", zeroRatio);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

