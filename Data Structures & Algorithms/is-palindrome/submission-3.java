class Solution 
{
    public boolean isPalindrome(String s) 
    {
        

        String ss = s.toLowerCase();
        char [] s1 = new char[ss.length()];
        int count = 0;

        for(int i=0; i<ss.length(); i++)
        {
            if((ss.charAt(i)>='a' && ss.charAt(i)<='z') || (ss.charAt(i)>='0' && ss.charAt(i)<='9' ))
            {
                s1[count] = ss.charAt(i);
                count++;
            }
            else
                continue;
        }



        if(count == 0)
            return true;

        int i = 0;
        int j = count-1;
        int mid = (count-1)/2;

        

        while(i<=mid)
        {
            if(s1[i] != s1[j])
                return false;
            
            else
                {
                    i++;
                    j--;
                }
        }

        return true;
        
    }
}
