package Day13;

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) { 
	 // Write your code here. 
	  ArrayList<String> result = new ArrayList(); 
	   solve(0, s, dictionary, new ArrayList<String>(), result); 
	    return result; }

private static void solve(int index, String s, ArrayList<String> dictionary, List<String> ds, ArrayList<String> result)
 {  if (index == s.length()) 
 {   StringBuffer sb = new StringBuffer();  
  for (int i = 0; i<ds.size(); i++)
   {    sb.append(ds.get(i));    sb.append(" ");
      }   result.add(sb.toString());  
	   return;  }

 for (int i = index; i < s.length(); i++) 
 {   if(dictionary.contains(s.substring(index, i+1)))
  {    ds.add(s.substring(index, i+1));  
    solve(i+1, s, dictionary, ds, result); 
	   ds.remove(ds.size()-1);   }  } } }
