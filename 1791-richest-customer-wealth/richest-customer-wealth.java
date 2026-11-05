class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0,m;
        for(int i=0;i<accounts[0].length;i++){
            s+=accounts[0][i];
        }
        m=s;
        for(int i=1;i<accounts.length;i++){
           s=0;
           for(int j=0;j<accounts[0].length;j++){
            s+=accounts[i][j];
           }
           m=Math.max(m,s);
        }
        return m;
    }
}