class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;

            
        int i = 0;
        int m = matrix.length; // row length
        int n = matrix[0].length; // col length
        int l = 0, r = n-1;
        
        while(l<=r && i<m)
        {
            if(target == matrix[i][r])
                return true;
            else if(target < matrix[i][r])
            {
                int mid = l+(r-l)/2;

                if(target == matrix[i][mid])
                    return true;
                
                else if(target < matrix[i][mid])
                    r = mid-1;
                else
                    l = mid+1;

            }
            else
            {
                i++;
                l = 0;
                r = n-1; 
            }
        }

        return false;

        
    }
}
