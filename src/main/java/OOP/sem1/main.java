package OOP.sem1;

public class main {
    public static void main(String[] args) {

        VendingMachine apparat = new VendingMachine(); // Определяем в классе переменную
        apparat.addProduct(new Chocolate("Alpen gold", 10, "темный",
                        "с орехом", 100))
                // добавляем наименования товара.
                // изменили new Product на new Chocolate так как в методе прописали форматирования, т.е. мы ссылаемся на
                // дочерний метод. Так же дописываем параметры
                .addProduct(new Product("яблоко", 30))
                .addProduct(new Product("Кола", 15))
                .addProduct(new Cheese("Российский", 10, "вкусный", 1000));
        // Добавляем продукты, Product Chesse  это классы. В классе Product создали имя и цену на товар, тут сделали какие товары добавлять

        System.out.println(apparat);
        // так как в классе вендинг уже есть билдер с выводом тут просто указываем переменную
        Product product = apparat.findProduct("яблоко");
        // Тип переменной (класс) и имя переменной
        System.out.println(product);

        System.out.println("+++++++++++++++++++++");
        Product saledProduct = apparat.saleProduct("яблоко");
        System.out.println(saledProduct);
        // apparat это имя переменной для метода вендинг.плюс метод

        Product saledProduct2 = apparat.saleProduct("Кола");
        System.out.println(saledProduct2);
        System.out.println(apparat);

    }
}
