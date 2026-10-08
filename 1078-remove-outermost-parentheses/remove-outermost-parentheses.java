class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') st.push('(');
            count=st.size();
            if(count>1) sb.append(ch);
            if(ch==')') st.pop();

        }
        return sb.toString();

    }
}