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
import java.util.Arrays;
import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args){

        List<String> strings = new ArrayList<String>(){{add("ab"); add("ab"); add("abc");}};
        List<String> queries = new ArrayList<String>(){{add("ab"); add("abc"); add("bc");}};
        List<Integer> results = new ArrayList<Integer>();
        System.out.println("queries size is " + queries.size());

        Solution s = new Solution();
        results = s.matchingStrings(strings, queries);

        //String text = results.stream().map(Object::toString).collect(Collectors.joining());
       
        //print final output as a single line array
        System.out.println(Arrays.toString(results.toArray()));

    }
}
