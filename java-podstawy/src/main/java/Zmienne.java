public class Zmienne {
    private static final int constant = 1;
    private static int globalVariable = 20;

    public static void main(String[] args) {
        char localVariable = 'A';
        System.out.printf("Wartość stałej to %d", constant);
        System.out.println();
        System.out.printf("Wartość zmiennej globalnej to %d", globalVariable);
        System.out.println();
        System.out.printf("Wartość zmiennej lokalnej to %c", localVariable);
        System.out.println();
        System.out.printf("Wartość zmiennej lokalnej jako liczba to %d", (int) localVariable);
        System.out.print("piszemy");
        System.out.println("powrót karetki \r to wraca");
    }
}
