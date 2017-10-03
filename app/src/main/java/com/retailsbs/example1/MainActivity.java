package com.retailsbs.example1;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_button1;
    private Button btn_button2;
    private Button btn_button3;
    private Button btn_button4;
    private LinearLayout lyt_middle;
    private ImageButton btn_mccree;
    private ImageButton btn_zenyatta;
    private ImageButton btn_soldier76;
    private ImageButton btn_genji;
    private ImageButton btn_reinhardt;
    private ImageButton btn_rubberduck;
    private ImageButton btn_pachimari;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_button1 = (Button) findViewById(R.id.btn_button1);
        btn_button2 = (Button) findViewById(R.id.btn_button2);
        btn_button3 = (Button) findViewById(R.id.btn_button3);
        btn_button4 = (Button) findViewById(R.id.btn_button4);

        lyt_middle = (LinearLayout) findViewById(R.id.lyt_middle);

        btn_mccree = (ImageButton) findViewById(R.id.btn_mccree);
        btn_zenyatta = (ImageButton) findViewById(R.id.btn_zenyatta);
        btn_soldier76 = (ImageButton) findViewById(R.id.btn_soldier76);
        btn_genji = (ImageButton) findViewById(R.id.btn_genji);
        btn_reinhardt = (ImageButton) findViewById(R.id.btn_reinhardt);
        btn_rubberduck = (ImageButton) findViewById(R.id.btn_rubberduck);
        btn_pachimari = (ImageButton) findViewById(R.id.btn_pachimari);

        final MediaPlayer mccree = MediaPlayer.create(this, R.raw.mccree);
        final MediaPlayer zenyatta = MediaPlayer.create(this, R.raw.zenyatta);
        final MediaPlayer soldier76 = MediaPlayer.create(this, R.raw.s76);
        final MediaPlayer genji = MediaPlayer.create(this, R.raw.madamada);
        final MediaPlayer reinhardt = MediaPlayer.create(this, R.raw.reinhardt);
        final MediaPlayer rubberduck = MediaPlayer.create(this, R.raw.duck);
        final MediaPlayer pachimari = MediaPlayer.create(this, R.raw.pachimari);


        btn_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("I know what you did last summer");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OH NO!",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });

        btn_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lyt_middle.getVisibility() == View.VISIBLE)
                {
                    lyt_middle.setVisibility(View.GONE);
                } else {
                    lyt_middle.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "I have no idea what i'm doing",
                        Toast.LENGTH_LONG).show();
            }
        });

        btn_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        btn_mccree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mccree.start();
                Toast.makeText(getApplicationContext(), "Howdy",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_zenyatta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zenyatta.start();
                Toast.makeText(getApplicationContext(), "Be one with the universe",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_soldier76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soldier76.start();
                Toast.makeText(getApplicationContext(), "I've got you in my sights",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_genji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genji.start();
                Toast.makeText(getApplicationContext(), "MADA MADA!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_reinhardt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reinhardt.start();
                Toast.makeText(getApplicationContext(), "Hello!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_rubberduck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rubberduck.start();
                Toast.makeText(getApplicationContext(), "Quack :V",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn_pachimari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pachimari.start();
                Toast.makeText(getApplicationContext(), "*squeak*",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
