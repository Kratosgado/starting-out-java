package assignments;
import java.util.Scanner; 
public class Assessment { 
   public static void main(String[] args) {
      double examScore, assessmentScore, fees;
      boolean hasPassed = false, certified = false;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the exam score: ");
      //receive the exam score as a double
      examScore = keyboard.nextDouble();
      System.out.print("Enter the assessment score: ");
      //receive the assessment score as a double
      assessmentScore = keyboard.nextDouble();
      System.out.print("Enter the amount of fees paid: ");
      //receive the fees paid as a double fees = 
      keyboard.nextDouble();
      if (examScore >= 25)
         hasPassed = true;
      if (assessmentScore >= 15)
         certified = true;
      if ((examScore == 25 && assessmentScore == 14) || (examScore == 24 &&
            assessmentScore == 15)) {
         hasPassed = true;
         certified = true;
      }
      if (hasPassed)
         System.out.print("You passed the exams");
      else
         System.out.print("You failed the exams");
      if (certified)
         System.out.print(" and passed the assessment.");
      else
         System.out.print(" and failed the assesment.");
      if (hasPassed && certified)
         System.out.print(" You can now be given a certificate");
      else
         System.out.print(" You can't be given a certificate.");
      if (!hasPassed && !certified)
         System.out.print("You are repeated");
   }
}
