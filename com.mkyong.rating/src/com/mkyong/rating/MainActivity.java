package com.mkyong.rating;

import com.mkyong.rating.R.string;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	// declare vars
	private RatingBar ratingBar;
	private TextView value;
	private Button btnRate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// add listener to rating bar
		addListenerOnRatingBar();
		// add listener in button
		addListenerOnRateButton();
	}

	private void addListenerOnRateButton() {
		ratingBar = (RatingBar) findViewById(R.id.ratingBar);
		btnRate = (Button) findViewById(R.id.btnRate);
		
		btnRate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Toast.makeText(MainActivity.this, 
						String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();
			}
		});
	}

	
	// if rating has changed, then display in TextView automatically
	private void addListenerOnRatingBar() {
		ratingBar = (RatingBar) findViewById(R.id.ratingBar);
		value = (TextView) findViewById(R.id.value);
		
		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) { // rating ??, fromUser ??
				value.setText(String.valueOf(rating)); 
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
