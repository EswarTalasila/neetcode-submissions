class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            map.computeIfAbsent(sortedString, k -> new ArrayList<String>()).add(str);
        }

                return new ArrayList<>(map.values());

    }
}
