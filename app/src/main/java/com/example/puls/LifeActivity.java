package com.example.puls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Map;

public class LifeActivity extends AppCompatActivity {
    public long time = System.currentTimeMillis();//Local time не доступно просто кайф
    private static final String TAG="MyApp";
    private Button btnSave;
    private Button button;
    private EditText Weight;
    private EditText Step;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        init();
        btnSave();
        kekSave();
    }
    private void init(){
        btnSave =  findViewById(R.id.btn_three);
        button = findViewById(R.id.btn_three);
        Weight = findViewById(R.id.edit_m);
        Step = findViewById(R.id.edit_step);
    }
    private void btnSave(){

        Log.i(TAG,String.valueOf(R.string.log));
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String weight = Weight.getText().toString();
                    String step = Step.getText().toString();
                    double doubleWeight = Double.parseDouble(weight);
                    int intStep = Integer.parseInt(step);
                    Life life = new Life(doubleWeight, intStep);
                    Map<Long, Life> LifeActivity = new HashMap<>();
                    LifeActivity.put(time, life);
                }
                catch (NumberFormatException e){
                    Log.e(TAG,String.valueOf(R.string.log_exception));
                    Toast toast = Toast.makeText(getApplicationContext(),
                            String.valueOf(R.string.correct_info), Toast.LENGTH_SHORT);
                    toast.show();
                }
                finally {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            String.valueOf(R.string.saved_info), Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
    private void kekSave(){
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast toast = Toast.makeText(getApplicationContext(),
                       String.valueOf(R.string.joke)  , Toast.LENGTH_SHORT);
               toast.show();
           }
       });
    }
}
