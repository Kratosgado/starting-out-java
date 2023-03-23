import java.util.Scanner;

public class Assessment {
    public static void main(String [] args){
        int examScore, assessmentScore, fees;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the exam score: ");
        examScore = keyboard.nextInt();

        System.out.print("Enter the assessment score: ");
        assessmentScore = keyboard.nextInt();

        System.out.print("Enter the amount of fees paid: ");
        fees = keyboard.nextInt();

        int exam_div = examScore/10, exam_rem = examScore % 10;
        int assessment_div = assessmentScore/10, assessment_rem = assessmentScore % 10;
         
        switch (examScore ) {
            case 4:
                break;
        
            default:
                break;
        }
        
    }
}
