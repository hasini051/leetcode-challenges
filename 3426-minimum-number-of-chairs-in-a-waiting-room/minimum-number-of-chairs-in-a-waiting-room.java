class Solution {
    public int minimumChairs(String s) {
        int c=0,m=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='E'){
             c++;
        }
        else{
            c--;
        }
         m=Math.max(m,c);
       } 
       return m;
    }
}