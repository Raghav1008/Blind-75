import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};        
    }
    public static int[] twosumOpt(int nums[], int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            int diff = target - nums[i];
            if(numToIndexMap.containsKey(diff)){
                return new int[]{i, numToIndexMap.get(diff)};
            }
            numToIndexMap.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int ans[] = twosumOpt(nums, target);
        for(int i =0; i<ans.length;i++) {
            System.out.println(ans[i] + " ");
        }

    }
}
