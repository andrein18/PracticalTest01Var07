package ro.pub.cs.systems.eim.practicaltest01var07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var07MainActivity extends AppCompatActivity {

    EditText first_number_edit_text = (EditText) findViewById(R.id.first_number_edit_text);
    EditText second_number_edit_text = (EditText) findViewById(R.id.second_number_edit_text);
    EditText third_number_edit_text = (EditText) findViewById(R.id.third_number_edit_text);
    EditText fourth_number_edit_text = (EditText) findViewById(R.id.fourth_number_edit_text);
    Button set_button = (Button) findViewById(R.id.set_button);

    ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Button button = (Button) view;
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0;

            try {
                n1 = Integer.parseInt(first_number_edit_text.getText().toString());
                n2 = Integer.parseInt(second_number_edit_text.getText().toString());
                n3 = Integer.parseInt(third_number_edit_text.getText().toString());
                n4 = Integer.parseInt(fourth_number_edit_text.getText().toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            Intent intent = new Intent(getApplicationContext(), PracticalTest01Var07SecondaryActivity.class);
            intent.putExtra("first_number", n1);
            intent.putExtra("second_number", n2);
            intent.putExtra("third_number", n3);
            intent.putExtra("fourth_number", n4);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var07_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("first_number", first_number_edit_text.getText().toString());
        savedInstanceState.putString("second_number", second_number_edit_text.getText().toString());
        savedInstanceState.putString("third_number", third_number_edit_text.getText().toString());
        savedInstanceState.putString("fourth_number", fourth_number_edit_text.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState.containsKey("first_number")) {
            first_number_edit_text.setText(savedInstanceState.getString("first_number"));
        } else {
            first_number_edit_text.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey("second_number")) {
            second_number_edit_text.setText(savedInstanceState.getString("second_number"));
        } else {
            second_number_edit_text.setText(String.valueOf(0));
        }

        if (savedInstanceState.containsKey("third_number")) {
            third_number_edit_text.setText(savedInstanceState.getString("third_number"));
        } else {
            third_number_edit_text.setText(String.valueOf(0));
        }
        if (savedInstanceState.containsKey("fourth_number")) {
            fourth_number_edit_text.setText(savedInstanceState.getString("fourth_number"));
        } else {
            fourth_number_edit_text.setText(String.valueOf(0));
        }
    }
}
