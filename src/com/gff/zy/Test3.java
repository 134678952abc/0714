package com.gff.zy;

public class Test3 {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(check(str));
        /*
         * 编写一个回文字符串，然后调用check方法检查
         * 该字符串是否为回文，然后输出检查结果。
         * 若是回文则输出:是回文
         * 否则输出:不是回文
         */
    }
    /**
     * 判读该方法是否是回文
     * @param str 需要判断的字符串
     * @return true表示是回文，false表示不是回文
     */
    public static boolean check(String str){
        for(int i=0;i<=str.length()/2;i++) {
            if(!(str.charAt(i)==str.charAt(str.length()-i-1))) {
                return false;
            }
        }
        return false;
    }
}

