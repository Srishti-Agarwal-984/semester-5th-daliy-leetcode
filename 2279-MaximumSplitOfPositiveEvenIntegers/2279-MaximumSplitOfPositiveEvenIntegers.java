// Last updated: 7/31/2025, 5:29:13 PM
class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> r = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return r;
        }
        long g = finalSum;
        for (long y = 2; y <= g; y = y + 2) {
            long jk = finalSum - y;
            //System.out.println(jk);
            if (jk != 0 && jk <= y) {
                r.add(finalSum);
                return r;
            }
            r.add(y);
            finalSum -= y;
            if (jk == 0) {
                break;
            }
        }
        return r;

    }
}