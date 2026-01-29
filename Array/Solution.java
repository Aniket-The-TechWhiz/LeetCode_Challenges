package leetcode.Array;
class Solution {
    public static void main(String args[])
    {
        int arr[]={1,2,4,3,5};
        try {
            int[] solution=twoSum(arr,9);
            if(solution.length > 0)
            {
                System.out.println("["+solution[0]+","+solution[1]+"]");
            }
            else
            {
                System.out.println("Not match found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
