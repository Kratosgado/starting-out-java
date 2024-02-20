package getters_setters;

/*
 * Encapsulation is about wrapping data and code as a single unit. In this case, it is a good practice to declare the variables as private____________
 */
public class Sample {
   private String name;
   private int age;

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
