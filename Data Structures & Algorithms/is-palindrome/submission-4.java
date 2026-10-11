class Solution 
{
    public boolean isPalindrome(String s) 
    {
         if(s.isEmpty())
            return true;

        String ss = s.toLowerCase();

        int j = ss.length()-1;
        int i = 0;

       
        while(i<ss.length())
        {
            if(Character.isLetterOrDigit(ss.charAt(i))  )
                {
                    if(Character.isLetterOrDigit(ss.charAt(j)))
                    {
                        if(ss.charAt(i) == ss.charAt(j) )
                         {  
                            i++ ;
                            j-- ;
                         }
                        
                        else
                            return false;
                    }

                    else
                        j--;

                }
            else
            {
                i++ ;
                //j-- ;
            }
        }

        return true;
    }
}
