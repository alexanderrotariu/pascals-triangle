class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> output = new ArrayList<>(); 
        
        for(int i = 1; i <= numRows; i++)
        {
            switch(i)
            {
                case 1:
                    List<Integer> first = new ArrayList<>(Arrays.asList(1));
                    output.add(first);
                    break;
                
                case 2: 
                    List<Integer> second = new ArrayList<>(Arrays.asList(1,1));
                    output.add(second);
                    break;
                    
                //i = 3 or more
                default:
                    List<Integer> third = new ArrayList<>(Arrays.asList(1,1));
                    int insertPos = 1;
                    List<Integer> previousRow = output.get(i-2);
                    int number = 0;
                    int numberAhead = 0;
                    int sum = 0;
                    
                    for(int k = 0; k < previousRow.size()-1; k++)
                    {
                        number = previousRow.get(k);
                        numberAhead = previousRow.get(k+1);
                        sum = number + numberAhead;
                        third.add(insertPos, sum);
                        insertPos++;
                    }
                    output.add(third);
                    break;
            }
        }
        
        return output;
    }
}
