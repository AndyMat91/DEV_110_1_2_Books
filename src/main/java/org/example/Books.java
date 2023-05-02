package org.example;

public class Books {
    private String title;
    private PublishingHouses publishingHouses;
    private int yearPublication;
    private String[] authors;

    public Books(String title, PublishingHouses houses, int year) {
        /*this.publishingHouses = publishingHouses; - еще один вариант присваивания ссылки на объект, без использования set-метода*/
        this.publishingHouses = houses;
        setTitle(title);
        setYearPublication(year);
    }

    public Books(String author, String title, PublishingHouses houses, int year) {
        this.publishingHouses = houses;
        setTitle(title);
        setYearPublication(year);
        setAuthor(author);
    }


    public Books(String[] authors, String title, PublishingHouses houses, int year) {
        this.publishingHouses = houses;
        setTitle(title);
        setYearPublication(year);
        setAuthors(authors);
    }

    //Если в параметрах конструктора передается ссылка на другую модель, где предусматриваются свои механизмы валидации, то такие ссылки передаются прямиком в переменную объекта:
    //this.publishingHouses = publishingHouses;
    //setPublishingHouses(publishingHouses);

/*    public void setPublishingHouses(PublishingHouses publishingHouses) {
        if (publishingHouses != null) {
            this.publishingHouses = publishingHouses;
        } else {
            throw new IllegalAccessError("Ссылка на объект не может быть пустой");
        }
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else {
            throw new IllegalAccessError("Название книги не может быть пустой ссылкой");
        }
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        if (yearPublication > 0) {
            this.yearPublication = yearPublication;
        } else {
            throw new IllegalAccessError("Год издания должен быть больше нуля");
        }
    }

    public void setAuthors(String[] authors) {
        if (authors != null) {
            this.authors = authors;
        } else {
            throw new IllegalAccessError("Массив не должен содержать пустых ссылок");
        }
    }

    public int getAuthorsSum() {
        if (authors != null) {
            return authors.length;
        } else {
            return 0;
        }
    }

    public String getAuthor(int i) {
        if (i < authors.length && i >= 0) {
            return authors[i];
        } else {
            throw new IllegalAccessError("Автора с данным индексом не найдено");
        }
    }

    public void setAuthor(String i) {
        if (i != null) {
            authors = new String[]{i};
        } else {
            throw new IllegalAccessError("Массив не должен содержать пустых строк");
        }
    }


    public void print() {
        System.out.print("Название книги: " + getTitle() + "; Авторы книги:");
        if (authors != null) {
            for (String s : authors) {
                if (s == null) {
                    break;
                } else {
                    System.out.print(s);
                }
            }
        } else
            System.out.print("отсутствуют");


        System.out.print("; Издательство: " + publishingHouses.getTitle() + "; Город: " + publishingHouses.getCity() + "; Год издания: " + getYearPublication());
    }

    public static void printAll(Books[] books) {
        for (Books c : books) {
            c.print();
            System.out.println();
        }
    }

}
