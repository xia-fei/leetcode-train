package subject1;

public class Solution1010 {

    public static int numPairsDivisibleBy60(int[] time) {
        int total = 0;
        for (int i = 0; i < time.length - 1; i++) {
            for (int j = i + 1; j < time.length; j++) {
                System.out.println(i+" "+j);
                if ((time[i] + time[j])% 60 == 0) {
                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40,20,32,31}));
    }
}
