// Last updated: 12/20/2025, 7:23:04 AM
1class Solution {
2
3    public boolean isAdditiveNumber(String num) {
4
5        int n = num.length();
6
7        for (int i = 0; i < n - 2; i++) {
8
9            // first number leading zero check
10            if (num.charAt(0) == '0' && i > 0) break;
11
12            for (int j = i + 1; j < n - 1; j++) {
13
14                // second number leading zero check
15                if (num.charAt(i + 1) == '0' && j > i + 1) break;
16
17                if (checker(num.substring(0, i + 1),
18                            num.substring(i + 1, j + 1),
19                            num,
20                            j + 1)) {
21                    return true;
22                }
23            }
24        }
25        return false;
26    }
27
28    public boolean checker(String a, String b, String num, int idx) {
29
30        while (idx < num.length()) {
31            String sum = helper(a, b);
32
33            if (!num.startsWith(sum, idx)) {
34                return false;
35            }
36
37            idx += sum.length();
38            a = b;
39            b = sum;
40        }
41
42        return true;
43    }
44
45    public String helper(String a, String b) {
46
47        StringBuilder r1 = new StringBuilder(a).reverse();
48        StringBuilder r2 = new StringBuilder(b).reverse();
49
50        StringBuilder sb = new StringBuilder();
51        int carry = 0;
52        int i = 0;
53
54        while (i < r1.length() || i < r2.length() || carry > 0) {
55
56            int sum = carry;
57
58            if (i < r1.length()) sum += r1.charAt(i) - '0';
59            if (i < r2.length()) sum += r2.charAt(i) - '0';
60
61            sb.append(sum % 10);
62            carry = sum / 10;
63            i++;
64        }
65
66        return sb.reverse().toString();
67    }
68}
69