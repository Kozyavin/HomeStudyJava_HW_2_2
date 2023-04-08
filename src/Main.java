public class Main {
    public static void main(String[] args) {

        int account = 100; // У клиента денег на счету
        int payment = 1100; // Платёж клиента на личный счёт. Пополнение счёта.
        int bonusPay = payment/100; //За каждые 100 руб. суммы пополнения = 1 бонус
        if (payment > 1000) {System.out.println("На вашем счёте: "+(account+payment+bonusPay)+" рубль(ей)\n" +
                "Бонусных - "+bonusPay+" рублей ");}
        else {System.out.println("На вашем счёте: "+(account+payment)+" рублей.\n" +
                "Условие для начисления бонусов не выполнено.");};
    }
}
