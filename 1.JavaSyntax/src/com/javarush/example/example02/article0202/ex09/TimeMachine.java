package com.javarush.example.example02.article0202.ex09;

public class TimeMachine {

   public void goToFuture(int currentYear) {

      currentYear = currentYear+10;
   }

   public void goToPast(int currentYear) {

      System.out.println("Метод goToPast начал работу!");

      System.out.println("Значение currentYear внутри метода goToPast (в начале) = " + currentYear);
      currentYear = currentYear-10;
      System.out.println("Значение currentYear внутри метода goToPast (в конце) = " + currentYear);
   }

   public static void main(String[] args) {

      TimeMachine timeMachine = new TimeMachine();
      int currentYear = 2018;

      System.out.println("Какой год в самом начале работы программы?");
      System.out.println(currentYear);

      timeMachine.goToPast(currentYear);
      System.out.println("А сейчас какой год?");
      System.out.println(currentYear);
   }
}
