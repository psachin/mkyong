package com.mkyong.chkbutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

	private CheckBox chkIOS, chkAndroid, chkWindows, chkLinux;
	private Button btnDone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addListenerOnIOS();
		addListnerOnButton();
	}

	

	private void addListnerOnButton() {
		chkAndroid = (CheckBox) findViewById(R.id.checkAndroid);
		chkIOS = (CheckBox) findViewById(R.id.checkIOS);
		chkWindows = (CheckBox) findViewById(R.id.checkWindows);
		chkLinux = (CheckBox) findViewById(R.id.checkLinux);
		btnDone = (Button) findViewById(R.id.btnDone);
		
		// run when button 'Done' is clicked
		btnDone.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// create string buffer variable
				StringBuffer result = new StringBuffer();
				
				result.append("Android selected: ").append(chkAndroid.isChecked());
				result.append("\nIOS selected: ").append(chkIOS.isChecked());
				result.append("\nWindows selected: ").append(chkWindows.isChecked());
				result.append("\nLinux selected: ").append(chkLinux.isChecked());
				
				Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
				
			}
		});		
		
	}



	private void addListenerOnIOS() {
		chkIOS = (CheckBox) findViewById(R.id.checkIOS);
		
		chkIOS.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// is IOS checked ??
				if (((CheckBox) v).isChecked()) {
					Toast.makeText(MainActivity.this, "Bro, try Android", Toast.LENGTH_SHORT).show();
				}
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
