import java.util.ArrayList;
import java.util.Scanner;

public class inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inventory = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Инвентарь ===");
            System.out.println("1. Показать инвентарь");
            System.out.println("2. Добавить предмет");
            System.out.println("3. Удалить предмет");
            System.out.println("4. Очистить инвентарь");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Показать инвентарь
                    if (inventory.isEmpty()) {
                        System.out.println("Инвентарь пуст.");
                    } else {
                        System.out.println("Ваш инвентарь:");
                        for (int i = 0; i < inventory.size(); i++) {
                            System.out.println((i + 1) + ". " + inventory.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Введите название предмета: ");
                    String item = scanner.nextLine();
                    inventory.add(item);
                    System.out.println("Предмет \"" + item + "\" добавлен в инвентарь.");
                    break;

                case 3: // Удалить предмет
                    if (inventory.isEmpty()) {
                        System.out.println("Инвентарь пуст. Нечего удалять.");
                    } else {
                        System.out.println("Ваш инвентарь:");
                        for (int i = 0; i < inventory.size(); i++) {
                            System.out.println((i + 1) + ". " + inventory.get(i));
                        }
                        System.out.print("Введите номер предмета для удаления: ");
                        int itemNumber = scanner.nextInt();
                        scanner.nextLine();

                        if (itemNumber > 0 && itemNumber <= inventory.size()) {
                            String removedItem = inventory.remove(itemNumber - 1);
                            System.out.println("Предмет \"" + removedItem + "\" удалён из инвентаря.");
                        } else {
                            System.out.println("Неверный номер предмета.");
                        }
                    }
                    break;

                case 4:
                    inventory.clear();
                    System.out.println("Инвентарь очищен.");
                    break;

                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
