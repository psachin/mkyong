package com.mkyong.spinner;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Spinner spinCountries, spinList;
	private Button btnSubmit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addItemOnSpinList();
		addListnerOnButtonSubmit();
		addListenerOnSpinnerItemSelection();
	}

	private void addListenerOnSpinnerItemSelection() {
		spinList = (Spinner) findViewById(R.id.spin_list);
		spinList.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		
	}

	private void addListnerOnButtonSubmit() {
		
		spinList = (Spinner) findViewById(R.id.spin_list);
		spinCountries = (Spinner) findViewById(R.id.spin_countries);
		btnSubmit = (Button) findViewById(R.id.btn_submit);
		
		btnSubmit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// show toast
				Toast.makeText(MainActivity.this,
						"OnClickListener : " + 
				                "\nItem list : "+ String.valueOf(spinList.getSelectedItem()) + 
				                "\nCountry list : "+ String.valueOf(spinCountries.getSelectedItem()),
				                Toast.LENGTH_SHORT).show();
			}
		});
	}

	private void addItemOnSpinList() {
		
		spinList = (Spinner) findViewById(R.id.spin_list);
		
		List<String> list = new ArrayList<String>();
		list.add("list 1");
		list.add("list 2");
		list.add("list 3");
		list.add("list 4");
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_spinner_item, list);		
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinList.setAdapter(dataAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
