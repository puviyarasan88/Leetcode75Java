import java.util.HashMap;

public class Leetcode1_TwoSum {
    public static void main(String[] args) {
        int[] num = {5 ,1, 1, 2, 9};
        int total = 11;

        int[] s = twoSum(num, total);

        for(int temp:s)
        {
            System.out.println(temp);
        }

    }

    private static int[] twoSum(int[] num, int total) {

        HashMap<Integer, Integer> numValue = new HashMap<>();

        for(int i=0; i<num.length; i++)
        {
            int diffValue = total - num[i];
            if(numValue.containsKey(diffValue))
            {
                return new int[]{numValue.get(diffValue), i};
            }
            else {
                numValue.put(num[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}
