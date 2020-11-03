package com.bjpowernode.test;

import com.bjpowernode.utils.UdpTestUtil;

public class Test04
{
    public static void main(String[] args)
    {
        /*String a[]={"1","2","3","44","76"};
        float b[]=new float[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=Float.parseFloat(a[i]);}
        System.out.println(b[1]);*/

        //String s = stringToHexString("A");
        /*String s = hexToDec("45A202");
        System.out.println(s);*/
        byte[] b = {'A','B','d','1'};
        UdpTestUtil u = new UdpTestUtil();
        float f = u.byte2float(b,0);
        System.out.println(f);


    }
    public static String stringToHexString(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        return str;
    }

    public static String hexToDec(String hex) {
        int data = Integer.parseInt(hex, 16);
        return Integer.toString(data, 10);
    }
}
