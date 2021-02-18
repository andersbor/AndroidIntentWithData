package dk.easj.anbo.intentwithdata;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    public static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        String name = intent.getStringExtra(NAME);

        TextView nameView = findViewById(R.id.anotherNameTextView);
        nameView.setText("Hello " + name);
    }

    public void backClicked(View view) {
        finish();
    }
}
