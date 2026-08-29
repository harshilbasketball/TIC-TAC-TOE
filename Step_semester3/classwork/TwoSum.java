import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        int n = input.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        int target = input.nextInt();

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }
            }
        }
    }
}
