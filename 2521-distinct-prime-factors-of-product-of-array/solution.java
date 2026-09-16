// 10 ms | 47.4 MB
class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> primes = new HashSet<>();

        for (int num : nums) {
            for (int p = 2; (long) p * p <= num; p++) {
                while (num % p == 0) {
                    primes.add(p);
                    num /= p;
                }
            }

            if (num > 1)
                primes.add(num);
        }

        return primes.size();
    }
}