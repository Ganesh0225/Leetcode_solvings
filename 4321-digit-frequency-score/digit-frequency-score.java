class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int d=n%10;
            map.put(d,map.getOrDefault(d,0)+1);
            n/=10;
        }
        int score=0;
        for(int key:map.keySet()){
            score+=key*map.get(key);
        }
        return score;
    }
}