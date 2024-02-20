package oop;

/**
 * 
 * @param member
 */
public class Team {

   Member member;

   public Team(Member member) { // who is in this Team?
      this.member = member; // one 'member' is in this Team
   }

   // main method
   public static void main(String[] args) {
      Member myMember = new Member("Mbeah", "light", 10, 1);
      Team myTeam = new Team(myMember);

      System.out.println((myTeam.member.getName()));
      System.out.println((myTeam.member.getType()));
      System.out.println((myTeam.member.getLevel()));
      System.out.println((myTeam.member.getRank()));

   }
}
