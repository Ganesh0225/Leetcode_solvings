class Solution {
    public int maxDigitRange(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxRange=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int m=val;
            int max=0,min=9;
            while(val>0){
                int x=val%10;
                max=Math.max(max,x);
                min=Math.min(min,x);
                val/=10;
            }
            int range=max-min;
            maxRange=Math.max(maxRange,range);
            map.put(i,range);
        }
        int sum=0;
        for(int key:map.keySet()){
            if(map.get(key)==maxRange) sum+=nums[key];
        }
        return sum;
    }
}