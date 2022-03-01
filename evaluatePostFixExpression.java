
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
public class evaluatePostFixExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       String str=s.next();
       System.out.print(evaluate(str));
    }

    private static int evaluate(String S) {
        Stack<Integer> num=new Stack<>();
       
        char[] arr=S.toCharArray();
        for(int i=0;i<arr.length;i++){
            char temp=arr[i];
            if(temp=='+'||temp=='-'||temp=='*'||temp=='/'){
                char x=arr[i];
                int second=num.pop();
                int first=num.pop();
                int ans=solve(first,second,x);
                num.push(ans);
            }
            else num.push(temp-'0');
        }
        return num.pop();
    }

    private static int solve(int first, int second, char x) {
      if(x=='+')return first+second;
        else if(x=='-')return first-second;
        else if(x=='*')return first*second;
        else 
        return first/second;
    }
    
}
