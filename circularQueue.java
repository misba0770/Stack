/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */

public class circularQueue {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        q.enqueue(40);
        System.out.print(q.dequeue());
        
        
    }

    private static class Queue {
      int front;
      int rear;
      int n;
      int arr[];
        public Queue(int s) {
            front=-1;
            rear=-1;
            arr=new int[s];
            n=s;
        }

        private void enqueue(int i) {
           if((rear+1)%n==front)return;
           if(front==-1)front=0;
           rear=(rear+1)%n;
           arr[rear]=i;
           
        }
        private int dequeue(){
            if(front==-1)return -1;
            int ans=arr[front];
            if(front==rear){
                
                front=-1;
                rear=-1;
                
            }
            else
                front=front+1%n;
                return ans;
            }
            
        }
       
        
    }
    

