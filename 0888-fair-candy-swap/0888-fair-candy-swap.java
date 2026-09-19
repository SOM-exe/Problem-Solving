class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int A = 0;
        for(int i : aliceSizes){
            A += i;
        }
        int B = 0;
        for(int i : bobSizes){
            B += i;
        }
        
        for(int i = 0 ; i<aliceSizes.length; i++){
            for(int j = 0 ; j<bobSizes.length; j++){
              if(aliceSizes[i] != bobSizes[j]){
                if((A - aliceSizes[i] + bobSizes[j]) == (B - bobSizes[j] + aliceSizes[i])){
                    return new int[] {aliceSizes[i], bobSizes[j]};   
                }
              }
           }
        }
        return new int[] {-1 , -1};
    }
}