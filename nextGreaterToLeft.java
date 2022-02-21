
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
public class nextGreaterToLeft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextLong();
        }
        long sol[]=nextGreaterToLeft(arr,n);
        for(long a:sol){
            System.out.print(a+" ");
        }
    }

    private static long[] nextGreaterToLeft(long[] arr, int n) {
       long[] ans=new long[n];
       int x=-1;
       Stack<Long> st=new Stack<>();
       for(int i=0;i<n;i++){
           while(!st.isEmpty()&&arr[i]>=st.peek())st.pop();
           ans[++x]=st.isEmpty()?-1:st.peek();
           st.push(arr[i]);
       }return ans;
    }
    
}
