class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue =
            new PriorityQueue<>((a, b) ->
                Integer.compare(frequency.get(a), frequency.get(b))
            );

        for (int num : frequency.keySet()) {
            queue.offer(num);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        return queue.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}