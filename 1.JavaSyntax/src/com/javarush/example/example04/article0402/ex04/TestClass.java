package com.javarush.example.example04.article0402.ex04;

public class TestClass {
   private boolean booleanValue = true;
   private char charValue = 'd';
   private String stringValue = "TestClass";
   private long longValue = 34829245849498300l;
   private float floatValue = 345832400.93f;
   private double doubleValue = 98584292348454.9834;
   private byte[] arrayValue = {1, 2, 3};

   public static void main(String[] args) {
      TestClass test = new TestClass();

      System.out.println(test.hashCode());
   }

   @Override
   public int hashCode() {
      int result = 17;

      result = 37 * result + ( booleanValue ? 1 : 0 );
      result = 37 * result + (int) charValue;
      result = 37 * result + (stringValue == null ? 0 : stringValue.hashCode());
      result = 37 * result + (int)(longValue - (longValue >>> 32));
      result = 37 * result + Float.floatToIntBits(floatValue);
      long longBits = Double.doubleToLongBits(doubleValue);
      result = 37 * result + (int)(longBits - (longBits >>> 32));
      for( byte b : arrayValue )
         result = 37 * result + (int) b;

      return result;
   }

}