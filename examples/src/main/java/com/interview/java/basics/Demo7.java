package com.interview.java.basics;

public class Demo7 {
    public static void main(String[] args) {
        //a();

        b();

    }

    private static void b() {
        char[] chs = new char[2];
        chs[0] = '\ud83d';
        chs[1] = '\udf01';
        System.out.println(chs);

        String s = "\ud83d\udf01";
        System.out.println(s);

        char[] chs2 = Character.toChars(0x1f701);
        System.out.println(chs2);
    }

    private static void a() {
        char a = '我';
        char b = '\u6211';//utf编码，16进制
        char c = 0x6211;//unicode编号，16进制
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }



    public static class S1{
        public static void main(String[] args){
            //integer 231 to string '231'
            // TODO: 2022/12/3
        }
    }

    public static class S2{
        public static void main(String[] args){
            String a = "A23abBc";
            String b = toUpperCase(a);
            System.out.println(b);
        }

        private static String toUpperCase(String a) {
            char[] chs = a.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                if(chs[i] >= 'A' && chs[i] <= 'Z'){
                    chs[i] += 32;
                }
            }
            return new String(chs);
        }
    }


}
