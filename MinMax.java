import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        
        long minSum=0;
        long maxSum=0;
        
        //Convert int[] to an Integer list object
        List<Integer> aList = new ArrayList<Integer>();
        for (int i : arr){
            aList.add(i);
        }
        
        //Convert Integer list object to a Long object
        List<Long> longList = aList.stream()
        .mapToLong(Integer::longValue)
        .boxed().collect(Collectors.toList());

        //sort the longList by smallest to largest
        Collections.sort(longList);
    
        //calc minSum
        for(int i=0;i<longList.size()-1;i++){
            minSum += longList.get(i);
        }

        //calc maxSum
        for(int i=1;i<longList.size();i++){
            maxSum += longList.get(i);
        }
        System.out.printf(minSum + " " + maxSum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
