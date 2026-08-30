class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int minIndex=0,maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min || nums[i]==max) list.add(i);
        }
        if(min==max) list.add(list.get(0));
        int left=list.get(1)-0+1;
        int right=nums.length-list.get(0);
        int both=(list.get(0)-0+1)+(nums.length-list.get(1));
        System.out.println(list+" "+left+" "+right+" "+both);
        return Math.min(both,Math.min(left,right));
    }
}