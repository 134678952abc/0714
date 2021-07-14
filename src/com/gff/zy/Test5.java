package com.gff.zy;

import java.io.Console;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        String str=random();
        System.out.println(str);
        System.out.println("请输入验证码（不区分大小写）");
        Scanner sc=new Scanner(System.in);
        String strin=sc.next();
        str=str.toUpperCase();
        strin=strin.toUpperCase();
        if(strin.equals(str)) {
            System.out.println("正确");
        }else {
            System.out.println("错误");
        }
    }

    private static String random() {
        char []c=new char[5];
        String str="";
        for (int i = 0; i < c.length; i++) {
            int x=(int)(Math.random()*2);{
                if(x==1) {
                    c[i]=(char)((Math.random()*25)+97);
                    str+=c[i];
                }else {
                    c[i]=(char)((Math.random()*25)+65);
                    str+=c[i];
                }
            }
        }
        return str;
    }

}

