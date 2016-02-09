package se.peter.myanimals;

public class Animal {

    // Instansvariabler
        // Bild på djuret
         /*

        ID i xml:
        @drawable/namn_på_bilden

        ID i java:
        R.drawable.namn_på_bilden

          */

    private int imageId;
    private String name;
    private String description;


    // Klassvariabler


    // Konstruktorer
    public Animal() {
        // Kod för ett "Standarddjur"/"placeholderdjur"
    }

    public Animal(int imageId, String name, String desc){
        this.imageId = imageId;
        this.name = name;
        this.description = desc;

    }

    // Instansmetoder
    public int getImageId(){

        return this.imageId;
    }


    public String getName() {

        return name;
    }

    public String getDescription() {

        return description;
    }


    // Klassmetoder






}
