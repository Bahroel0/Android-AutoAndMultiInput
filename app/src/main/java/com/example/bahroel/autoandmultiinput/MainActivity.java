package com.example.bahroel.autoandmultiinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    // initialisation of component
    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    String[] animals = {"Bird", "Lion", "Turtle", "Tiger", "Cow", "Monkey", "Goat"};
    ArrayAdapter<String> animalsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialize the components
        autoCompleteTextView        = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView   = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);

        // inisialize the adapter of animals
        animalsAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, animals);

        // Set the animalsAdapter to autoCompleteTextView
        autoCompleteTextView.setAdapter(animalsAdapter);
        multiAutoCompleteTextView.setAdapter(animalsAdapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
