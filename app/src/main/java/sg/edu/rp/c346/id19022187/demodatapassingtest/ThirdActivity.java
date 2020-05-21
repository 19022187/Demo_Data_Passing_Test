package sg.edu.rp.c346.id19022187.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv = findViewById(R.id.textView3);
        Intent i =getIntent();
        char a = i.getCharExtra("value", 'a');
        tv.setText("I get back a char: " + a);


    }
}
