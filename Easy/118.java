class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return result;
        for(int i=0; i<numRows; i++) {
            ArrayList<Integer> thisRow = new ArrayList<Integer>();
            for(int j=0; j<=i; j++) {
                if(j==0)
                    thisRow.add(1);
                else if (j<i) {
                    int thisNum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    thisRow.add(thisNum);
                }
                else if(j==i) {
                    thisRow.add(1);
                }
            }
            result.add(thisRow);
        }
        return result;
    }
}