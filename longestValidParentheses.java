
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
public class longestValidParentheses {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.print(longestValid(str));
    }

    private static int longestValid(String s) {
         Stack<Integer> st=new Stack<>();
        int res=0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')st.push(i);
            else{
                st.pop();
                if(!st.isEmpty()){
                    int temp=i-st.peek();
                    res=Math.max(temp,res);
                }
                else{
                    st.push(i);
                }
            }
        }
        return res;
    }
    
}
