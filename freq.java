/**
 * 
 * we have to find the rfeq from the 2d String
 */

import java.util.*;
public class freq{
    public static void main(String args[]){
        String str[][] = {
            {"apple", "bat"},
            {"cat", "apple"},
            {"bat", "dog"}
        };
        
        HashMap<String,Integer> map = new HashMap<>();
        //traversing for the 2d string
        for(int i =0;i<str.length;i++){
            for(int j=0;j<str[0].length;j++){
                String word = str[i][j];
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> b.getValue() - a.getValue());
        
        //print
        for(Map.Entry<String,Integer> entry: list){
            System.out.println(
                entry.getKey() +" -> "+entry.getValue()
            );
        }
    }
}