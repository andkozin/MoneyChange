public class MoneyChange {
    public static void main(String[] args) {
        int change = 2335; // сдача в руб. целое число
        int[] demominations = {5000, 1000, 500, 50, 10, 5, 2, 1}; // размен номиналов

        for (int demomination : demominations) {
            if (change == 0) { // проверка значения сдачи на ноль прерываем цикл досрочно
                break;
            }
            int totalBanknotes = change / demomination;
            if (totalBanknotes == 0) { // пропускаем итерацию если банкнот 0 => 5000
                continue;
            }
            // 2335 / 5000 = 0
            // 2335 / 1000 = 2 * 1000 + 335
            //change = change % demomination; // можно ниже
            change %= demomination;

            String banknoteType = switch (demomination) {
                case 10, 5, 2, 1 -> "Монеты";
                default -> "Купюры";
            };
            //System.out.println("Купюры/монеты номиналом " + demomination + ": " + totalBanknotes);
            System.out.println(banknoteType + " номиналом " + demomination + ": " + totalBanknotes);
            System.out.println(banknoteType + " номиналом " + demomination + ": " + totalBanknotes);
            System.out.println(banknoteType + " номиналом " + demomination + ": " + totalBanknotes);
            System.out.println(banknoteType + " номиналом " + demomination + ": " + totalBanknotes);
            System.out.println(banknoteType + " номиналом " + demomination + ": " + totalBanknotes); // 6
        }
    }
}
