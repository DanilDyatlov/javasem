package HW.HW6;
import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        1. Подумать над структурой класса Ноутбук для
        магазина техники — выделить поля и методы. Реализовать в Java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий
        (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
        */
        HashSet<Notebook> notebooks = getNotebooks();

        System.out.println("Программа для реализации фильтра множества ноутбуков.");
        String help = """
                Для выхода введите 'exit'.
                Для задания параметров фильтра введите 'filter'.
                Для сброса параметров фильтра введите 'clear'.
                Для применения фильтра и вывода результата введите 'print'.""";
        System.out.println(help);
        HashMap<String, String> filterParameters = new HashMap<>();
        while (true) {
            System.out.print("Ввод: ");
            String input = scanner.nextLine();

        /* equalsIgnoreCase – сравнивает данную строку с другой строкой, игнорируя регистр.
        Две строки считаются равными, если они имеют одинаковую длину и соответствующие
        символы у двух строк равны, игнорируя регистр букв. т.е. введеная строка сравнивается с уже существующей
        затем мы добавляем ее в HashMap */

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("filter")) {
                setFilterParameters(filterParameters);
            } else if (input.equalsIgnoreCase("clear")) {
                filterParameters.clear();
            } else if (input.equalsIgnoreCase("print")) {
                if (filterParameters.size() == 0) {
                    for (Notebook nb : notebooks) {
                        System.out.println(nb);
                    }
                } else {
                    applyFilterAndPrint(notebooks, filterParameters);
                }
            } else {
                System.out.println("'" + input + "'" + " - команда не найдена");
                System.out.println(help);
            }
        }
    }

    public static void setFilterParameters(HashMap<String, String> filterParameters) {
        String inputParameter;

        do {
            System.out.println("""
                    Параметры фильтра:
                    1 - ОЗУ(Gb)
                    2 - Объём ЖД(Gb)
                    3 - Бренд
                    4 - Цвет
                    5 - Цена""");
            /*
            matches() – в Java сообщает, соответствует ли или нет данная строка заданному регулярному выражению.
            Вводиться строка и ее мы ищем в наших параметрах.
            Синтаксис регулярных выражений основан на использовании символов. ^ - начало строки $ - конец строки
            [] - любой символ заключенный в скобках.
            */

            System.out.print("Введите цифру, соответствующую необходимому параметру: ");
            inputParameter = scanner.nextLine();
            if (inputParameter.matches("^[3-4]$")) {
                System.out.print("введите значение: ");
            } else if (inputParameter.matches("^[1,2,5]$")) {
                System.out.print("введите минимальное значение: ");
            } else {
                System.out.println("'" + inputParameter + "'" + " - параметр не существует");
            }
            /*
            Метод switch case позволяет делать выбор. И после выбор параметра программа выдаст результат
            \\d определяет то что находится в ""
            */
            switch (inputParameter) {
                case "1" -> {
                    String ram = scanner.nextLine();
                    if (ram.matches("^\\d+$")) {
                        filterParameters.put("ОЗУ(Gb)", ram);
                    } else {
                        System.out.println("параметр не добавлен, введите числовое значение");
                    }
                }
                case "2" -> {
                    String disk = scanner.nextLine();
                    if (disk.matches("^\\d+$")) {
                        filterParameters.put("Объём ЖД(Gb)", disk);
                    } else {
                        System.out.println("параметр не добавлен, введите числовое значение");
                    }
                }
                case "3" -> filterParameters.put("Бренд", scanner.nextLine());
                case "4" -> filterParameters.put("Цвет", scanner.nextLine());
                case "5" -> {
                    String price = scanner.nextLine();
                    if (price.matches("^\\d+$")) {
                        filterParameters.put("Цена", price);
                    } else {
                        System.out.println("параметр не добавлен, введите числовое значение");
                    }
                }
            }

            System.out.print("Параметры: ");
            System.out.println(filterParameters.toString());
            System.out.print("Задать еще параметры(y/n): ");
            inputParameter = scanner.nextLine();


        } while (inputParameter.equalsIgnoreCase("y"));
        // В случае y то цикл начинается заново
    }

    public static void applyFilterAndPrint(HashSet<Notebook> notebooks, HashMap<String, String> parameters) {
        HashSet<Notebook> result = new HashSet<>(notebooks);
        int minRamGB = 0;
        int minStorageCapacityGb = 0;
        String brand = "";
        String color = "";
        int minPrice = 0;
        // Пустые строки начальные значения
        for (String parameter : parameters.keySet()) {
            // При выполнении такого цикла, итерационной переменной parameter последовательно
            // присваивается значение каждого элемента массива или коллекции parameters.keySet, после чего
            // выполняется указанный блок операторов
            switch (parameter) {
                // Integer.parseInt преобразует строку в число
                case "ОЗУ(Gb)" -> minRamGB = Integer.parseInt(parameters.get(parameter));
                case "Объём ЖД(Gb)" -> minStorageCapacityGb = Integer.parseInt(parameters.get(parameter));
                case "Бренд" -> brand = parameters.get(parameter);
                case "Цвет" -> color = parameters.get(parameter);
                case "Цена" -> minPrice = Integer.parseInt(parameters.get(parameter));
            }
        }
        for (Notebook nb : notebooks) {
            if ((minRamGB != 0 && nb.ramGb < minRamGB) ||
                    (minStorageCapacityGb != 0 && nb.storageGb < minStorageCapacityGb) ||
                    (minPrice != 0 && nb.price < minPrice) ||
                    (!brand.isEmpty() && !nb.brand.equalsIgnoreCase(brand)) ||
                    (!color.isEmpty() && !nb.color.equalsIgnoreCase(color))
            ) {
                result.remove(nb);
                // если условие не выполняется то удаляется фильтр
            }
        }
        if (result.size() == 0) {
            System.out.println("Нет элементов соответствующих фильтру.");
        }
        for (Notebook nb : result) {
            System.out.println(nb);
        }
    }

    public static HashSet<Notebook> getNotebooks() {
        HashSet<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Xiaomi", "RedmiBook15", 8, "ssd", 512, "black", 40000));
        notebooks.add(new Notebook("HP", "H6", 6, "ssd", 512, "yellow", 30000));
        notebooks.add(new Notebook("Lenovo", "L30", 8, "ssd", 512, "silver", 30000));
        notebooks.add(new Notebook("Asus", "A700", 8, "ssd", 1024, "green", 60000));
        notebooks.add(new Notebook("Apple", "A4000", 6, "ssd", 2048, "silver", 90000));
        return notebooks;
    }
}
