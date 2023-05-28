import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int size;
    static int maxValue;
    static int treshold;

    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        log.log("Запускаем программу");
        log.log("Введите данные для списка ");
        if (scanner.hasNextInt()) {
            maxValue = scanner.nextInt();
            log.log("Введино число:" + maxValue);
        } else {
            log.log("Введено не число");
        }
        log.log("Введите верхниюю границу для списка");
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
            log.log("Вы ввели " + size + "для верхней границы");
        } else {
            log.log("Не допустимое значение");
        }
        log.log("Создаем и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        log.log("Вот случайный список " + list);
        log.log("Введите порог для фильтра");
        if (scanner.hasNextInt()){
            treshold = scanner.nextInt();
            log.log("Вы ввели " + treshold);
        }
        log.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(list);
        log.log("Отфильтрованный список " + result);
        log.log("Конец программы");

    }
}