
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
public class celebrityProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int arr[][]=new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               arr[i][j]=s.nextInt();
           }
       }
        System.out.print(checkCeleb(arr,n));  
    }

    private static int checkCeleb(int[][] arr, int n) {
         Stack<Integer> st=new Stack<>();
       for(int i=0;i<n;i++){
           st.push(i);
       }
       while(st.size()>=2){
           int i=st.pop();
           int j=st.pop();
           if(arr[i][j]==1){
               st.push(j);
           }else{
               st.push(i);
           }
           
       }
       int potential=st.pop();
       for(int i=0;i<n;i++){
           if(i!=potential){
               if(arr[i][potential]==0||arr[potential][i]==1)return -1;
           }
       }
       return potential;
    }
    
}