package assignments;
public class Sales {
    public static void main(String[] args) {
        int[][] shop_A = {
            {42,48,50},
            {52,58,60},
            {46,49,58},
            {50,51,61}
        };
        int[][] shop_B = {
            {57,63,60},
            {70,67,73},
            {67,65,62},
            {72,69,75}
        };
        //QUESTION 1
        System.out.println("\nQuestion 1");
         int[][] combined_monthly = new int[4][3];
         System.out.println("MONTHLY COMBINED SALES");
        for (int j = 0; j < 4; j++) {
            for (int index = 0; index < 3; index++) {
                combined_monthly[j][index] = shop_A[j][index] + shop_B[j][index];
                System.out.print("\t " + combined_monthly[j][index]);
            }
        }
        //QUESTION 2
        System.out.println("\n\nQuestion 2");
        //quartarly for shop A
        System.out.println("QUARTAR SUM FOR SHOP A");
        int[] shop_A_quartar = calcQuarSum(shop_A, 4, 3);
        //quartarly for shop B
        System.out.println("QUARTAR SUM FOR SHOP B");
        int[] shop_B_quartar = calcQuarSum(shop_B, 4, 3);
        int shop_A_annual = 0;
        int shop_B_annual = 0;

        //QUESTION 3 AND 4
        System.out.println("\nQuestion 3");
        int[] shop_AB_quartar = new int[4];
        for(int i = 0; i < shop_AB_quartar.length; i++){
            shop_AB_quartar[i] = shop_A_quartar[i] + shop_B_quartar[i];
            System.out.println("the quartar sum for A and B = " + shop_AB_quartar[i]);

            shop_A_annual += shop_A_quartar[i];
            shop_B_annual += shop_B_quartar[i];
        }
        System.out.println("\nQuestion 4");
        System.out.println("the sum for shop A annual = " + shop_A_annual);
        System.out.println("the sum for shop B annual = " + shop_B_annual);

        //QUESTION 5
        System.out.println("\nQuestion 5");
        int grand_annual = shop_A_annual + shop_B_annual;
        System.out.println("Grand annual sum = " + grand_annual);

        //QUESTION 6
        System.out.println("\nQuestion 6");
        int diffA = diffLeadTrailDiag(shop_A, 4, 3);
        System.out.println("The difference between the diagonal and the sum for shop A is " + diffA);

        int diffB = diffLeadTrailDiag(shop_B, 4, 3);
        System.out.println("The difference between the diagonal and the sumf or shop B is " + diffB);

        //QUESTION 7
        System.out.println("\nQuestion 7");
        int[] shop_A_sorted = sort(shop_A);
        int[] shop_B_sorted = sort(shop_B);
        System.out.println("shop A sorted");
        for (int i = 0; i < shop_A_sorted.length; i++) {
            System.out.print("\t " + shop_A_sorted[i]);
        }
        System.out.println("\nshop B sorted");
        for (int i = 0; i < shop_B_sorted.length; i++) {
            System.out.print("\t " + shop_B_sorted[i]);
        }
        //QUESTION 8
        System.out.println("\n\nQuestion 8");
        for (int i = 0; i < shop_B_sorted.length; i++) {
            System.out.println(
                (shop_A_sorted[i] < shop_B_sorted[i]) ? "shop B performed best in month " + (i+1)
                : (shop_A_sorted[i] == shop_B_sorted[i]) ? "both shops performed in month " + (i+1)
                : "shop A performed best in month " + (i+1)
            );
        }
        //QUESTION 9
        System.out.println("\nQuestion 9");
        for (int i = 0; i < shop_A_quartar.length; i++) {
            System.out.println(
                (shop_A_quartar[i] < shop_B_quartar[i]) ? "shop B performed best in quartar " + (i+1)
                : (shop_A_quartar[i] == shop_A_quartar[i]) ? "both shops performed in quartar " + (i+1)
                : "shop A performed best in quartar" + (i+1)
            );
        }
        //QUESTION 10
        System.out.println("\nQuestion 10");
        System.out.println(
            (shop_A_annual < shop_B_annual) ? "shop B performed better than A in the year"
            : (shop_A_annual> shop_B_annual) ? "shop A performed better than B in the year"
            : "both shop performed the same"
        );
    }
    static int[] calcQuarSum(int[][] shop, int row, int col){
        int[] quartarly_sales = new int[4];
        for (int i = 0; i < row; i++) {
            int quartar_sum = 0;
            for (int j = 0; j < col; j++) {
                quartar_sum += shop[i][j];
            }
            quartarly_sales[i] = quartar_sum;
            System.out.println("The sum for quartar " + (i+1) + " = " + quartar_sum);
        }
        return quartarly_sales;
    }
    static int calcDiagonalSum(int[][] shop, int row, int col){
        int diagonal_sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i == j){
                    diagonal_sum += shop[i][j];
                }
                else if(i == (row-1) && j == (col-1)){
                    diagonal_sum += shop[i][j];
                }
            }
        }
        return diagonal_sum;
    }
    static int calcTrailingSum(int[][] shop, int row, int col){
        int trailing_sum = 0;
        for (int i = 0; i < row; i++) {
            if(i == 0){
                trailing_sum += shop[i][2];
            }
            else{
                trailing_sum += shop[i][4-i-1];                
            }
        }
        return trailing_sum;
    }    
    static int diffLeadTrailDiag(int[][] shop, int row, int col){
        return calcDiagonalSum(shop, row, col) - calcTrailingSum(shop, row, col);
    }
    static int[] sort(int[][] shop){
        int[] data = new int[shop.length * shop[0].length];
        int count = 0;
        for (int i = 0; i < shop.length; i++) {
            for (int index = 0; index < shop[i].length; index++) {
                data[count] = shop[i][index];
                count++;
            }
        }
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if(data[j] < data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }
}
