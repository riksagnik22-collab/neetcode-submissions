class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        if(s == null || s.isEmpty())
            return 0;
        
        int max = 0;
        int left = 0;
        

        Set<Character> seen = new HashSet<>();

        for(int right=0; right<s.length(); right++)
        {
           char currChar = s.charAt(right);
            while(seen.contains(currChar))
            {
                seen.remove(s.charAt(left));
                left++;

            }
            
            
                seen.add(currChar);
                max = Math.max(max, right-left+1);
                
                 

            
        }

        return max;
    }
}         