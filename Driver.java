public class Driver {

    public static void main(String[] args) {
        System.out.print("This is multiples of 3: \n");
        int i = 0;
        while (i < 1001) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.print("\n\nThis is multiples of 5: \n");
        int b = 0;
        while (b < 1001) {
            if (b % 5 == 0) {
                System.out.print(b + " ");
            }
            b++;
        }
        System.out.print("\n\nThis is multiples of 15: \n");
        int c = 0;
        while (c < 1001) {
            if (c % 15 == 0) {
                System.out.print(c + " ");
            }
            c++;
        }
    }
}