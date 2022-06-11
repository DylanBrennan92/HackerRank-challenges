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


public class Solution {
    

    public List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> results = new ArrayList<Integer>();
        int matchCounter;
        for(int i=0;i<queries.size();i++){
            matchCounter=0;
            String elementToCheck = queries.get(i);
            for(int j=0; j<strings.size();j++){
                if(elementToCheck.equals(strings.get(j))){
                    matchCounter++;
                }
            }
            results.add(matchCounter);
        }
            return results;

        }
        

    }



