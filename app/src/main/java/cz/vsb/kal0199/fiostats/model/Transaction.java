package cz.vsb.kal0199.fiostats.model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Transaction {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @PrimaryKey
    private int id;



    // Getters and setters are ignored for brevity,
    // but they're required for Room to work.
}
