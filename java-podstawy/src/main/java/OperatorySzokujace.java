public class OperatorySzokujace {
    public static void main(String[] args) {
        // jaki będzie wynik
        int i = 1;
        char b = 'b';
        char c = 'C';
        char a = 'A';

        b -= i;
        c -= i;
        a -= b;

        System.out.println("b odjąć 1 to " + b);
        System.out.println("c odjąć 1 to " + c);
        System.out.println("A odjąć b to " + a);

        // a teraz kolejna zagadka co stanie się jeśli wykonamy następującą czynność
        System.out.println("Co się stanie " + a + b);
    }
}
