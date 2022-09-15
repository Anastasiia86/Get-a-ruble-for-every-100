public class Main {
    public static void main(String[] args) {

        int clientAccount = 100;//начальная сумма на счете клиента
        int bonusRubles = 100;//бонусные рубли за каждые 100 рублей
        int deposit = 1100;// сумма пополнения счета
        int bonus;//сумма бонусов

        if (deposit > 1000) {
            bonus = deposit / bonusRubles;
        } else {
            bonus = 0;
        }

        int balance = clientAccount + deposit + bonus;

        System.out.println("Спасибо , Ваш платеж зачислен. Ваш баланс : " + deposit + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Итоговая сумма на счету : " + balance + " руб.");
    }
}


