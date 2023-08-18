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
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
      //  int square=n/2;
      for(int i=0;i<n;i++){
         
          for(int k=0;k<n;k++){
            if(i==0 || k==0 || i==n-1 || k==n-1){
               System.out.print("*"); 
            } 
     
              else System.out.print(" ");
              
          }
          System.out.println("");
      }
    }
}