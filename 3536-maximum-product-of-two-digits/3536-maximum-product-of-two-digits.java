import java.util.Arrays;
class Solution {
    public int maxProduct(int n) {
        int dup=n;
        int count=0;
        while(dup!=0){
            dup/=10;
            count++;
        }
        int[] maxn= new int[count];
        int dup2=n;
        for(int i=0;i<count;i++){
            maxn[i]=dup2%10;
            dup2/=10;
        }

        Arrays.sort(maxn);
        return maxn[count-1]*maxn[count-2];
        
    }
}