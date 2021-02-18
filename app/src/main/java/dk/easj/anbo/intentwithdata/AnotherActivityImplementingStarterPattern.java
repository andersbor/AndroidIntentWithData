package dk.easj.anbo.intentwithdata;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnotherActivityImplementingStarterPattern extends AppCompatActivity {
    private static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_implementing_starter_pattern);
        Intent intent = getIntent();
        String name = intent.getStringExtra(NAME);
        TextView nameView = findViewById(R.id.anotherStartNameTextView);
        nameView.setText("Hello " + name);
    }

    public static void start(Context context, String name) {
        Intent intent = new Intent(context, AnotherActivityImplementingStarterPattern.class);
        intent.putExtra(NAME, name);
        context.startActivity(intent);
    }

    public void backClicked(View view) {
        finish();
    }
}
