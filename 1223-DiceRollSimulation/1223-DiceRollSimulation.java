// Last updated: 12/3/2025, 8:17:53 PM
class Solution {
    public static final long MOD = 1000000007;
    public int dieSimulator(int n, int[] rollMax) {
        long[][] counts = new long[6][];
        

        for (int i = 0; i < 6; i++) {
            counts[i] = new long[rollMax[i]];
            counts[i][0] = 1; 
        }

        long totalSeqsFromLastStep = 6;
        for (int step = 1; step < n; step++) {
            long totalSeqsFromThisStep = 0;

            for (int endsWith = 0; endsWith < 6; endsWith++)
            {
                long[] validSeqsWithSuffix = counts[endsWith];

                long totalOldSeqsWithSuffix = validSeqsWithSuffix[validSeqsWithSuffix.length - 1];
                for (int i = validSeqsWithSuffix.length - 1; i > 0; i--)
                {
                    long withSuffix = validSeqsWithSuffix[i - 1];
                    validSeqsWithSuffix[i] = withSuffix; 
                    
                    totalOldSeqsWithSuffix += withSuffix;
                    totalSeqsFromThisStep += withSuffix; 
                }

                long withSuffixSizeOne = (totalSeqsFromLastStep - totalOldSeqsWithSuffix + MOD) % MOD;
                validSeqsWithSuffix[0] = withSuffixSizeOne;
                totalSeqsFromThisStep += withSuffixSizeOne;
            }

            totalSeqsFromLastStep = totalSeqsFromThisStep % MOD;
        }

        return (int) totalSeqsFromLastStep;
    }
}