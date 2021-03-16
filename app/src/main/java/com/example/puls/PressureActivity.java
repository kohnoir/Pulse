package com.example.puls;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.CheckBox;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Map;

public class PressureActivity extends AppCompatActivity {
    private static final String TAG="MyApp";
    private Button btnRrs;
    private EditText editPulse;
    private EditText highPress;
    private EditText lowPress;
    private EditText editDate;
    private EditText editTime;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        init();
        SavePress();
    }
    private void init(){
        btnRrs = findViewById(R.id.button);
        editPulse = findViewById(R.id.edit_pulse);
        highPress = findViewById(R.id.high_press);
        lowPress = findViewById(R.id.low_press);
        editDate = findViewById(R.id.edit_date);
        editTime = findViewById(R.id.edit_text_six);
        checkBox = findViewById(R.id.check_box_three);
    }
    private void SavePress(){
        Log.i(TAG, String.valueOf(R.string.log));
        btnRrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String tah = String.valueOf(R.string.no_tah);
                    if (checkBox.isChecked()) {
                        tah = String.valueOf(R.string.tah);
                    }
                    String EditPulse = editPulse.getText().toString();
                    String HighPress = highPress.getText().toString();
                    String LowPress = lowPress.getText().toString();
                    String EditDate = editDate.getText().toString();
                    String EditTime = editTime.getText().toString();
                    Time time = new Time(EditTime, EditDate);
                    Pressure pressure = new Pressure(EditPulse, HighPress, LowPress, tah);
                    Map<Time, Pressure> PRESSURE = new HashMap<>();
                    PRESSURE.put(time, pressure);
                }
                catch (NumberFormatException e){
                    Log.e(TAG,String.valueOf(R.string.log_exception));
                    Toast toast = Toast.makeText(getApplicationContext(),
                            String.valueOf(R.string.correct_info), Toast.LENGTH_SHORT);
                    toast.show();
                }
                finally {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            String.valueOf(R.string.saved_info) , Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
