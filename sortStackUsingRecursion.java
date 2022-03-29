class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.size()==1)return s;
		int temp=s.pop();
		sort(s);
		insert(s,temp);
		return s;
	}
	void insert(Stack<Integer> st,int temp){
	    if(st.size()==0||st.peek()<=temp){
	        st.push(temp);
	        return;
	    }
	    int val=st.pop();
	    insert(st,temp);
	    st.push(val);
	    return;
	}
}
