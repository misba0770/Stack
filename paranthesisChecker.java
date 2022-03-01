
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
public class paranthesisChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
       String str=s.next();
       if(paranthesisCheck(str))System.out.print("balanced");
       else System.out.print("not balanced");
    }

    private static boolean paranthesisCheck(String x) {
       char[] arr=x.toCharArray();
        Stack<Character> st=new Stack<>();
          int size=arr.length;
         
        for(int i=0;i<size;i++){
              if(arr[i]=='('||arr[i]=='{'||arr[i]=='[')st.push(arr[i]);
            else if(arr[i]==')'||arr[i]=='}'||arr[i]==']'){
                  char temp=arr[i];
                 if(st.isEmpty()||!check(temp,st.peek()))return false;
                 else st.pop();
                 
              }
             
          }
          return st.isEmpty()?true:false;
    }
     static boolean check(char b,char a){
        if(a=='('&&b==')')return true;
        if(a=='{'&&b=='}')return true;
        if(a=='['&&b==']')return true;
        return false;
    }
    
}
