package com.mkyong.customdialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	final Context context = this;
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button) findViewById(R.id.btn_showdialog);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				// Toast.makeText(MainActivity.this, "show tho", Toast.LENGTH_SHORT).show();
				// custom dialog
				final Dialog dialog = new Dialog(context);
				dialog.setContentView(R.layout.custom);
				dialog.setTitle("Hoo YAA");
				
				// set the custom dialog component
				// text, image and button
				TextView text = (TextView) findViewById(R.id.textView1);
				// text.setText("");
				ImageView image = (ImageView) findViewById(R.id.imageView1);
				// image.setImageResource(R.drawable.ic_launcher);
				
				Button button_ok = (Button) dialog.findViewById(R.id.btn_ok);
				// if OK button is clicked, close the dialog box
				button_ok.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						dialog.dismiss();
					}
				});
				
				dialog.show();
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
