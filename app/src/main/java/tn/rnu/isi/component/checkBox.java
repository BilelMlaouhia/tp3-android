package tn.rnu.isi.component;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

public class checkBox extends AppCompatActivity {
    private CheckBox plain;
    private CheckBox serif;
    private CheckBox bold;
    private CheckBox italic;
    private Button btn;
    private ToggleButton t1;
    private ToggleButton t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        plain = findViewById(R.id.p);
        serif = findViewById(R.id.s);
        bold = findViewById(R.id.b);
        italic = findViewById(R.id.i);
        btn = findViewById(R.id.btnCheckbox);
        btn.setOnClickListener(v -> {
            afficherCheckboxes();
        });
        t1 = findViewById(R.id.toggle1);
        t2 = findViewById(R.id.toggle2);
        t1.setOnCheckedChangeListener((k,v) -> {
            if(t1.isChecked()) {
                italic.setTextColor(ContextCompat.getColor(this, R.color.purple_200));
                plain.setTextColor(ContextCompat.getColor(this, R.color.purple_200));
                serif.setTextColor(ContextCompat.getColor(this, R.color.purple_200));
                bold.setTextColor(ContextCompat.getColor(this, R.color.purple_200));
            }else {
                plain.setTextColor(ContextCompat.getColor(this, R.color.red));
                serif.setTextColor(ContextCompat.getColor(this, R.color.red));
                bold.setTextColor(ContextCompat.getColor(this, R.color.red));
                italic.setTextColor(ContextCompat.getColor(this, R.color.red));
            }
        });



        t2.setOnCheckedChangeListener((k,v)->{
            plain.setChecked(!plain.isChecked());
            serif.setChecked(!serif.isChecked());
            bold.setChecked(!bold.isChecked());
            italic.setChecked(!italic.isChecked());
        });


    }

    public void afficherCheckboxes() {
        String msg = "plain and bold not checked yet!!";
        boolean p = plain.isChecked();
        boolean b = bold.isChecked();
        if (p && b) {
            msg = "both checked correctly :)))";
        }
        Toast.makeText(checkBox.this, msg, Toast.LENGTH_LONG).show();
    }

}