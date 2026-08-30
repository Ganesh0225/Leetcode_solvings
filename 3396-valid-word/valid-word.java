class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        word=word.toLowerCase();
        boolean spl=false,vowel=false,consonant=false;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                spl=true;
                break;
            }
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowel=true;
            else if(!Character.isDigit(ch)) consonant=true;
        }
        if(spl) return false;
        if(vowel && consonant) return true;
        return false;
    }
}