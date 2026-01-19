public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int fib(int num) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		return fibHelper(num, map);
	}
	public static int fibHelper(int num, HashMap<Integer, Integer> map) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		if (map.containsKey(num)) {
			return map.get(num);
		}
		int answer = fibHelper(num - 1, map) + fibHelper(num - 2, map);
		map.put(num, answer);
		return answer;
	}
	public static int minCostClimbingStairs(int[] cost) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int start0 = minCostHelper(0, cost, map);
		int start 1 = minCostHelper(1, cost, map);
		return Math.min(start0, start1);
	}
	public static int minCostHelper(int index, int[] cost, HasmMap<Integer, Integer> map) {
		if (index >= cost.length) {
			return 0;
		}
		if (map.containsKey(index)) {
			return map.get(index);
		}
		int one = minCostHelper(index + 1, cost, map);
		int two = minCostHelper(index + 2, cost, map);
		int answer = cost[index] + Math.min(one, two);
		map.put(index, answer);
		return answer;
	}


	
}
