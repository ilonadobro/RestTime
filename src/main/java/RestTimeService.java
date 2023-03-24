public class RestTimeService {
    public long calculate(long income, long expenses, long threshold) {
        long count = 0; // счётчик месяцев отдыха
        long money = 0; // количество денег на счету
        for (long month = 0; month < 12; month++) {
            if (money >= threshold) { // отдыхаем
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money / 3;
            } else { // работаем
                money = money + income - expenses;
            }
        }

        return count;
    }
}