
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
public class nextLargestElement {

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
        long sol[]=nextLargestElement(arr,n);
        for(long a:sol){
            System.out.print(a+" ");
        }
    }

    private static long[] nextLargestElement(long[] arr, int n) {
       Stack<Long> st=new Stack<>();
       long ans[]=new long[n];
       int x=n-1;
       for(int i=n-1;i>=0;i--){
           while(!st.isEmpty()&&arr[i]>=st.peek())st.pop();
           ans[x--]=st.isEmpty()?-1:st.peek();
           st.push(arr[i]);
       }return ans;
    }
    
}
