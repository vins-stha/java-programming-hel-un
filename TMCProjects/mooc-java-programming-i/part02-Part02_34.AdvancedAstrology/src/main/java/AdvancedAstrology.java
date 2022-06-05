public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int j = 1;
        for (int i = size; i > 0; i--) {

            printSpaces(i - 1);
            printStars(j);
            j++;
        }

    }

    public static void christmasTree(int height) {
        int j = 0;
        int l = 0;

        for (int i = height; i > 0; i--) {
            printSpaces(--height);
            j = (2 * l) + 1;
            printStars(j);
            l++;
        }
        int mid = ((j - 3) / 2);
        printSpaces(mid);
        System.out.println("***");
        printSpaces(mid);
        System.out.println("***");
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
