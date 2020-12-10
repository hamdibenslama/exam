package com.ecgii3rci20g2.examen;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

public interface JournaleDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Journale id);

    @Query("DELETE FROM Journale_table")
    void deleteAll();

    @Query("SELECT * from journale_table ORDER BY id ASC")
    LiveData<List<Journale>> getAllJournale();

    @Query("SELECT * from journale_table LIMIT 1")
    Journale[] getAnyJournale();

    @Delete
    void deleteJournal(Journale id);
}
