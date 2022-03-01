
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class stacksUsingQueues {

   
    public static void main(String[] args) {
       Stack st=new Stack();
       st.add(10);
       st.add(20);
       st.add(30);
       st.add(40);
       while(!st.isEmpty()){
           System.out.print(st.pop()+" ");
       }
    }

    private static class Stack {

        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        void add(int x){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        boolean isEmpty(){
            return q1.isEmpty();
        }
        int pop(){
            return q1.remove();
        }
    }
    
}
