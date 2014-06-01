package org.example.androidsdk.demo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View layout = findViewById(R.id.layout);
		Drawable background = layout.getBackground();
		background.setAlpha(120);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void openActivityTwo(View v)
	{
		Intent intent = new Intent(this, DetailActivity.class);
		startActivity(intent);
	}


}
