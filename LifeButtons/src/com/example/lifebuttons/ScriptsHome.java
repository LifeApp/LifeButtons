package com.example.lifebuttons;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ScriptsHome extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scripts_home);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		Button greet = (Button) findViewById(R.id.greetings_button);
		greet.setOnClickListener(this);
		
		Button depart = (Button) findViewById(R.id.departures_button);
		depart.setOnClickListener(this);
		
		Button disagree = (Button) findViewById(R.id.disagreements_button);
		disagree.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scripts_home, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			Intent goHome = new Intent(this,MainMenu.class);
			NavUtils.navigateUpTo(this,goHome);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}	

	@Override
	public void onClick(View v) 
	{
		switch(v.getId())
		{
		case R.id.greetings_button:
			Intent goToGreetingsHome = new Intent(this,GreetingsMenu.class);
			startActivity(goToGreetingsHome);
		case R.id.departures_button:
			Intent goToDeparturesHome = new Intent(this,DeparturesMenu.class);
			startActivity(goToDeparturesHome);	
		case R.id.disagreements_button:
			Intent goToDisagreementsHome = new Intent(this,DisagreementsMenu.class);
			startActivity(goToDisagreementsHome);	
		
		}
	
		
	}

}
