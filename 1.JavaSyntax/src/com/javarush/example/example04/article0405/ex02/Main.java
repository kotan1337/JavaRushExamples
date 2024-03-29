package com.javarush.example.example04.article0405.ex02;

public class Main {

   public static void main(String[] args)  {

      //прибавляем к нулю 0.1 одиннадцать раз подряд
      double f1 = 0.0;
      for (int i = 1; i <= 11; i++) {
         f1 += .1;
      }

      //Умножаем 0.1 на 11
      double f2 = 0.1 * 11;

      //должно получиться одно и то же - 1.1 в обоих случаях
      System.out.println("f1 = " + f1);
      System.out.println("f2 = " + f2);

      // Проверим!
      if (f1 == f2)
         System.out.println("f1 и f2 равны!");
      else
         System.out.println("f1 и f2 не равны!");

      final double threshold = 0.0001;
      if (Math.abs(f1 - f2) < threshold)
         System.out.println("f1 и f2 равны");
      else
         System.out.println("f1 и f2 не равны");
   }
}