package com.example.lifebuttons;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ScriptsHome extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scripts_home);
		
		Button greet = (Button) findViewById(R.id.greetings_button);
		greet.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scripts_home, menu);
		return true;
	}

	@Override
	public void onClick(View v) 
	{
		switch(v.getId())
		{
		case R.id.greetings_button:
			Intent goToGreetingsHome = new Intent(this,GreetingsMenu.class);
			startActivity(goToGreetingsHome);
		
		}
	
		
	}

}
