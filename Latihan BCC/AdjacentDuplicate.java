import java.io.*;
import java.util.*;

public class AdjacentDuplicate { 
    public String removeDuplicates(String string) { 
        if (string == null) { 
            return null; 
        } 
        char[] chars = string.toCharArray(); 
        char previous = ' '; 
        int i = 0; 
        for (char c: chars) { 
            if (c != previous) { 
                chars[i++] = c; previous = c; 
            } 
        }
        return new String(chars).substring(0, i); } 
    public static void main(String[] args) { 
        AdjacentDuplicate adj = new AdjacentDuplicate(); 
        try (Scanner sc = new Scanner(System.in)){
        String string1 = sc.nextLine(); 
        String string2 = sc.nextLine(); 
        System.out.println(adj.removeDuplicates(string1)); 
        System.out.println(adj.removeDuplicates(string2)); 
        }
    } 
}