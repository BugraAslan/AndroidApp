package com.example.myapp;

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

    protected Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.showMessage = (TextView) findViewById(R.id.messageView);
        this.textInput = (EditText) findViewById(R.id.editText);
        this.showButton = (Button) findViewById(R.id.showButton);
    }

    public void showMessageAction(View view) {
        String textInputValue = this.textInput.getText().toString();
        if (textInputValue.trim().isEmpty()){
            textInputValue = "Bir şey yazmadınki gardaşım!";
        }

        this.showMessage.setText(textInputValue);

        if (this.showMessage.getVisibility() == View.INVISIBLE){
            this.showMessage.setVisibility(View.VISIBLE);
        }
    }

    public void clearMessage(View view) {
        this.textInput.setText(null);
        this.showMessage.setText(null);

        if (this.showMessage.getVisibility() == View.VISIBLE){
            this.showMessage.setVisibility(View.INVISIBLE);
        }
    }
}