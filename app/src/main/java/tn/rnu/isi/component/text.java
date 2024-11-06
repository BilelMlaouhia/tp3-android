package tn.rnu.isi.component;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class text extends AppCompatActivity {

    Button btnCap;
    Button btnBold;
    Button btnItalic;
    Typeface initialTypeface;
    TextView idcomposant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        btnCap =(Button) findViewById(R.id.btnCap);
        btnBold =(Button) findViewById(R.id.btnBold);
        btnItalic =(Button) findViewById(R.id.btnItalic);
        idcomposant = (TextView) findViewById(R.id.idcomposant);
         initialTypeface = idcomposant.getTypeface();
        btnCap.setOnClickListener((v)->{
            capitalLetters();
        });
        btnBold.setOnClickListener((v)->{
            boldLetters();
        });
        btnItalic.setOnClickListener((v)->{
            italicLetters();
        });

    }

    public void capitalLetters(){
        idcomposant.setTypeface(initialTypeface);
        idcomposant.setAllCaps(true);
    }
    public void boldLetters(){
        idcomposant.setTypeface(initialTypeface);
        idcomposant.setTypeface(null, Typeface.BOLD);
    }
    public void italicLetters(){
        idcomposant.setTypeface(initialTypeface);
        idcomposant.setTypeface(null, Typeface.ITALIC);
    }


}