class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int i = 0;
        int j = numbers.length-1;

        while(i<j)
        {
            int curSum = 0;

            curSum = numbers[i] + numbers[j];

            if(curSum == target)
                return new int[]{i+1 , j+1};
            else
            {
                if(curSum > target)
                    j-- ;
                else
                    i++ ;
                
            }
        }

        return new int[0];
    }
}
