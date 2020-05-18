package mikhailmoor.countryquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import mikhailmoor.room.AnsAndQwe;
import mikhailmoor.room.AnsAndQweDao;
import mikhailmoor.room.AnsAndQweDatabase;

public class EuropaGame extends AppCompatActivity {

    private TextView questionTextView;
    private ImageView imageView;
    private Button buttonA;
    private Button buttonB;
    private Button buttonC;
    private Button buttonD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europa_game);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        questionTextView = findViewById(R.id.questionTextView);
        imageView = findViewById(R.id.flagImageView);
        buttonA = findViewById(R.id.answerButtonA);
        buttonB = findViewById(R.id.answerButtonB);
        buttonC = findViewById(R.id.answerButtonC);
        buttonD = findViewById(R.id.answerButtonD);

        String[] questions = getResources().getStringArray(R.array.questions);
        String[] answers = getResources().getStringArray(R.array.answers);

        int n = (int)Math.floor(Math.random() * questions.length);
        int a = (int)Math.floor(Math.random() * answers.length);
        int b = (int)Math.floor(Math.random() * answers.length);
        int c = (int)Math.floor(Math.random() * answers.length);
        int d = (int)Math.floor(Math.random() * answers.length);

        questionTextView.setText(questions[n]);
        buttonA.setText(answers[a]);
        buttonB.setText(answers[b]);
        buttonC.setText(answers[c]);
        buttonD.setText(answers[d]);

        String ans = (String) questionTextView.getText();




        if (ans.equals(questions[0])) {
            buttonA.setText(answers[0]);
        }





    }



}
