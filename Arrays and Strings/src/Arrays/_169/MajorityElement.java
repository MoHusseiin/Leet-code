package Arrays._169;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement {

	/**
	 * Find the majority element. The majority element is the element that appears more than n/2 times.
	 * @param nums
	 * @return The majority element
	 */
	public int majorityElement(int[] nums) {
		int majorityCount = nums.length / 2;
		Map<Integer, Long> counts = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		Map<Integer, Long> filtter = counts.entrySet().stream().filter((k) -> k.getValue() > majorityCount).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		return Collections.max(filtter.entrySet(), (e1, e2) -> e1.getValue().intValue() - e2.getValue().intValue()).getKey();
    }
	
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }

    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
   }

    public int majorityElementBest(int[] nums) {
    	Arrays.sort(nums);
    	return nums[nums.length / 2];
    }
}