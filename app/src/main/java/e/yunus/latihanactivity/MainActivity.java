package e.yunus.latihanactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getName();

    public static final String EXTRA_MESSAGE =
             "e.yunus.latihanactivity.extra.MESSAGE";

    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText =(EditText) findViewById(R.id.editText_Main);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "button clicked");

        Intent intent =new Intent(this, secondActivity.class);
        String message = mMessageEditText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

   }
