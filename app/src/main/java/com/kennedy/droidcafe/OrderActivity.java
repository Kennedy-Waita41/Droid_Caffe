package com.kennedy.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        //receive the data?Message coming in from the MainActivity
        Intent intent =getIntent();
        String message = "Order:"+ intent.getStringExtra("KEY_VALUE");
        TextView textView = findViewById(R.id.order_textview);
        textView.setText(message);
    }
    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();

    }

    public void onRadioButtonClicked(View view) {
        //Is the button Checked
        boolean checked =((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.sameday:
                if (checked)
                    displayToast(getString(R.string.same_day_messenger_service));
                break;
            case R.id.nextday:
                if (checked)
                    displayToast(getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup:
                if (checked)
                    displayToast(getString(R.string.pick_up));
                break;
            default:
                //Do nothing
                break;

        }
    }

    public void OrderDetailsActivity(View view) {
       Intent intent = new Intent(OrderActivity.this,OrderDetailsActivity.class);
       startActivity(intent);
    }
}