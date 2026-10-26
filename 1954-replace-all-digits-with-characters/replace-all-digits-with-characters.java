class Solution {
    public String replaceDigits(String s) {
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<s.length()-1;i=i+2){
        //     char ch=s.charAt(i);
        //     sb.append(ch);
        //     sb.append((char)(ch+(s.charAt(i+1)-'0')));
        // }
        // if(s.length()%2!=0) sb.append(s.charAt(s.length()-1));
        // return sb.toString();

        char[] ch=s.toCharArray();
        for(int i=0;i<s.length()-1;i=i+2){
            int val=ch[i+1]-'0';
            ch[i+1]=(char)(ch[i]+val);
        }
        return new String(ch);
        
    }
}