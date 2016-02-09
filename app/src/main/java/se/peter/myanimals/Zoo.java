package se.peter.myanimals;


import java.util.ArrayList;

public class Zoo {

     private ArrayList<Animal> zooAnimal;


    public Zoo() {

        zooAnimal = new ArrayList<>();
        //Klassens (huvudsakliga) konstruktor.


        Animal elephant = new Animal(R.drawable.elephant, "Elefant", "Äter väldigt mycket");
        Animal cobra = new Animal(R.drawable.cobra, "Kobra", "En mycket giftig orm");
        Animal fox = new Animal(R.drawable.fox, "Räv", "What does the fox say?");


        zooAnimal.add(elephant);   // Index 0
        zooAnimal.add(cobra);       // Index 1
        zooAnimal.add(fox);         // Index 2

    }

        public Animal getAnimal(String whichAnimal) {
        // Hur kan vi hämta ett djur?
            int index = -1;

            switch (whichAnimal) {
                case "elephant": index = 0;
                    break;
                case "cobra": index = 1;
                    break;
                case "fox": index = 2;
                    break;
            }


            if (index == -1) {
                return null;

            } else {
                return zooAnimal.get(index);
            }


            // return zooAnimal.get(index);
        }




}



