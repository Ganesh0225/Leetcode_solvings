class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int key=0,len=4;
        int place=1;
        while(len-->0){
            int min=(Math.min(num1%10,Math.min(num2%10,num3%10)));
            key+=(min*place);
            place*=10;
            num1/=10;
            num2/=10;
            num3/=10;
        }
        return key;
    }
}