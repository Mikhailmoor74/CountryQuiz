package mikhailmoor.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AnsAndQweDao {

    @Insert
    public int addQandA(AnsAndQwe ansAndQwe);

    @Update
    public void updateQandA(AnsAndQwe ansAndQwe);

    @Delete
    public void deleteQandA(AnsAndQwe ansAndQwe);

    @Query("SELECT * FROM ansandqwe")
    List<AnsAndQwe> getAll();
}
