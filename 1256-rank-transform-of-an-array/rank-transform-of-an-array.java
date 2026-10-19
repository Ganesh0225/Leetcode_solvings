class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=1;
        for(int val:sorted){
            if(!map.containsKey(val)) map.put(val,i++);
        }
        for(i=0;i<arr.length;i++){
            sorted[i]=map.get(arr[i]);
        }
        return sorted;
    }
}