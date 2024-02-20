package type_conversion;

import java.sql.Date;
import java.util.Calendar;

public class TypeConversion {
   public static void main(String[] args) {
      // implicit casting happens when the source type has smaller range than the
      // target type
      byte byteVar = 42;
      short shortVar = byteVar;
      int intVar = shortVar;
      long longVar = intVar;
      float floatVar = longVar;
      double doubleVar = floatVar;

      // explicit casting has to ve done when the source type has larger range than
      // the target type
      doubleVar = 42.0d;
      floatVar = (float) doubleVar;
      longVar = (long) floatVar;
      intVar = (int) longVar;
      byteVar = (byte) shortVar;
   }

   static void testNumericPromotion() {
      char char1 = 1, char2 = 2;
      short short1 = 1, short2 = 2;
      int int1 = 1, int2 = 2;
      float float1 = 1.0f, float2 = 2.0f;

      // char1 = char1 + char2 // Error: Cannot convert from int to char
      // short1 = short1 + short2 // Error: Cannot convert from int to short
      int1 = char1 + char2; // char is promoted to int
      int1 = short1 + short2; // short is promoted to int
      int1 = char1 + short2; // both char and short promoted to int
      float1 = short1 + float2; // short is promoted to float
   }

   static void testNonNumeric() {
      // int badInt = (int) true; // compiler error: incompatible types
      char char1 = (char) 65; // A
      byte byte1 = (byte) 'A'; // 65
      short short1 = (short) 'A'; // 65

      char char2 = (char) 8253; // ?

   }

   static void instanceCast() {
      Object obj = Calendar.getInstance();
      long time = 0;
      if (obj instanceof Calendar) {
         time = ((Date) obj).getTime();
      }
      if (obj instanceof Date) {
         time = ((Date) obj).getTime(); // this line will never be reached, obj is not a Date type
      }
   }
}
