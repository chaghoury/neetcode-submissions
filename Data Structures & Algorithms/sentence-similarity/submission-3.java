class Solution {
    public boolean areSentencesSimilar(
        String[] sentence1,
        String[] sentence2,
        List<List<String>> similarPairs
        ) {
        if (sentence1.length != sentence2.length) {
            return false;
        }

        if (similarPairs.isEmpty()) {
            return true;
        }
        
        Set<String> lookupKeys = new HashSet<>();
        for (List<String> similarPair : similarPairs) {
            String first = similarPair.get(0);
            String second = similarPair.get(1);
            String key = first + second;

            lookupKeys.add(key);
        }

        for (int i = 0; i < sentence1.length; i++) {
            String first = sentence1[i];
            String second = sentence2[i];

            if (first.equals(second)) {
                continue;
            }

            String firstKey = first + second;
            String secondKey = second + first;

            if (!lookupKeys.contains(firstKey) && !lookupKeys.contains(secondKey)) {
                return false;
            }
        }


        return true;
    }
}
