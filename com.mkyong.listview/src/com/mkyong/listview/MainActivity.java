package com.mkyong.listview;
import com.mkyong.listview.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.provider.Settings.System;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

		
	static final String[] FRUITS = new String[] { "Apple", "Avocado", "Banana",
		"Blueberry", "Coconut", "Durian", "Guava", "Kiwifruit",
		"Jackfruit", "Mango", "Olive", "Pear", "Sugar-apple" };
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		// no more this
		// setContentView(R.layout.list_fruit);	
		
		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_fruit, FRUITS));
		 
		ListView listView = getListView();
		listView.setTextFilterEnabled(false);
		
		listView.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// when clicked, show a toast with test view
				Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
				
			}
		});
	}
	
}
