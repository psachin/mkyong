package com.mkyong.android;

import android.app.Activity;
import android.os.Bundle;

public class Main2 extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// show main.s.xml layout when this activity is called
		setContentView(R.layout.main2);
	}
}
