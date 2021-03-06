package com.gff.zy;


public class Test02 {
    /**
     * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
     * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
     * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
     * 然后在修改为:"我是牛牛的程序员!"并输出
     *
     *
     */
    public static void main(String[] args) {
        String str = "大家好!";
        StringBuilder sb=new StringBuilder(str);
        // 1. 将"大家好!"修改为:"大家好!我是程序员!"并输出。
        sb.append("我是程序员!");
        System.out.println("sb = " + sb);
        //
        sb.replace(4,13,"我是优秀的程序员!");
        System.out.println("sb = " + sb);
        // 修改为:"大家好!我是牛牛的程序员!"并输出
        sb.replace(4,13,"我是牛牛的程序员!");
        System.out.println("sb = " + sb);
        //修改为:"我是牛牛的程序员!"并输出
        sb.replace(0,4,"");
        System.out.println("sb = " + sb);
    }
}


