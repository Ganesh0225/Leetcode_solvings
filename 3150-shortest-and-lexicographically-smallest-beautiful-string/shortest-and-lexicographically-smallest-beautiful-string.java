class Solution {
    public String shortestBeautifulSubstring(String s, int k){
        String ans="";
        int l=0,r=0,len=0,minlen=101;
        int oneCount=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(ch=='1') oneCount++;
            // Shrink the window while count exceeds k or when leading char is '0'
            while(oneCount>k || (l<r && s.charAt(l)=='0')){
                if(s.charAt(l)=='1') oneCount--;
                l++;
            }
            //sub.compareTo(ans) < 0: Uses Java's built-in compareTo method to compare the two strings alphabetically (character by character)
            //returns negative when sub is lexicographucally smaller than ans
            //returns 0 if both identical
            //return positive otherwise
            if(oneCount==k){
                len=r-l+1;
                String sub=s.substring(l,r+1);
                if(len<minlen){
                    ans=sub;
                    minlen=len;
                }else if(len==minlen){
                    if(sub.compareTo(ans)<0){
                        ans=sub;
                    }
                }
            }
            r++;
        }
        return ans;
    }
    // public String shortestBeautifulSubstring(String s, int k) {
    //     StringBuilder ans=new StringBuilder();
    //     int l=0,r=0,minlen=101,len=0;
    //     int oneCount=0;
    //     while(r<s.length()){
    //         char ch=s.charAt(r);
    //         if(ch=='1') oneCount++;
    //         while(oneCount>k || (oneCount==k && s.charAt(l)=='0')){
    //             char c=s.charAt(l);
    //             if(oneCount>k){
    //                 if(c=='1') oneCount--;
    //                 l++;
    //             }else{
    //                 l++;
    //                 len=r-l+1;
    //                 if(len<minlen){
    //                     ans=new StringBuilder(s.substring(l,r+1));
    //                     minlen=len;
    //                 }
    //                 if(len==minlen){
    //                     ans=lexicographical(ans,new StringBuilder(s.substring(l,r+1)));
    //                 }
    //             }
    //         }
    //         if(oneCount==k){
    //             len=r-l+1;
    //             if(len<minlen){
    //                 ans=new StringBuilder(s.substring(l,r+1));
    //                 minlen=len;
    //             }
    //             if(len==minlen){
    //                     ans=lexicographical(ans,new StringBuilder(s.substring(l,r+1)));
    //             }
    //         }
    //         r++;
    //     }
    //     return ans.toString();
    // }
    // public StringBuilder lexicographical(StringBuilder ans,StringBuilder st){
    //     for(int i=0;i<ans.length();i++){
    //         if(ans.charAt(i)>st.charAt(i)) return st;
    //         else if(ans.charAt(i)<st.charAt(i)) return ans;
    //     }
    //     return ans;
    // }
}