package com.example.secondinclassactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static String TITLE = "BOOK TITLE";
    static String AUTHOR_NAME = "AUTHOR_NAME";
    static int PAGES = 100;

    public EditText title;
    public EditText author_name;
    public EditText pages;
    public Button add;
    public Button save;

    public SharedPreferences prefs;
    public SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title.findViewById(R.id.title);
        author_name.findViewById(R.id.author_name);
        int p = Integer.parseInt(pages.findViewById(R.id.pages).toString());

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupPrefs();
                String t = prefs.getString(TITLE, "");
                String n = prefs.getString(AUTHOR_NAME, "");
                editor.putString(TITLE, t);
                editor.putString(AUTHOR_NAME, n);


            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Book> books = new ArrayList<>();
                String t = title.findViewById(R.id.title).toString();
                String n = author_name.findViewById(R.id.author_name).toString();
                int p = Integer.parseInt(pages.findViewById(R.id.pages).toString());
                books.add(new Book(t,n,p));
            }
        });
    }

    public void setupPrefs(){
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }

}