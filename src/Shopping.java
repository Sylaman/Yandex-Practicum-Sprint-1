import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                System.out.println("Введите название товара без пробелов. Несколько слов нужно соединять символом подчёркивания");
                String productName = scanner.next();
                boolean isDuplicate = false;

                for (int i = 0; i <= productCount; i++) {
                    if (productName.equals(shoppingList[i])) {
                        isDuplicate = true;
                    }
                }
                if (isDuplicate) {
                    System.out.println("Такой товар уже есть в списке");
                } else if (productCount == shoppingList.length) {
                    System.out.println("Достигнут лимит количества товаров. Товар не был добавлен!");
                } else {
                    shoppingList[productCount] = productName;
                    productCount++;
                    System.out.println("Товар " + productName + " добавлен в список под номером " + productCount);
                }
            } else if (actionNumber == 2) {
                for (int i = 1; i <= productCount; i++) {
                    System.out.println((i) + ". " + shoppingList[i - 1]);
                }
            } else if (actionNumber == 3) {
                for (int i = 0; i <= productCount; i++) {
                    shoppingList[i] = null;
                    productCount = 0;
                }
            } else if (actionNumber == 4) {
                break;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}