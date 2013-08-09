package com.mkyong.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DeviceArrayAdapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] values;

	public DeviceArrayAdapter(Context context, String[] values) {
		super(context, R.layout.list_dev, values);
		this.context = context;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.list_dev, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);
 
		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
 
		if (s.equals("Camera")) {
			imageView.setImageResource(R.drawable.camera);
		} else if (s.equals("Computer")) {
			imageView.setImageResource(R.drawable.computer);
		} else if (s.equals("WebCam")) {
			imageView.setImageResource(R.drawable.webcam);
		} else {
			imageView.setImageResource(R.drawable.drive);
		}
 
		return rowView;
	}

}
