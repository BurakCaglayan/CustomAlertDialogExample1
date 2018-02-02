package com.ctis487.customalertdialogexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClik(View v){
    	LayoutInflater layoutInflator = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    	View mCustomView = layoutInflator.inflate(R.layout.custom_alert, null);
    	
		AlertDialog.Builder myDialogBox = new AlertDialog.Builder(this);

		// set message, title, and icon
		myDialogBox.setTitle("Custom AlertDialog");
		myDialogBox.setIcon(R.drawable.ic_launcher);

		// Set three option buttons
		myDialogBox.setPositiveButton("Close",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						// whatever should be done when answering "YES" goes
						// here

					}
				});
		
		Button btndilogOk = (Button) mCustomView.findViewById(R.id.btnDailogOk);
		tv = (TextView) mCustomView.findViewById(R.id.tvMes);
		btndilogOk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tv.setText("Button Clicked");
				
			}
		});

		myDialogBox.setView(mCustomView);
		myDialogBox.show();
	}
}
