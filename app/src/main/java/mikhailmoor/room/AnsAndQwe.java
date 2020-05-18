package mikhailmoor.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "AnsAndQwe")
public class AnsAndQwe {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;

    public AnsAndQwe(int id, String question, String answerA, String answerB, String answerC, String answerD) {
        this.id = id;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
    }
}
