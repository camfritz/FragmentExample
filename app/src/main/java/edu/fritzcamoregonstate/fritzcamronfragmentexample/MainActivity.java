package edu.fritzcamoregonstate.fritzcamronfragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //References to fragment buttons
        Button mFragment_button_1 = (Button) findViewById(R.id.fragment_button_1);
        Button mFragment_button_2 = (Button) findViewById(R.id.fragment_button_2);

        //listener for button 1

        mFragment_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });

        //listener for button 2

        mFragment_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(v);
            }
        });
    }

    public void changeFragment(View v) {
        //create reference to fragment object
        Fragment fragment;
        if(v == findViewById(R.id.fragment_button_1)) {
            fragment = new Fragment1();

            //NEW STUFF
            //create instance of fragment manager
            FragmentManager fragment_manager = getSupportFragmentManager();
            fragment_manager.beginTransaction() //starts the fragment mapping
                    .replace(R.id.fragment_container, fragment)
                    .commit();
        }
        else {
            if(v == findViewById(R.id.fragment_button_2)) {
                fragment = new Fragment2();

                //NEW STUFF
                //create instance of fragment manager
                FragmentManager fragment_manager = getSupportFragmentManager();
                fragment_manager.beginTransaction() //starts the fragment mapping
                        .replace(R.id.fragment_container, fragment)
                        .commit();
            }
        }
    }

}
