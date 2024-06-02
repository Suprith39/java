package hackerrank.java;

import java.util.*;

public class End_of_life {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=100;
        
        
        String S[]=new String[n];
        
        for (int i = 0; i < n; i++) {
            S[i]=sc.nextLine();
            System.out.println((i+1)+" "+S[i]);
            
        }
        sc.close();
    }
}

    

