// Last updated: 12/13/2025, 6:20:45 AM
1class Solution {
2    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
3        List<String[]> valid = new ArrayList<>();
4    
5        // Define the required order of business lines
6        Map<String, Integer> orderMap = Map.of(
7            "electronics", 0,
8            "grocery", 1,
9            "pharmacy", 2,
10            "restaurant", 3
11        );
12    
13        for (int i = 0; i < code.length; i++) {
14            if (isActive[i] &&
15                code[i] != null &&
16                !code[i].isEmpty() &&
17                code[i].matches("[a-zA-Z0-9_]+") &&
18                orderMap.containsKey(businessLine[i])) {
19                
20                valid.add(new String[]{businessLine[i], code[i]});
21            }
22        }
23    
24        // Sort by businessLine order, then by code lexicographically
25        valid.sort((a, b) -> {
26            int cmp = Integer.compare(orderMap.get(a[0]), orderMap.get(b[0]));
27            return cmp != 0 ? cmp : a[1].compareTo(b[1]);
28        });
29    
30        // Collect only the sorted codes
31        List<String> result = new ArrayList<>();
32        for (String[] pair : valid) {
33            result.add(pair[1]);
34        }
35    
36        return result;
37    }
38}