package com.mkyong.android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button next_button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// this is the main/first activity
		setContentView(R.layout.activity_main); // show activity_main.xml when this activity is called
		
		// call button method
		addlistenerOnButton();
	}

	private void addlistenerOnButton() {
		final Context context = this; // create new context, don't know yet
		next_button = (Button) findViewById(R.id.button1); // create button and add reference to R.id.buttonq
		
		next_button.setOnClickListener(new OnClickListener() {
			// what to do at button click is defined here
			public void onClick(View arg0) {// default method
				// call another class file 'Main2'
				// we use intent to go from onr screen to another
				Intent intent_next_screen = new Intent(context, Main2.class);
				// start actual activity. I android every screen is an activity
				startActivity(intent_next_screen);
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
