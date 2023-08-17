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
      for(int i=0;i<n;i++){
          for(int j=1;j<n-i;j++){
             System.out.print(" ");
          }
          char ch='A';
          int th=(2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
           System.out.print(ch);
            if(th>=j) ch++;
            else ch--;
            
        }
         for(int j=1;j<n-i;j++){
             System.out.print(" ");
          }
        
    System.out.println("");
    }
    }
}