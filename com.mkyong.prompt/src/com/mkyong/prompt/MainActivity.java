package com.mkyong.prompt;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	final Context context = this;
	private Button button;
	private EditText result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// component from activity_main.xml
		button = (Button) findViewById(R.id.button);
		result = (EditText) findViewById(R.id.edittext_result);
		
		// add button listener
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				// get prompt.xml view
				LayoutInflater inflate_prompt = LayoutInflater.from(context);
				View view_prompt = inflate_prompt.inflate(R.layout.prompt, null);
				
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
				
				// set prompt.xml to alertdialog builder
				alertDialogBuilder.setView(view_prompt);
				
				System.out.println("edittext_input");
				final EditText userInput = (EditText) view_prompt.findViewById(R.id.edittext_input);
				
				alertDialogBuilder
					.setCancelable(false)
					.setPositiveButton("OK", 
							new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int id) {
									// get user input and set it to result
									// edit text
									result.setText(userInput.getText());
								}
							})
					.setNegativeButton("no", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int id) {
							// TODO Auto-generated method stub
							dialog.cancel();
							
						}
					});		
				
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
				
				
			}

			private View inflate_prompt(int prompt, Object object) {
				// TODO Auto-generated method stub
				return null;
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
