package com.example.puls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.LocalTime;
import java.util.Map;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SaveName();
        SwitchLife();
        SwitchPress();
    }
    private void SaveName(){
        Button btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditText fIO = findViewById(R.id.strokaFIO);
                    EditText old = findViewById(R.id.strokaOld);
                    String FIO = fIO.getText().toString();
                    String StringOld = old.getText().toString();
                    int intOld = Integer.parseInt(StringOld);
                    User user = new User(FIO, intOld);

                }
                catch (NumberFormatException e){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите правильные данные", Toast.LENGTH_SHORT);
                    toast.show();
                }
                finally {
                    EditText fIO = findViewById(R.id.strokaFIO);
                    String FIO = fIO.getText().toString();
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Добро пожаловать, " + FIO, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
    private void SwitchLife(){
        Button btnLife = (Button) findViewById(R.id.btnLife);
        btnLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btnLife:
                        Intent intent = new Intent(MainActivity.this, LifeActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
    private void SwitchPress(){
        Button btnPress = (Button) findViewById(R.id.btnPressure);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnPressure:
                        Intent intent = new Intent(MainActivity.this, PressureActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
