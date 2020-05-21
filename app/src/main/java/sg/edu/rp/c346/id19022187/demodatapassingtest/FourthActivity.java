package sg.edu.rp.c346.id19022187.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv = findViewById(R.id.textView4);
        Intent i =getIntent();
        double a = i.getDoubleExtra("value", 99.99);
        tv.setText("Double value received is: " + a);
    }
}
