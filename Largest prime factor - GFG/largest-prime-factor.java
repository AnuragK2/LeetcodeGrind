//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        long maxPrime = -1; // Initialize the maximum prime factor
        
        // Divide N by 2 until it's an even number
        while (N % 2 == 0) {
            maxPrime = 2;
            N /= 2;
        }
        
        // Now, N is an odd number, so we only need to check odd factors
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                maxPrime = i;
                N /= i;
            }
        }
        
        // If N is a prime number greater than 2
        if (N > 2) {
            maxPrime = N;
        }
        
        return maxPrime;
    }
}