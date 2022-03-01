
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
public class reverseStackRecursion {

    static Stack<Integer> st=new Stack<>();
    public static void main(String[] args) {
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        reverseStack();
        System.out.print(st);
    }

    private static void reverseStack() {
       if(st.size()>0){
           int x=st.pop();
           reverseStack();
           insertAtLast(x);
       }
    }
    public static void insertAtLast(int x){
        if(st.isEmpty())st.push(x);
        else{
            int a=st.pop();
            insertAtLast(x);
            st.push(a);
        }
    }
    
}
