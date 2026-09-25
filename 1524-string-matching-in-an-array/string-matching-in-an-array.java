class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String st=words[i];
            for(int j=0;j<words.length;j++){
                String s=words[j];
                if(i==j) continue;
                else if(s.contains(st)){
                    list.add(st);
                    break;
                }
            }
        }   
        return list;
    }
}