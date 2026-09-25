class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sts=sentence.split("\\s+");
        int len=searchWord.length();
        for(int i=0;i<sts.length;i++){
            String s=sts[i];
            if(s.length()>len){
                String sub=s.substring(0,len);
                if(sub.equals(searchWord)) return i+1;
            }else if(s.length()==len){
                if(s.equals(searchWord)) return i+1;
            }
        }
        return -1;
    }
}