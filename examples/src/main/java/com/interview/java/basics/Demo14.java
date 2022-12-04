package com.interview.java.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo14 {
    public static class S1{

        static List<Long> map1Times = new ArrayList<>();
        static List<Long> map2Times = new ArrayList<>();



        public static void main(String[] args){
            for (int i = 0; i < 100; i++) {
                compareTimeCostOfDifferentLoadFactor();
            }

            System.out.println("---average time of map1: " + medium(map1Times));
            System.out.println("---average time of map2: " + medium(map2Times));
        }

        private static long medium(List<Long> map2Times) {
            long res  = 0;
            for (Long time : map2Times) {
                res += time;
            }
            return res / map2Times.size();
        }

        private static void compareTimeCostOfDifferentLoadFactor() {
            Map<Integer,Integer> map1 = new HashMap<>(16,0.75f);
            Map<Integer,Integer> map2 = new HashMap<>(16,2f);

            long time1 = countTime(map1);
            System.out.println("time cost of map1: " + time1);
            map1Times.add(time1);

            long time2 = countTime(map2);
            System.out.println("time cost of map2: " + time2);
            map2Times.add(time2);
            System.out.println("-----------");
        }

        private static long countTime(Map<Integer, Integer> map) {

            List<Integer> keys = getTestKeys();

            long start = System.currentTimeMillis();
            for (Integer key : keys) {
                map.put(key,null);//value doesn't matter at all
            }

            return System.currentTimeMillis() - start;
        }

        private static List<Integer> getTestKeys() {
            List<Integer> res = new ArrayList<>();
            int max = 9999999;
            for (int i = 0; i < max; i++) {
                res.add(i);
            }
            return res;
        }
    }
}
