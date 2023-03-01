import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num_of_student = read.nextInt();

        int[] index = new int[num_of_student];
        double[] marks = new double[num_of_student];
        char[] grade = new char[num_of_student];
        
        for (int student = 1; student <= num_of_student; student++) {
            System.out.print("Enter the index of student " + student + ": ");
            index[student-1] = read.nextInt();
            
            System.out.print("Enter the mid sem mark of student " + student + ": ");
            double mid_sem = read.nextDouble();
            System.out.print("Enter the end of sem mark of student " + student + ": ");
            double end_of_sem = read.nextDouble();
            double final_mark =  (mid_sem * 0.3) + (end_of_sem * 0.7);
            marks[student-1] = final_mark;
            
            //type cast final_mark to integer
            //apparently, we cannot switch a double
            switch ((int)final_mark/10) {
                case 10:
                case 9:
                case 8:
                case 7:
                    grade[student-1] = 'A';
                    break;
                case 6:
                    grade[student-1] = 'B';
                    break;
                case 5:
                    grade[student-1] = 'C';
                    break;
                case 4:
                    grade[student-1] = 'D';
                    break;
                default:
                    grade[student-1] = 'F';
                    break;
            }
        }
        System.out.println("Index\tMarks\tGrade");
        for (int student = 0; student < num_of_student; student++) {
            System.out.println(index[student] + "\t" + marks[student] + "\t" + grade[student]);
        }
    }
}
