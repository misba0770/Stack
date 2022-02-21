
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class trappingRainWater {

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
       System.out.print(trapRainwater(arr,n));    
    }

    private static long trapRainwater(int[] arr, int n) {
       int rightMax[]=new int[n];
       rightMax[n-1]=arr[n-1];
       for(int i=n-2;i>=0;i--){
           rightMax[i]=Math.max(rightMax[i+1], arr[i]);
       }
       int leftMax[]=new int[n];
       leftMax[0]=arr[0];
       for(int i=1;i<n;i++){
           leftMax[i]=Math.max(leftMax[i-1],arr[i]);
       }
       long ans=0;
       for(int i=0;i<n;i++){
           ans+=Math.min(leftMax[i], rightMax[i])-arr[i];
       }
       return ans;
    }
    
}
