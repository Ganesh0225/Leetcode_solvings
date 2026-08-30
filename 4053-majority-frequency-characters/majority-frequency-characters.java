class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int[] indices=new int[s.length()+1];
        for(int val:map.values()){
            indices[val]++;
        }
        int max=0,maxIndex=0;
        for(int i=0;i<indices.length;i++){
            if(indices[i]>=max){
                max=indices[i];
                maxIndex=i;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char key:map.keySet()){
            if(map.get(key)==maxIndex) sb.append(key);
        }
        return sb.toString();
    }
}