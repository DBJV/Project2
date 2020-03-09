package pl.bednarek;

public class Main {
    public static void main(String[] args) {

        WeirdCalc calc = new WeirdCalc();
        int wynik = calc.increaseByFive(4);

        System.out.println(wynik);

        wynik = calc.increaseByFive(wynik);

        System.out.println(wynik);

        int wynik2 = calc.increaseByFive(calc.increaseByFive(4));
        System.out.println(wynik2);
        int wynik3 = calc.sum(calc.increaseByFive(5),calc.increaseByFive(calc.increaseByFive(4)));
        System.out.println(wynik3);
    }
}
