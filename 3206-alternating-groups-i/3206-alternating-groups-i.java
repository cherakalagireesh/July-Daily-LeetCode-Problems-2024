class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        
        int cnt = 0;
        int len = colors.length;

        for(int i = 0 ; i < len ; i++)
        {
            if(i == len - 2 && colors[i] == colors[0] && colors[i] != colors[i + 1])
                cnt++;
            else if(i == len - 1 && colors[i] == colors[1] && colors[i] != colors[0])
                cnt++;
            else if( i < len - 2 && colors[i] == colors[i + 2] && colors[i] != colors[i + 1])
                cnt++;
        }

        return cnt;
    }
}