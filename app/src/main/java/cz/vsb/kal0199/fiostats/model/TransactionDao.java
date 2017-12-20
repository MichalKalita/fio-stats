package cz.vsb.kal0199.fiostats.model;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface TransactionDao {
    @Query("SELECT * FROM `Transaction`")
    LiveData<List<Transaction>> getAll();

    @Query("SELECT * FROM `Transaction` WHERE id IN (:transIds)")
    List<Transaction> loadAllByIds(int[] transIds);

//    @Query("SELECT * FROM `Transaction` WHERE first_name LIKE :first AND "
//            + "last_name LIKE :last LIMIT 1")
//    Transaction findByName(String first, String last);

    @Insert
    void insertAll(Transaction... transactions);

    @Delete
    void delete(Transaction transaction);

}
