package nesztler.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void switchToMainActivity(View button5) {
        Intent activityIntent = new Intent(this,MainActivity.class);
        startActivity(activityIntent);
    }
}
