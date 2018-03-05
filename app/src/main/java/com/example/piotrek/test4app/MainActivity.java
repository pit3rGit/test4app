package com.example.piotrek.test4app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void policzQv(View view){
        EditText vEdit = (EditText) findViewById(R.id.velocity);
        String vString = vEdit.getText().toString();
        Double v = Double.parseDouble(vString);

        EditText heightEdit = (EditText) findViewById(R.id.heightEditText);
        String heightString = heightEdit.getText().toString();
        Double height = Double.parseDouble(heightString);

        EditText widthEdit = (EditText) findViewById(R.id.widthEditText);
        String widthString = widthEdit.getText().toString();
        Double width = Double.parseDouble(widthString);

        RadioButton m3sRadio = (RadioButton) findViewById(R.id.m3sRadio);
        RadioButton m3minRadio = (RadioButton) findViewById(R.id.m3minRadio);
        RadioButton m3hRadio = (RadioButton) findViewById(R.id.m3hRadio);

        RadioButton wsp08Radio = (RadioButton) findViewById(R.id.wsp08Radio);
        RadioButton wsp1Radio = (RadioButton) findViewById(R.id.wsp1Radio);

        double qv = 0;
        double wsp = 0.8;
        if(wsp1Radio.isChecked()) {
            wsp = 1;
        }
        qv = width*height*wsp*v;
        if(m3minRadio.isChecked()){
            qv = qv*60;
        }else if(m3hRadio.isChecked()){
            qv = qv*60*60;
        }

        TextView qvTextView = (TextView) findViewById(R.id.qvTextView);
        Double dQv = qv;
        qvTextView.setText(String.format( "%.2f", qv ));

    }
    public void m3s(View view){
        policzQv(view);
    }
    public void m3min(View view){
        policzQv(view);
    }
    public void m3h(View view){
        policzQv(view);
    }
    public void wsp08(View view){
        policzQv(view);
    }
    public void wsp1(View view){
        policzQv(view);
    }
}
