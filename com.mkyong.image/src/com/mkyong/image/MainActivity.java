package com.mkyong.image;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button button;
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addListenerOnButton();
	}

	private void addListenerOnButton() {
		
		// display image
		image = (ImageView) findViewById(R.id.imageView1);
		
		// display button
		button = (Button) findViewById(R.id.button1);
		
		// set on click event
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// Toast.makeText(MainActivity.this, "IMAGE", Toast.LENGTH_SHORT).show();
				image.setImageResource(R.drawable.ic_launcher);
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
