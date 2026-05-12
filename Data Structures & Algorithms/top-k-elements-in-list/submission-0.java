class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    for (int num : nums) {
        count.put(num, count.getOrDefault(num, 0) + 1);
    }
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < k; i++) {
        Map.Entry<Integer, Integer> maxEntry = Collections.max(count.entrySet(), 
            Map.Entry.comparingByValue());
        list.add(maxEntry.getKey());
        count.remove(maxEntry.getKey());
    }
    return list.stream().mapToInt(i -> i).toArray();
}
}
