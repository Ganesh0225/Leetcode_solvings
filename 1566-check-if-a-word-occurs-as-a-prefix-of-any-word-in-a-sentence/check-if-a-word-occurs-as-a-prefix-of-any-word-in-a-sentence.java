class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sts=sentence.split("\\s+");
        int len=searchWord.length();
        for(int i=0;i<sts.length;i++){
            String s=sts[i];
            if(s.startsWith(searchWord)) return i+1;
        }
        return -1;
    }
}