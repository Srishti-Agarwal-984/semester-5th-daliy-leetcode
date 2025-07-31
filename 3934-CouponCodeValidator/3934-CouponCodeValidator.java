// Last updated: 7/31/2025, 5:25:30 PM
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String[]> valid = new ArrayList<>();
    
        // Define the required order of business lines
        Map<String, Integer> orderMap = Map.of(
            "electronics", 0,
            "grocery", 1,
            "pharmacy", 2,
            "restaurant", 3
        );
    
        for (int i = 0; i < code.length; i++) {
            if (isActive[i] &&
                code[i] != null &&
                !code[i].isEmpty() &&
                code[i].matches("[a-zA-Z0-9_]+") &&
                orderMap.containsKey(businessLine[i])) {
                
                valid.add(new String[]{businessLine[i], code[i]});
            }
        }
    
        // Sort by businessLine order, then by code lexicographically
        valid.sort((a, b) -> {
            int cmp = Integer.compare(orderMap.get(a[0]), orderMap.get(b[0]));
            return cmp != 0 ? cmp : a[1].compareTo(b[1]);
        });
    
        // Collect only the sorted codes
        List<String> result = new ArrayList<>();
        for (String[] pair : valid) {
            result.add(pair[1]);
        }
    
        return result;
    }
}