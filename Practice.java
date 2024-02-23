import java.util.LinkedList;

public class Practice {
    static int jewelsInStones(String jewels, String stones) {
        int count = 0;
        for (String letter : stones.split("")) {
            if (jewels.contains(letter)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] arg) {
        LinkedList linkedList = new LinkedList<Integer>();
        linkedList.add(4);
        
        String jewels = "aA";
        String stones = "aaAbbbb";
        System.out.println(jewelsInStones(jewels, stones));
    }
}
