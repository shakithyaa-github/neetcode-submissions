class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bag = new ArrayList[nums.length + 1];

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bag[freq] == null) {
                bag[freq] = new ArrayList<>();
            }
            bag[freq].add(key);
        }

        int[] ans = new int[k];
        int a = 0;

        for (int i = bag.length - 1; i >= 0; i--) {
            if (bag[i] != null) {
                for (int num : bag[i]) {
                    ans[a++] = num;
                    if (a == k) {
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}