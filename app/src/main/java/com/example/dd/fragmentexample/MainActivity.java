package com.example.dd.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView orangeFragment,bananaFragment,chickenFragment,canjelloFragment,pitsaFragment,mangoFragment,pineappleFragment,pastaFragment,beggerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the reference of Button's

        orangeFragment= (TextView) findViewById(R.id.orangeFragment);
        bananaFragment= (TextView) findViewById(R.id.bananaFragment);
       chickenFragment= (TextView) findViewById(R.id.chickenFragment);
        canjelloFragment= (TextView) findViewById(R.id.canjelloFragment);
        pitsaFragment= (TextView) findViewById(R.id.pitsaFragment);
        mangoFragment= (TextView) findViewById(R.id.mangoFragment);
        pineappleFragment= (TextView) findViewById(R.id.pineappleFragment);
        pastaFragment= (TextView) findViewById(R.id.pastaFragment);
        beggerFragment= (TextView) findViewById(R.id.beggerFragment);

        orangeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new OrangeFragment());
            }
        });

        bananaFragment .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new bananaFragment());
            }
        });

        chickenFragment .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new chickenFragment());
            }
        });

        canjelloFragment .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new canjelloFragment());
            }
        });
        pitsaFragment .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pitsaFragment());
            }
        });
        mangoFragment .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new mangoFragment());
            }
        });

        pineappleFragment .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new bananaFragment());
            }
        });

        pastaFragment .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pastaFragment());
            }
        });

        beggerFragment .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new beggerFragment());
            }
        });

    }



    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}