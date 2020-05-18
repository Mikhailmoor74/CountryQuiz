package mikhailmoor.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {AnsAndQwe.class}, version = 1)
public abstract class AnsAndQweDatabase extends RoomDatabase {

    public abstract AnsAndQweDao getAnsAndQweDao();
}
