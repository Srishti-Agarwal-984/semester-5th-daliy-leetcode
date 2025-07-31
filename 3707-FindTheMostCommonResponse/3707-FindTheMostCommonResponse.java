// Last updated: 7/31/2025, 5:26:32 PM
import java.util.*;

class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        List<HashSet<String>> ar1 = new ArrayList<>();
        for (int i = 0; i < responses.size(); i++) {
            HashSet<String> arr = new HashSet<>();
            for (int j = 0; j < responses.get(i).size(); j++) {
                arr.add(responses.get(i).get(j));
            }
            ar1.add(arr);
        }

        HashMap<String, Integer> countMap = new HashMap<>();

        for (HashSet<String> dayResponses : ar1) { // Corrected type here
            for (String response : dayResponses) { // Loop directly over HashSet
                countMap.put(response, countMap.getOrDefault(response, 0) + 1);
            }
        }
        String result = "";
        int maxCount = 0;

        for (String response : countMap.keySet()) {
            int count = countMap.get(response);

            if (count > maxCount || (count == maxCount && response.compareTo(result) < 0)) {
                maxCount = count;
                result = response;
            }
        }
        return result;

    }
}