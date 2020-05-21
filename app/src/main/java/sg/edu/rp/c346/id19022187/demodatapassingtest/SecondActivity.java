package sg.edu.rp.c346.id19022187.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = findViewById(R.id.textView2);
        Intent intent = getIntent();
        int value = intent.getIntExtra("value", 0);
        tv.setText("Integer value received is: " + value);

    }
}
