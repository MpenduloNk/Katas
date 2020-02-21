public class Isosceles {

    public void isosceles(int numIso) {
        for (int i = 1; i < numIso; i++) {
            for (int x = numIso - 1; x >= i; x--) {
                System.out.print(" ");
            }
            for (int r = 1; r <= (2*i-1); r++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
