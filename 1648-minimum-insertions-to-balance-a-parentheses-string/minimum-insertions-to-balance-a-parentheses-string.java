// class Solution {
//     public int minInsertions(String s) {
//         Stack<Character> st=new Stack<>();
//         int empty=0,ans=0;
//         boolean added=false,popped=false;;
//         for(char ch:s.toCharArray()){
//             if(ch=='('){
//                 if(popped){
//                     ans+=st.size();
//                     st.clear();
//                     popped=false;
//                 }
//                 st.push('(');
//                 st.push('(');
//                 //if(!st.isEmpty()) added=true;
//                 //else added=false;
//             }else{
//                 if(!st.isEmpty()) added=true;
//                 else added=false;
//                 if(added){
//                     st.pop();
//                     popped=true;
//                 }
//                 else empty++;

//             }
//         }
//         ans+=st.size();
//         if(empty%2==0) ans+=(empty/2);
//         else{
//             ans+=((empty/2)+2);
//         }
//         return ans;
        
//     }
// }
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                // Check whether the next character is also ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    // Insert one ')' to complete the pair
                    ans++;
                }

                if (open > 0) {
                    open--;
                } else {
                    // Insert one '(' to match the closing pair
                    ans++;
                }
            }
        }

        // Each unmatched '(' needs two ')'
        ans += open * 2;

        return ans;
    }
}