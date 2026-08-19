class Solution {
    public int encrypt(int value){
        String ns = "" + value;
        int maxv = Integer.MIN_VALUE;
        for(char ch : ns.toCharArray()){
            maxv = Math.max(maxv , ch-'0');
        }
        String s = "";
        int i = 0;
        while(i<ns.length()){
            s = s + maxv;
            i++;
        }
        return Integer.valueOf(s);
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= 0 && nums[i] <= 9){
            sum = sum + nums[i];
            } else {
            sum = sum + encrypt(nums[i]);
            }
        }
        return sum;
    }
}