class Solution {
    public static int isStackPermutation(int N, int[] A, int[] B) {
        // code here
        int j=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<N;i++){
            st.push(A[i]);
            while(!st.isEmpty()&&st.peek()==B[j]){
                st.pop();
                j++;
            }
        }
        if(st.isEmpty())return 1;
        return 0;
    }
}
        
