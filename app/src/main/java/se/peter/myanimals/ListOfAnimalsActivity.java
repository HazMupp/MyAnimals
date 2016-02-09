package se.peter.myanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ListOfAnimalsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);



    }

    // Vad som händer när man klickar på "share"
    public void shareInformation(View view) {

         //Visa en "Toast" med att vi klickat på knappen
         Toast.makeText(ListOfAnimalsActivity.this, "Du klickade på knappen!!!!", Toast.LENGTH_SHORT).show();

         //Skapa en implicit intent
        // Dvs skicka information som kan tas emot av en annan app

         Intent intent = new Intent();
           intent.setAction(Intent.ACTION_SEND);
        // Vilken text vill vi skicka?
         intent.putExtra(Intent.EXTRA_TEXT, "red panda bla bla bla");
        //   // Vad är det för något vi skickat?
            intent.setType("text/plain");
        // Skicka!
        startActivity(intent);

        Zoo myZoo = new Zoo();
        Animal elephant = myZoo.getAnimal("elephant");
        if (elephant != null) {
            String elephantName = elephant.getName();
            Toast.makeText(this, "elefanten heter " + elephant.getName(), Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Det finns ingen elefant! " + elephant.getName(), Toast.LENGTH_SHORT).show();
        }
    }

    public void exploreElephant(View view) {


        // Starta vår activity DetailedInformationActivity
        Intent intent = new Intent(this, DetailedInformationActivity.class);
        setContentView(R.layout.activity_nr2);

      /*  // key    // value
        intent.putExtra("animal", "panda");

        Log.i("teeest", "test2");

        startActivity(intent);
        */
    }

}




