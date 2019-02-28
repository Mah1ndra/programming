
import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public Node sort(Node a,Node b){
        Node result = null;
        if(a==null)
            return b;
        if(b==null)
            return a;
        if(a.data <= b.data){
            result = a;
            result.next = sort(a.next,b);
        }else{
            result = b;
            result.next = sort(a,b.next);
        }
        return result;
    }
    public Node mergeSort(Node h){
        if(h==null||h.next==null)
            return h;
        Node middle = getMiddle(h);
        Node middleNext = middle.next;
        middle.next = null;
        Node left = mergeSort(h);
        Node right = mergeSort(middleNext);
        Node sortedList = sort(left,right);
        return sortedList;
    }
    public void push(int data){
        Node new_data = new Node(data);
        new_data.next = head;
        head = new_data;
    }
    public void printList(Node headref){
        while(headref!=null){
            System.out.print(headref.data+" ");
            headref = headref.next;
        }
    }
    public Node getMiddle(Node h){
       if (h == null) 
            return h; 
        Node fastptr = h.next; 
        Node slowptr = h; 
          
        // Move fastptr by two and slow ptr by one 
        // Finally slowptr will point to middle node 
        while (fastptr != null) 
        { 
            fastptr = fastptr.next; 
            if(fastptr!=null) 
            { 
                slowptr = slowptr.next; 
                fastptr=fastptr.next; 
            } 
        } 
        return slowptr; 
    }
}
class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		int n = in.nextInt();
		for(int i=0;i<n;i++){
		    int x = in.nextInt();
		    ll.push(x);
		}
		ll.head =ll.mergeSort(ll.head);
	    ll.printList(ll.head);
	    
	}
}

