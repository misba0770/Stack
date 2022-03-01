/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class stackFromScratch {

    
    public static void main(String[] args) {
        Stack st=new Stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    private static class Stack {
       private int arr[];
       private int s;
       private int top;
        public Stack(int size) {
            s=size;
            arr=new int[s];
            top=-1;
        }
        public void push(int x){
            arr[++top]=x;
        }
        public int pop(){
            return arr[top--];
        }
        public int peek(){
            return arr[top];
        }
        public boolean isEmpty(){
            return top==-1;
        }
        public boolean isFull(){
            return top==s-1;
        }
    }
    
}
