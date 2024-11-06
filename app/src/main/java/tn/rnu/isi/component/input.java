package tn.rnu.isi.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.Toast;

public class input extends AppCompatActivity {
    EditText editText;
    EditText phone;
    EditText pwd;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        editText = (EditText) findViewById(R.id.editTExt);
        phone = (EditText) findViewById(R.id.editPhone);
        pwd = (EditText) findViewById(R.id.editTPassword);
        gestureDetector = new GestureDetector(this, new GestureListener());
        pwd.setOnTouchListener((v, event)->{
            return gestureDetector.onTouchEvent(event);
        });
    }

    public void getContent() {
        String msg = "";
        msg = editText.getText().toString() + "\nPhone: " + phone.getText().toString() + "\n Password: " + pwd.getText().toString();
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onDoubleTap(MotionEvent e) {
            // Action on double-tap
            getContent();
            return true; // Indicate that the event was handled
        }
    }
}