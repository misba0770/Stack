/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class findMiddleStack {

     static class DLLNode {
        DLLNode left;
        int data;
        DLLNode right;
        DLLNode(int d) { data = d; }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);
        st.push(60);
        System.out.println("mid:"+st.findMid());
        st.pop();
        st.pop();
        System.out.print("deleted mid element:"+st.deleteMid());
    }

    private static class Stack {
      DLLNode head;
      DLLNode mid;
      int size=0;
        void push(int x){
            size++;
            if(head==null){
                head=new DLLNode(x);
                mid=head;
            }
            else{
                DLLNode temp=new DLLNode(x);
                head.left=temp;
                temp.right=head;
                head=temp;
                if(size%2==0){
                    mid=mid.left;
                }
            }
        }
        void pop(){
            size--;
            if(size==0){
                head=null; 
                mid=null;
            }
            else{
                head=head.right;
                head.left=null;
                if(size%2==1)mid=mid.right;
            }
        }
        int findMid(){
            return mid.data;
        }
        int deleteMid(){
            size--;
            int ans=mid.data;
            if(mid.right!=null){
                mid.left=mid.right.right;
            }
            if(mid.left!=null){
                mid.right=mid.left.left;
            }
            if(size%2==0)mid=mid.left;
            else mid=mid.right;
            return ans;
        }
    }
    
}
