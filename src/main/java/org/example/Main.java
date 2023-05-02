package org.example;

public class Main {
    public static void main(String[] args) {
        PublishingHouses prospect = new PublishingHouses("Проспект", "Москва");
        PublishingHouses piter = new PublishingHouses("Питер", "Санкт-Петербург");
        PublishingHouses bhv = new PublishingHouses("БХВ", "Санкт-Петебург");
        PublishingHouses dialektika = new PublishingHouses("Диалектика", "Киев");

        Books[] books = new Books[]{
                new Books(new String[]{"Седжвик Роберт,", "Уэйн Кевин"}, "Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", piter, 2018),
                new Books("Вигерс Карл", "Разработка требований к программному обеспечению. 3-е издание, дополненное", bhv, 2019),
                new Books("Шилдт Герберт", "Java. Полное руководство, 10-е издание", dialektika, 2018),
                new Books("Полубенцева М.И.", "C/C++. Процедурное программирование", bhv, 2017),
                new Books("Конституция РФ", prospect, 2020)
        };

        System.out.println("Печатаем массив:");
        Books.printAll(books);
        bhv.setCity("Санкт-Петербург");
        System.out.println();
        System.out.println("Исправляем ошибку в названии города издательства «БХВ» путем вызва метода setCity(\"Санкт-Петербург\")");
        System.out.println("Печатаем массив ещё раз:");
        Books.printAll(books);
        System.out.println();
        System.out.println("Вывод изменился для всех книг, изданных издательством «БХВ», потому что в массиве объектов books, я передаю в конструктор\nссылку на объект bhv класса PublishingHouses. Изменение полей объекта будет отражаться везде, где эти поля задействованы.");
        System.out.println();
        System.out.println("Дополнительные проверки:");
        System.out.println("Проверка get-метода, возвращающий количество авторов книги, на примере 0-го и 1-го элементов массива:");
        System.out.println(books[0].getAuthorsSum());
        System.out.println(books[1].getAuthorsSum());
        System.out.println();

        System.out.println("Проверка get-метода, возвращающего автора с заданным индексом, на примере 0-го элемента массива, вернем автора под индексом 1:");
        System.out.println(books[0].getAuthor(1));

    }
}