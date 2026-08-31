class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int zero=0;
        for(int val:arr){
            if(val==0) zero++;
            set.add(val);
        }
        if(zero>=2) return true;
        int i=0;
        while(i<arr.length){
            if(set.contains(arr[i]*2) && arr[i]!=0) return true;
            i++;
        }
        return false;
    }
}