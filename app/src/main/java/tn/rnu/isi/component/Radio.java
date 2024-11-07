package tn.rnu.isi.component;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Radio extends AppCompatActivity {
    private RadioButton noir;
    private RadioButton vert;
    private RadioButton jaunne;
    private RadioButton rouge;
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        rg = findViewById(R.id.radioGroupe);
        noir = findViewById(R.id.noir);
        vert = findViewById(R.id.vert);
        jaunne = findViewById(R.id.jaunne);
        rouge = findViewById(R.id.rouge);
        rg.setOnCheckedChangeListener((k,v)->{
            changeColorBaseOnCheckedRadioButton();
        });


    }

    public void changeColorBaseOnCheckedRadioButton(){

        if(noir.isChecked()){
            noir.setTextColor(ContextCompat.getColor(this, R.color.black));
            vert.setTextColor(ContextCompat.getColor(this, R.color.black));
            jaunne.setTextColor(ContextCompat.getColor(this, R.color.black));
            rouge.setTextColor(ContextCompat.getColor(this, R.color.black));
        }
        if(vert.isChecked()){
            noir.setTextColor(ContextCompat.getColor(this, R.color.green));
            vert.setTextColor(ContextCompat.getColor(this, R.color.green));
            jaunne.setTextColor(ContextCompat.getColor(this, R.color.green));
            rouge.setTextColor(ContextCompat.getColor(this, R.color.green));
        }
        if(jaunne.isChecked()){
            noir.setTextColor(ContextCompat.getColor(this, R.color.orange));
            vert.setTextColor(ContextCompat.getColor(this, R.color.orange));
            jaunne.setTextColor(ContextCompat.getColor(this, R.color.orange));
            rouge.setTextColor(ContextCompat.getColor(this, R.color.orange));
        }
        if(rouge.isChecked()){
            noir.setTextColor(ContextCompat.getColor(this, R.color.red));
            vert.setTextColor(ContextCompat.getColor(this, R.color.red));
            jaunne.setTextColor(ContextCompat.getColor(this, R.color.red));
            rouge.setTextColor(ContextCompat.getColor(this, R.color.red));
        }
    }
}