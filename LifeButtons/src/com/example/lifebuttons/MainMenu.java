package com.example.lifebuttons;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainMenu extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		

		
		Button timeManagement = (Button) findViewById(R.id.time_mgmt_button);
		timeManagement.setOnClickListener(this);
		Button scriptsMenu = (Button) findViewById(R.id.scripts_button);
		scriptsMenu.setOnClickListener(this);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public void onClick(View v) 
	{
		switch(v.getId())
		{
		case R.id.scripts_button:
			Intent goToScripts = new Intent(this,ScriptsHome.class);
			goToScripts.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(goToScripts);
			break;
		case R.id.time_mgmt_button:
			Intent goToTimeManagement = new Intent(this,TimeManagement.class);
			goToTimeManagement.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(goToTimeManagement);
			break;
		default:
			Intent goToScriptsTwo = new Intent(this,ScriptsHome.class);
			goToScriptsTwo.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(goToScriptsTwo);
			break;
		
		}
	
		
	}

}
