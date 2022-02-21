
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class maxAreaHistogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       long arr[]=new long[n];
       for(int i=0;i<n;i++){
           arr[i]=s.nextLong();
       }
       System.out.print(histogramArea(arr,n));
    }

    private static long histogramArea(long[] arr, int n) {
      
        Stack<Integer> st1=new Stack<>();
        int[] rightmin=new int[n];
        int x=n-1;
        for(int i=n-1;i>=0;i--){
            while(!st1.isEmpty()&&arr[st1.peek()]>=arr[i])st1.pop();
            rightmin[x--]=st1.isEmpty()?n:st1.peek();
            st1.push(i);
        }
         Stack<Integer> st2=new Stack<>();
        int[] leftmin=new int[n];
        x=-1;
        for(int i=0;i<n;i++){
            while(!st2.isEmpty()&&arr[st2.peek()]>=arr[i])st2.pop();
            leftmin[++x]=st2.isEmpty()?-1:st2.peek();
            st2.push(i);
        }
        int[] width=new int[n];
        for(int i=0;i<n;i++){
            width[i]=rightmin[i]-leftmin[i]-1;
        }
        long area=0;
        for(int i=0;i<n;i++){
            area=Math.max(area,width[i]*arr[i]);
        }
        return area;
    }
       
    }
    

