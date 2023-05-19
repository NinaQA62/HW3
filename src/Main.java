// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initialАmount = 100; // сумма на счету
        int replenishment = 2100; // пополнение счета
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int total = initialАmount + replenishment + bonus;
        System.out.println("Сумма на счету: " + total);
        System.out.println("Бонусы: " + bonus);
    }
}