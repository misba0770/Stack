class Solution
{
    class Interval{
        int start;
        int end;
          Interval(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    
    public int[][] overlappedInterval(int[][] Intervals)
    {
        
        if(Intervals.length==1)return Intervals;
        Stack<Interval> st=new Stack<>();
        Arrays.sort(Intervals, (a, b) -> {
           return a[0] - b[0]; 
        });
    st.push(new Interval(Intervals[0][0],Intervals[0][1]));
    for(int i=1;i<Intervals.length;i++){
        
        Interval temp=st.peek();
        if(temp.end<Intervals[i][0]){
            st.push(new Interval(Intervals[i][0],Intervals[i][1]));
        }else{
            st.pop();
            if(temp.end<Intervals[i][1]){
                Interval x=new Interval(temp.start,Intervals[i][1]);
                st.push(x);
            }
            else  st.push(temp);
            //st.push(new Interval(temp.start,Intervals[i][1]));
        }
    }
    int ans[][]=new int[st.size()][2];
    int n=ans.length-1;
    while(!st.isEmpty()){
        Interval temps=st.pop();
        ans[n][0]=temps.start;
        ans[n][1]=temps.end;
        n--;
    }
    return ans;
    
    }
}
