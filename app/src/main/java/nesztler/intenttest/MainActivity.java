package nesztler.intenttest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchToTestActivity(View button) {
        Intent activityIntent = new Intent(this,ActivityTest.class);
        startActivity(activityIntent);
    }

    public void switchToSumActivity2(View button3) {
        Bundle sumInputs = new Bundle();
        sumInputs.putDouble("input1",5*Math.random());
        sumInputs.putDouble("input2",10*Math.random());
        Intent activityIntent = new Intent(this,ActivitySum.class);
        activityIntent.putExtras(sumInputs);
        startActivity(activityIntent);
    }
}
