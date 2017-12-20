package cz.vsb.kal0199.fiostats;

import android.app.Activity;
import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.widget.TextView;

import cz.vsb.kal0199.fiostats.model.AppDatabase;

public class MainActivity extends Activity {

    TextView textView;
    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();

    }
}
