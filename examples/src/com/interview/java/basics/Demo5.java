package com.interview.java.basics;

public class Demo5 {
    public static void main(String[] args) {
        int count = countOneBits(-3);
        System.out.println(count);
    }

    //this method will never return
    public static int countOneBits(int num){
        int count = 0;
        while(num != 0){
            if(((num & 1) == 1)) count++;
            num >>= 1;
        }

        return count;
    }

    public static class S1{

        public static void main(String[] args) {
            int[] nums = new int[]{2,3,1};
            int res = 0;
            int weight = 1;
            for(int i = 0; i < nums.length; i++){
                res += weight * nums[i];
                weight *= 10;
            }
            System.out.println(res);
        }



    }

}
