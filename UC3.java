import java.util.Scanner;

<<<<<<< HEAD
public class UC3 {
=======
public class TicTacToe {
>>>>>>> bca71313b210cee39eff36549f28a50ff68b4a6a

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    static int getUserSlot() {
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> bca71313b210cee39eff36549f28a50ff68b4a6a
