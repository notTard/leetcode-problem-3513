class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        
        // частные  случаи
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        // количество бит в n
        int k = Integer.toBinaryString(n).length();
        
        // Ответ = 2^k
        return 1 << k;
    }
}
