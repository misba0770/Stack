
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
public class stockSpan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }
       int[] res=stockSpan(arr,n);
       for(int i:res)System.out.print(i+" ");
    }

    private static int[] stockSpan(int[] arr, int n) {
         Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[i]>=arr[st.peek()])st.pop();
            if(st.size()>0)ans[i]=i-st.peek();
            else {
                ans[i]=i+1;
            }  
            st.push(i);
        }
        return ans;
    }
    
}
