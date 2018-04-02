package ro.pub.cs.systems.eim.practicaltest01var07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var07SecondaryActivity extends AppCompatActivity {
    EditText first_number_edit_text = (EditText) findViewById(R.id.first_number);
    EditText second_number_edit_text = (EditText) findViewById(R.id.second_number);
    EditText third_number_edit_text = (EditText) findViewById(R.id.third_number);
    EditText fourth_number_edit_text = (EditText) findViewById(R.id.fourth_number);
    Button sum_button = (Button) findViewById(R.id.sum_button);
    Button product_button = (Button) findViewById(R.id.product_button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_secondary);

        int n1, n2, n3, n4;

        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getExtras().containsKey("first_number")) {
                n1 = intent.getIntExtra("first_number", -1);
                first_number_edit_text.setText(String.valueOf(n1));
            }
            if (intent.getExtras().containsKey("second_number")) {
                n2 = intent.getIntExtra("second_number", -1);
                second_number_edit_text.setText(String.valueOf(n2));
            }
            if (intent.getExtras().containsKey("third_number")) {
                n3 = intent.getIntExtra("third_number", -1);
                third_number_edit_text.setText(String.valueOf(n3));
            }
            if (intent.getExtras().containsKey("fourth_number")) {
                n4 = intent.getIntExtra("fourth_number", -1);
                fourth_number_edit_text.setText(String.valueOf(n4));
            }
        }
    }
}
