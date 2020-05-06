package mikhailmoor.countryquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    private Button europaButton;
    private Button asiaButton;
    private Button oceaniaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        europaButton = findViewById(R.id.europaButton);
        asiaButton = findViewById(R.id.asiaButton);
        oceaniaButton = findViewById(R.id.oceaniaButton);
    }


    public void startEuropaGame(View view) {
        Intent intent = new Intent(this, EuropaGame.class);
        startActivity(intent);
    }

    public void startAsiaGame(View view) {
        Intent intent = new Intent(this, AsiaGame.class);
        startActivity(intent);
    }

    public void startOceaniaGame(View view) {
        Intent intent = new Intent(this, OceaniaGame.class);
        startActivity(intent);
    }
}
