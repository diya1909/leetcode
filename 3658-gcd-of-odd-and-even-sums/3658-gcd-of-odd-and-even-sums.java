class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odds=0;
        int evens=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                evens+=i;
            }
            else{
                odds+=i;
            }
        }
        return gcd(evens,odds);
    }
    
     public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  
        
     }
}