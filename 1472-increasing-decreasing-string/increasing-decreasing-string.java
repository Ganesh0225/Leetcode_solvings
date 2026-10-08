class Solution {
    public String sortString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        while(map.size()>0){
            for(char ch='a';ch<='z';ch++){
                if(map.getOrDefault(ch,0)>0){
                    sb.append(ch);
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0) map.remove(ch);
                }
            }
            for(char ch='z';ch>='a';ch--){
                if(map.getOrDefault(ch,0)>0){
                    sb.append(ch);
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0) map.remove(ch);
                }
            }

        }
        return sb.toString();
    }
}