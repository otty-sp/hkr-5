import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class power_sum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner A = new Scanner(System.in);
        int n = A.nextInt();
        int m = A.nextInt();
      if(n>= 1 && n<= 1000 && m>=2 && m<=10)
      {
          double root = Math.pow(n, 1/(double)m);
          int root1 = (int)root;
          int[] B = new int[root1];
          int id = 0;
          for (int i = 0; 1<B.length; i++)
          {
              B[i] = (int)Math.pow(1+i,m);
              
          }
          int C = 0;
          for(int j = B.length-1; j>=0; j--)
          {
              C = B[j]+C;
              for(int k = B.length-1;k>=0;k--)
              {
                  if(C==n)
                  {
                      id++;
                      C = B[j] + B[k];
                  }
                  else if(C<n){
                      C = C + B[k];
                  }
                  else {
                      C = B[j] + B[k];
                  }
              }
                C = 0;
          }
          System.out.println(id);
      }
        
    }
}
