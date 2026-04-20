import java.util.Scanner;

public class UC4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    static int getUserSlot() {
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }

    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}