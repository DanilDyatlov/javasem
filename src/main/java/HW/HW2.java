package HW;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class HW2 {
    public static void main(String[] args) {
        //task1();
        task2();

    }

    private static void task1() {
// 1. Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.

// Пример 1:
// Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
// Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//
//Пример 2:
//Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
// Результат: SELECT * FROM USER;

//  Метод: Objects.equals(null, myString)   Objects = "=="


        String[] students = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
//     String[] students = {"name:null", "country:null", "city:null", "age:null"};


        StringBuilder selectString = new StringBuilder(); // объявляем строку

        String[] name = students[0].split(":"); // разделяем массив с помощью ":", разделяем массив на части
        String[] country = students[1].split(":");
        String[] city = students[2].split(":");
        String[] age = students[3].split(":");
        System.out.println(Arrays.toString(students));

        String nullElem = "null"; // приравниваем значения null переменной
        if (!Objects.equals(name[1], nullElem)) { // если значения не равны, то мы добавляем
            selectString.append("name = " + name[1] + " ").append("and ");
        }
        if (!Objects.equals(country[1], nullElem)) {
            selectString.append("country = " + country[1] + " ").append("and ");
        }
        if (!Objects.equals(city[1], nullElem)) {
            selectString.append("city = " + city[1] + " ");
        }
        if (!Objects.equals(age[1], nullElem)) {
            selectString.append("age = " + age[1] + " ");
        }

//        if (!Objects.equals(name[1], nullElem)) {
//            selectWhere.append(students[0] + " ");
//        }
//        if (!Objects.equals(country[1], nullElem)) {
//            selectWhere.append(students[1] + " ");
//        }
//        if (!Objects.equals(city[1], nullElem)) {
//            selectWhere.append(students[2] + " ");
//        }
//        if (!Objects.equals(age[1], nullElem)) {
//            selectWhere.append(students[3] + " ");
//        }

        System.out.println("SELECT * FROM USER " + selectString);
    }

    private static void task2() {
// Напишите метод, который определит тип (расширение) файлов из текущей папки
// и выведет в консоль результат вида:
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg
        File dir = new File("C:\\Users\\Danil\\Desktop\\GB\\Java\\javalesson\\src\\main\\java\\HW\\folderFile");
// получаем все вложенные объекты в папке
        for (File item : dir.listFiles()) {
// isDirectory Проверяет, что путь — это директория, а не файл
            if (item.isDirectory()) {
                System.out.println(item.getName() + "  \t folder");
            } else {
                String fileName = item.getName();
// IndexOf ищет точку с самого начала, т.е. первое вхождение.
// Если строка найдена – метод возвращает номер ее первого символа, если не найдена — возвращает -1
// цикл if проверяет не равно ли значение -1 и не стоит ли точка на первом месте
// beginIndex. Возвращает все после точки
                if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0);
                System.out.println(item.getName()+ " " + "Расширение файла: " + fileName.substring(fileName.lastIndexOf(".")));
            }

        }

    }
}
