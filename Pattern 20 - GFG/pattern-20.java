//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
      int spaces = 2*n-2;
      
  
      for(int i = 1;i<=2*n-1;i++){
          
      
          int stars = i;
          
    
          if(i>n) stars = 2*n - i;
          
         
          for(int j=1;j<=stars;j++){
              System.out.print("*");
          }
       
          for(int j = 1;j<=spaces;j++){
              System.out.print(" ");
          }
  
          for(int j = 1;j<=stars;j++){
              System.out.print("*");
          }
         
          System.out.println("");
          if(i<n) spaces -=2;
          else spaces +=2;
      }
}
}