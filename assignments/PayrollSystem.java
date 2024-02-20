package assignments;
import java.util.Scanner;

class PayrollSystem{
    public static void main(String[] args) {
        String[] snr_stuff = {"John", "Angel", "Mbeah", "Essilfie", "Prine"};
        
        final int NUMBER_OF_EMPLOYEES = 2;

        String[] names = new String[NUMBER_OF_EMPLOYEES];
        int[] hours = new int[NUMBER_OF_EMPLOYEES];
        int[] num_of_children = new int[NUMBER_OF_EMPLOYEES];
        double[] all_gross_pay = new double[NUMBER_OF_EMPLOYEES];
        double[] all_net_pay = new double[NUMBER_OF_EMPLOYEES];
        double[] all_deduction = new double[NUMBER_OF_EMPLOYEES];

        double total_deduction = 0;
        double total_net_pay = 0;
        double average_net_pay;


        Scanner read = new Scanner(System.in);
        System.out.println("STARTING DATA COLLECTION...");
        for (int employee = 0; employee < NUMBER_OF_EMPLOYEES; employee++) {
            System.out.print("Enter the name for employee " + (employee+1) + ": ");
            names[employee] = read.next();
            System.out.print("Enter the number of hours worked for " + names[employee] + ": ");
            hours[employee] = read.nextInt();
            System.out.print("Enter the number of children of " + names[employee] + ": ");
            num_of_children[employee] = read.nextInt();

            double gross_pay = 0;
            for (String n_name : snr_stuff) {
                if(n_name == names[employee]){
                    if(hours[employee] > 40){
                        gross_pay = 40*50 + (hours[employee]-40)*50*1.5;
                    }
                    else{
                        gross_pay = hours[employee] *50;
                    }
                }
                else{
                    if(hours[employee]> 40){
                        gross_pay = 40*50*0.7 + (hours[employee]-40)*50*0.7*1.25;
                    }
                    else{
                        gross_pay = hours[employee] * 50 *0.7;
                    }
                }
            }
            double getfund = 0;
            if(num_of_children[employee]> 3){
                getfund = (num_of_children[employee] - 3);
            }

            double deductions =  (gross_pay*0.001 + gross_pay*0.15 + getfund);
            double netPay = gross_pay - deductions;

            all_gross_pay[employee] = gross_pay;
            all_net_pay[employee] = netPay;
            all_deduction[employee] = deductions;

            total_net_pay += netPay;
            total_deduction += deductions;
        }
        average_net_pay = total_net_pay/NUMBER_OF_EMPLOYEES;
        
        System.out.println("\n\n THESE ARE THE EMPLOYEE PAYROLL INFORMATION\n" );

        System.out.println("NAMES\t\tHOURS\t\tCHILDREN\tGROSS PAY\tNET PAY\t\t\tDEDUCTIONS");
        for (int employee = 0; employee < NUMBER_OF_EMPLOYEES; employee++) {
            System.out.println(names[employee] + "\t\t" + hours[employee] + "\t\t" + num_of_children[employee] + "\t\t" +
            all_gross_pay[employee] + "\t\t" + all_net_pay[employee] + "\t\t" + all_deduction[employee]);
        }
        
    }
}