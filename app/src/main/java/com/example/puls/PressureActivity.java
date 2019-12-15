package com.example.puls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class PressureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        SavePress();

    }
    private void SavePress(){
        Button btnRrs = (Button) findViewById(R.id.button);
        btnRrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    EditText editPulse = findViewById(R.id.editPulse);
                    EditText verhDav = findViewById(R.id.verhDav);
                    EditText nizDav = findViewById(R.id.nizDav);
                    EditText editDate = findViewById(R.id.editDate);
                    EditText editTime = findViewById(R.id.editText6);
                    final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox3);
                    String tah = "Тахикардии нет";
                    if (checkBox.isChecked()) {
                        tah = "Такихардия есть";
                    }
                    String EditPulse = editPulse.getText().toString();
                    String VerhDav = verhDav.getText().toString();
                    String NizDav = nizDav.getText().toString();
                    String EditDate = editDate.getText().toString();
                    String EditTime = editTime.getText().toString();
                    Time time = new Time(EditTime, EditDate);
                    Pressure pressure = new Pressure(EditPulse, VerhDav, NizDav, tah);
                    Map<Time, Pressure> PRESSURE = new HashMap<>();
                    PRESSURE.put(time, pressure);
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
}
