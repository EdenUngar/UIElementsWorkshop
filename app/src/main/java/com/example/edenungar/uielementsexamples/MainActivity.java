package com.example.edenungar.uielementsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;
    private CheckBox checkBox;
    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        checkBox = findViewById(R.id.checkBox);
        switch1 = findViewById(R.id.switch1);

        textView.setText("This text is changed in the onCreate");

        setListeners();
    }

    private void setListeners() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set entered text (in EditText) as textView
                textView.setText(editText.getText());
            }
        });
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //show text when checkbox is clicked
                textView.setText("Now Press the Button!");
            }
        });
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change text when switch
                textView.setText("Now Check the Box!");
            }
        });
    }

}
