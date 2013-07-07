package com.mkyong.edittext;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText edittext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addKeyListner();
	}

	private void addKeyListner() {
		// get edittext component
		edittext = (EditText) findViewById(R.id.editText1);
		
		edittext.setOnKeyListener(new OnKeyListener() {
		// add keylistener to keep track of user input
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if ((event.getAction() == KeyEvent.ACTION_DOWN)
						&& (keyCode == KeyEvent.KEYCODE_ENTER)) {
			 
						// display a floating message
						Toast.makeText(MainActivity.this,
							edittext.getText(), Toast.LENGTH_LONG).show();
						return true;
			 
					} else if ((event.getAction() == KeyEvent.ACTION_DOWN)
						&& (keyCode == KeyEvent.KEYCODE_9)) {
			 
						// display a floating message
						Toast.makeText(MainActivity.this,
							"Number 9 is pressed!", Toast.LENGTH_LONG).show();
						return true;
					}
				
				return false;
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
