package oop;

public class Member {
   private String name;
   private String type;
   private int level; // not the data type here
   private int rank; // note the data type here as well

   // constructor
   public Member(String name, String type, int level, int rank) {
      this.name = name;
      this.type = type;
      this.level = level;
      this.rank = rank;
   }

   // getter functions
   /* retrieve name */
   public String getName() {
      return this.name;
   }

   public String getType() {
      return this.type;
   }

   public int getLevel() {
      return this.level;
   }

   public int getRank() {
      return this.rank;
   }
}
