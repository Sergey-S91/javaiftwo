//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.



        int balance = 100;
        int cash = 1100;

        int bonus = cash > 1000 ? (cash/100*1) : 0 ;

                int itogo = balance + cash + bonus ;

        System.out.println("Ваш текущий счет: " + balance);
        System.out.println("Ваш платёж:" + cash);
        System.out.println("Ваш бонус:" + bonus);
        System.out.println("Итого баланс средств:" + itogo);
    }
}
