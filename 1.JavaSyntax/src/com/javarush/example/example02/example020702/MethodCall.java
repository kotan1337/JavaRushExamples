package com.javarush.example.example02.example020702;

public class MethodCall
{
    public static void main(String[] args)
    {
        int a = 5, b = 7;
        int m = min(a, b);
        System.out.println("Minimum is "+ m);
    }

    public static int min(int c, int d)
    {
        int m2;
        if (c < d)
            m2 = c;
        else
            m2 = d;

        return m2;
    }
}