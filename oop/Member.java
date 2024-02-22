package oop;

public class Member {
   private String name;
   private String type;
   private int level; // not the data type here
   private int rank; // note the data type here as well

   /**
    * Contructor for Member class
    * @param name
    * @param type
    * @param level
    * @param rank 
    * 
    */
   public Member(String name, String type, int level, int rank) {
      this.name = name;
      this.type = type;
      this.level = level;
      this.rank = rank;
   }

   /**
    * Returns the name of the member   
    * @return name
    */
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
