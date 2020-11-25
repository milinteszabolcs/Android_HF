package ro.sapi.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Octopus","Pig","Sheep","Rabbit",
            "Snake","Spider","Spider","Spider","Spider" };

    String[] infoArray = {
            "8 tentacled monster",
            "Delicious in rolls",
            "Great for jumpers",
            "Nice in a stew",
            "Great for shoes",
            "Scary",
            "Scary",
            "Scary",
            "Scary"
    };

    Integer[] imageArray = {R.drawable.cat,
            R.drawable.disznyo,
            R.drawable.dog,
            R.drawable.giraffe,
            R.drawable.horse,
            R.drawable.lion,
            R.drawable.octopus3,
            R.drawable.rabbit,
            R.drawable.sheep
    };

    String[] ageArray = {
            "2","3","12","6","9","10","1","8","14"
    };

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter valami = new CustomListAdapter(this,nameArray,infoArray,imageArray);
        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setAdapter(valami);

        recyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"asdasd",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                String message=nameArray[position];
                intent.putExtra("animal",message);

                startActivity(intent);
            }
        });


    }
}
