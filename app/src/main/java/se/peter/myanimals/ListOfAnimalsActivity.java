package se.peter.myanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ListOfAnimalsActivity extends AppCompatActivity {


    Animal elephant = new Animal();
    Zoo myZoo = new Zoo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);

        // Hämta det som ska innehålla animal_card d.v.s vår card_container
        RelativeLayout animalCardContainer = (RelativeLayout) findViewById(R.id.animal_container);

        // En LinearLayout är en ViewGroup
        // En ViewGroup är en View


        // Hämta alla djur, ett djur i taget...
        for(int i = 0; i < myZoo.getNumberOfAnimals(); i++) {
            // Hämta ett visst djur
            Animal theAnimal = myZoo.getAnimal(i);

            // Hämta information om djuret
            String theAnimalName = theAnimal.getName();
            String theAnimalDescription = theAnimal.getDescription();
            int theAnimalImageId = theAnimal.getImageId();




            // Hämta XML-koden för ett kort och gör om till ett objekt i Java (inflate).
            View animalCard = getLayoutInflater().inflate(R.layout.animal_card, animalCardContainer, false);

            // Hämta Views i ett AnimalCard
            TextView animalNameView = (TextView) animalCard.findViewById(R.id.animal_name);
            TextView animalDescriptionView = (TextView) animalCard.findViewById(R.id.animal_info);
            ImageView animalImageView = (ImageView) animalCard.findViewById(R.id.animal_picture);


            // Ändra på ovan views så att de får informationen från djuren...
            animalNameView.setText(theAnimalName);
            animalDescriptionView.setText(theAnimalDescription);
            animalImageView.setImageResource(theAnimalImageId);


            // Lägg till i vår "container", d.v.s.regadtxge
            animalCardContainer.addView(animalCard);
        }
    }

    public void exploreAnimal(View view) {

            Toast.makeText(ListOfAnimalsActivity.this,"" + view.getTag(), Toast.LENGTH_SHORT).show();
            TextView textView = (TextView) findViewById(R.id.animal_headline);


        // Starta vår activity DetailedInformationActivity
        Intent intent = new Intent(this, DetailedInformationActivity.class);

        setContentView(R.layout.detailed_activity);

      /*  // key    // value
        intent.putExtra("animal", "panda");

        Log.i("teeest", "test2");

        startActivity(intent);

        */

    }

}




