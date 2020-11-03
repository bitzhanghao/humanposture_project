package com.bjpowernode.test;

public class Test03
{
    public static void main(String[] args)
    {
        byte[] b = {'1','1','2','5'};
        float f = byte2float(b,0);
        System.out.println(f);
    }


    public static float byte2float(byte[] b, int index) {
        int l;
        l = b[index + 0];
        l &= 0xff;
        l |= ((long) b[index + 1] << 8);
        l &= 0xffff;
        l |= ((long) b[index + 2] << 16);
        l &= 0xffffff;
        l |= ((long) b[index + 3] << 24);
        return Float.intBitsToFloat(l);
    }
}
