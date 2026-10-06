class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> res = new HashMap<>();

        if(strs.length == 0)
            return new ArrayList<>();

        for(String s : strs)
        {
            int [] count = new int [26];
            char [] s1 = s.toCharArray();

            for(char c : s1)
                count[c - 'a']++ ;
            
            String key = Arrays.toString(count);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
        
    }
}
