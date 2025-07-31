// Last updated: 7/31/2025, 5:29:29 PM
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] ar = new int[10];
        for (int i = 0; i < digits.length; i++) {
            ar[digits[i]]++;
        }
        List<Integer> ans = new ArrayList<>();
        List<Integer> aw = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            aw.add(ar[i]);
        }
        int si = 100, en = 998;
        while (si <= en) {
            int r = si;
            boolean f = qaz(ar,r);
            if (f) {
                //System.out.println()
                ans.add(si);
            }
            for (int i = 0; i < 10; i++) {
                ar[i]=aw.get(i);
            }
            si = si + 2;
        }
        int[] qwe = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            qwe[i] = ans.get(i);
        }
        return qwe;

    }

    public static boolean qaz(int[] ar, int r) {
        while (r != 0) {
            if (ar[r % 10] <= 0) {
                return false;
            }
            ar[r%10]--;
            r = r / 10;
        }
        return true;

    }
}