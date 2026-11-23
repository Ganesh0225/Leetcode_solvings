class Solution {
    public boolean checkString(String s) {
        boolean b=false;
        for(char ch:s.toCharArray()){
            if(ch=='a' && b==true) return false;
            if(ch=='b') b=true;
        }
        return true;
    }
}