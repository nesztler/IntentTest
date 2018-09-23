package nesztler.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivitySum extends AppCompatActivity {

    private String mMessageTemplate="Sum of %.3f and %.3f is %.3f";
    private double mInput1, mInput2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        TextView sumView = (TextView) findViewById(R.id.sumView);
        setInputFromExtrat();
        String message= String.format(mMessageTemplate, mInput1, mInput2,(mInput1+mInput2));
        sumView.setText(message);
    }

    private void setInputFromExtrat() {
        Intent intent = getIntent();
        Bundle input = intent.getExtras();
        if (input != null) {
            double input1=input.getDouble("input1");
            mInput1=input1;
            double input2=input.getDouble("input2");
            mInput2=input2;
        }
    }
}
