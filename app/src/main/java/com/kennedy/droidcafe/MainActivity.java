package com.kennedy.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
      String mOrderMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//display a Toast whenever this method is called
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    //shows a message that the donut image is clicked
    public void showDonutOrder(View view){
        mOrderMessage=getString(R.string.donut_order_message);
        displayToast(mOrderMessage);
    }
    //show a message that the ice cream sandwich image is clicked
    public void showIceCreamOrder(View view){
        mOrderMessage=getString(R.string.ice_cream_order_message);
        displayToast(mOrderMessage);
    }
    public void showFroyoOrder(View view){
        mOrderMessage=getString(R.string.froyo_order_message);
        displayToast(mOrderMessage);
    }
    //Show message using SnackBar at the bottom of the screen if clicked
    public void startOrder(View view){
        Intent intent = new Intent(MainActivity.this,OrderActivity.class);
        //Sending Data to the next activity
        intent.putExtra("KEY_VALUE",mOrderMessage);
        startActivity(intent);
    }
}