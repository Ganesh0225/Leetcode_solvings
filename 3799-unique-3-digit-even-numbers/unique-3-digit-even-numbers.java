class Solution {
    public int totalNumbers(int[] digits) {
        int[] f = new int[10];
        int res = 0;

        for (int d : digits) f[d]++;
 
        // Iterate through all possible 3-digit even numbers:
        // i: hundreds place (1-9, no leading zero)
        // j: tens place (0-9)
        // k: units place (0, 2, 4, 6, 8 for even)
        for (int i = 1; i < 10; i++) 
            for (int j = 0; j < 10; j++) 
                for (int k = 0; k < 9; k += 2) {
                    f[i]--; f[j]--; f[k]--;

                    if (f[i] >= 0 && f[j] >= 0 && f[k] >= 0) res++;

                    f[i]++; f[j]++; f[k]++;
                }           
        

        return res;
    }
}