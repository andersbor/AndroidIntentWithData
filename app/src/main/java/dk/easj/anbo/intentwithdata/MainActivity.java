package dk.easj.anbo.intentwithdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameField = findViewById(R.id.mainNameEditText);
    }

    public void sendClicked(View view) {
        String name = nameField.getText().toString();
        Intent intent = new Intent(this, AnotherActivity.class);
        intent.putExtra(AnotherActivity.NAME, name);
        startActivity(intent);
    }

    public void sendStarterPatternClicked(View view) {
        String name = nameField.getText().toString();
        AnotherActivityImplementingStarterPattern.start(this, name);
    }
}
