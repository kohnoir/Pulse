package com.example.puls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.LocalTime;
import java.util.Map;
public class MainActivity extends AppCompatActivity {

    private static final String TAG="MyApp";
    private Button btnPress;
    private Button btnSave;
    private EditText lineName;
    private EditText old;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        SaveName();
        SwitchLife();
        SwitchPress();
    }
    private void init(){
        btnPress = findViewById(R.id.btn_pressure);
        btnSave = findViewById(R.id.btn_save);
        lineName = findViewById(R.id.line_name);
        old = findViewById(R.id.line_old);
    }
    private void SaveName(){
        Log.i(TAG,String.valueOf(R.string.log));
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    String LineName = lineName.getText().toString();
                    String StringOld = old.getText().toString();
                    int intOld = Integer.parseInt(StringOld);
                    User user = new User(LineName, intOld);

                }
                catch (NumberFormatException e){
                    Log.e(TAG,String.valueOf(R.string.log_exception));
                    Toast toast = Toast.makeText(getApplicationContext(),
                            String.valueOf(R.string.correct_info), Toast.LENGTH_SHORT);
                    toast.show();
                }
                finally {
                    EditText lineName = findViewById(R.id.line_name);
                    String LineName = lineName.getText().toString();
                    Toast toast = Toast.makeText(getApplicationContext(),
                            R.string.hello + LineName, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
    private void SwitchLife(){
        Button btnLife = findViewById(R.id.btn_life);
        btnLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_life) {
                    Intent intent = new Intent(MainActivity.this, LifeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
    private void SwitchPress(){
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_pressure) {
                    Intent intent = new Intent(MainActivity.this, PressureActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
