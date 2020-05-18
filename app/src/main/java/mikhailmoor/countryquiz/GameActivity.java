package mikhailmoor.countryquiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.appbar.MaterialToolbar;

public class GameActivity extends AppCompatActivity {

    private Button europaButton;
    private Button asiaButton;
    private Button oceaniaButton;
    private Button africaButton;
    private Button americaButton;

    private MaterialToolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        europaButton = findViewById(R.id.europaButton);
        asiaButton = findViewById(R.id.asiaButton);
        oceaniaButton = findViewById(R.id.oceaniaButton);
        africaButton = findViewById(R.id.africaButton);
        americaButton = findViewById(R.id.americaButton);



        /*toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home_white_24dp);*/
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

    public void startAfricaGame(View view) {
        Intent intent = new Intent(this, OceaniaGame.class);  // Не забыть добавить класс для интента
        startActivity(intent);
    }

    public void startAmericaGame(View view) {
        Intent intent = new Intent(this, OceaniaGame.class); // Не забыть добавить класс для интента
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbarmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }



}
