import java.io.*;
import java.util.*;
import java.lang.*;

class LongestSubString{
    public static String getLongestSubString(String s){
        // HashMap <Character, Integer> map = new HashMap<Character, Integer>();
        String longestSubStr = "";
        // int maxIndex = Integer.MIN_VALUE;
        // for(int i = 0; i< s.length(); i++){
        //     int currCharMIdx = map.getOrDefault(s.charAt(i),-1);
        //     if(currCharMIdx != -1){
        //         int len = i - map.get(s.charAt(i));
        //         maxIndex = Math.max(len,maxIndex);
        //         if(len != maxIndex){
        //             longestSubStr = "";
        //             longestSubStr += s.charAt(i);
        //         }
        //         else{
        //             longestSubStr += s.charAt(i);
        //         }
        //     }
        //     else{
        //         if(longestSubStr == ""){
        //             longestSubStr += s.charAt(i);
        //         }
        //     }
        //     map.put(s.charAt(i),i);
        // }
        return longestSubStr;
    }
    public static void main(String args []){
        String s = "abcdefghabcdefghijklma";
        LongestSubString str = new LongestSubString();
        String longestSubStr = str.getLongestSubString(s);
        System.out.println(longestSubStr);
    }
}
