class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted_string = new String(arr);

            if(map.containsKey(sorted_string)) {
                map.get(sorted_string).add(str);
            } else {
                map.put(sorted_string, new ArrayList<>(Arrays.asList(str)));
            }
        }

        return(new ArrayList<>(map.values()));
    }
}
