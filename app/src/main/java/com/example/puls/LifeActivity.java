package com.example.puls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Map;

public class LifeActivity extends AppCompatActivity {
    long time = System.currentTimeMillis();//Local time не доступно просто кайф
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        BtnSave();
        KekSave();
    }
    private void BtnSave(){
        Button btnSave =  (Button) findViewById(R.id.btn3);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditText Ves = findViewById(R.id.editMuss);
                    EditText Step = findViewById(R.id.editStep);
                    String ves = Ves.getText().toString();
                    String step = Step.getText().toString();
                    double doubleVes = Double.parseDouble(ves);
                    int intStep = Integer.parseInt(step);
                    Life life = new Life(doubleVes, intStep);
                    Map<Long, Life> LifeActivity = new HashMap<>();
                    LifeActivity.put(time, life);
                }
                catch (NumberFormatException e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите правильные данные", Toast.LENGTH_SHORT);
                    toast.show();
                }
                finally {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Данные сохранены", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
    private void KekSave(){
       Button button = (Button) findViewById(R.id.btn3);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast toast = Toast.makeText(getApplicationContext(),
                       "Кто это такой этот ваш ковбой Биба", Toast.LENGTH_SHORT);
               toast.show();
           }
       });
    }
}
