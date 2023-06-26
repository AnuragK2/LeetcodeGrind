//2.PriorityQueue
    //Runtime: 113 ms, faster than 80.00% of Java online submissions for Total Cost to Hire K Workers.
        //Memory Usage: 52.8 MB, less than 100.00% of Java online submissions for Total Cost to Hire K Workers.
            //Time: O(N * 2*log(2*N) + K * 2*log(2*N)); Space: O(N)
                //Time: O((N + K) * log(N)); Space: O(N)
                    //let N be the number of candidates; K is the k;
                    class Solution{
                        public long totalCost(int[] costs, int k, int candidates) {
                                int left = 0, right = costs.length - 1;

                                        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> (costs[a] - costs[b] != 0 ? costs[a] - costs[b] : a - b));
                                                for (int i = 0; i < candidates && left <= right; i++) {
                                                            priorityQueue.add(left++);
                                                                        if (left <= right) priorityQueue.add(right--);
                                                                                }

                                                                                        long res = 0;
                                                                                                while (k > 0) {
                                                                                                            int idx = priorityQueue.poll();
                                                                                                                        if (left <= right && left < costs.length && right >= 0) {
                                                                                                                                        if (idx <= left) priorityQueue.add(left++);
                                                                                                                                                        else priorityQueue.add(right--);
                                                                                                                                                                    }
                                                                                                                                                                                res += costs[idx];
                                                                                                                                                                                            k--;
                                                                                                                                                                                                    }
                                                                                                                                                                                                            return res;
                                                                                                                                                                                                                }
                    }