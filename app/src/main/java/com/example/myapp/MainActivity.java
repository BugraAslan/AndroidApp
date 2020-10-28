package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Skeleton of an Android Things activity.
 * <p>
 * Android Things peripheral APIs are accessible through the PeripheralManager
 * For example, the snippet below will open a GPIO pin and set it to HIGH:
 * <p>
 * PeripheralManager manager = PeripheralManager.getInstance();
 * try {
 * Gpio gpio = manager.openGpio("BCM6");
 * gpio.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW);
 * gpio.setValue(true);
 * } catch (IOException e) {
 * Log.e(TAG, "Unable to access GPIO");
 * }
 * <p>
 * You can find additional examples on GitHub: https://github.com/androidthings
 */
public class MainActivity extends AppCompatActivity {

    protected TextView showMessage;

    protected EditText textInput;

    protected Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.showMessage = (TextView) findViewById(R.id.messageView);
        this.textInput = (EditText) findViewById(R.id.editText);
        this.sendButton = (Button) findViewById(R.id.sendButton);
    }

    public void sendMessageAction(View view) {
        /*
        if (messageView.getVisibility() == View.INVISIBLE){
            messageView.setVisibility(View.VISIBLE);
            messageView.setText(editText.getText().toString());
        }*/

        this.showMessage.setText(this.textInput.getText().toString());
        //this.showMessage.setVisibility(View.VISIBLE);


        //startActivity(new Intent());
        /*Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);*/
    }
}