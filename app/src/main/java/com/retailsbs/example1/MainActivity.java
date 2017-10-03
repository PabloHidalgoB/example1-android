package com.retailsbs.example1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_button1 = (Button) findViewById(R.id.btm_button1);
        btn_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Example 1", "I know what you did last summer");
                Toast.makeText(getApplicationContext(), "I know what you did last summer",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
