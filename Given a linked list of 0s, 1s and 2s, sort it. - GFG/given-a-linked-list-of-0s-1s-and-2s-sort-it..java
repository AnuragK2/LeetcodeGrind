//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node newHead=head;
        
        Node h1=new Node(0),h2=new Node(1),h3=new Node(2);
        Node t1=h1,t2=h2,t3=h3;
        
        while(newHead!=null){
         
            if(newHead.data==0){
                t1.next=newHead; 
                t1=t1.next;
            }  
            else if(newHead.data==1){
                t2.next=newHead; 
                t2=t2.next;
            }else{
                t3.next=newHead; 
                t3=t3.next;
            } 
            newHead=newHead.next;
        }
        
        t1.next=(h2.next!=null) ? h2.next : h3.next;
        t2.next=h3.next;
        t3.next=null;
        
        
        return h1.next;
    }
}


