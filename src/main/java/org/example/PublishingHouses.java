package org.example;

public class PublishingHouses {


    private String title;
    private String city;

    public PublishingHouses() {
    }

    public PublishingHouses(String title, String city) {
        setTitle(title);
        setCity(city);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else {
            throw new IllegalAccessError("Название издательства не может быть пустой ссылкой");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        if (city != null) {
            this.city = city;
        } else {
            throw new IllegalAccessError("Название города не может быть пустой ссылкой");
        }
    }
}
