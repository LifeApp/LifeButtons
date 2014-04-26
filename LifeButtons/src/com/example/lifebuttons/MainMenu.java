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
		
		Button scriptsMenu = (Button) findViewById(R.id.scripts_button);
		scriptsMenu.setOnClickListener(this);
		
		Button timeManagement = (Button) findViewById(R.id.time_mgmt_button);
		timeManagement.setOnClickListener(this);
		
		Button relationshipMaintenance = (Button) findViewById(R.id.relationship_maint_button);
		relationshipMaintenance.setOnClickListener(this);
		
		Button hygiene = (Button) findViewById(R.id.hygiene_button);
		hygiene.setOnClickListener(this);
		
		Button emergency = (Button) findViewById(R.id.emergency_info_button);
		emergency.setOnClickListener(this);
				
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
			startActivity(goToScripts);
			break;
		case R.id.time_mgmt_button:
			Intent goToTimeManagement = new Intent(this,TimeManagement.class);
			startActivity(goToTimeManagement);
			break;
		case R.id.relationship_maint_button:
			Intent goToRelationshipMaint = new Intent(this,RelationshipMaintenance.class);
			startActivity(goToRelationshipMaint);
			break;
		case R.id.hygiene_button:
			Intent goToHygiene = new Intent(this,HygieneMenu.class);
			startActivity(goToHygiene);
			break;
		case R.id.emergency_info_button:
			Intent goToEmergency = new Intent(this,EmergencyInfo.class);
			startActivity(goToEmergency);
			break;
		default:
			Intent goToScriptsTwo = new Intent(this,ScriptsHome.class);
			goToScriptsTwo.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(goToScriptsTwo);
			break;
		
		}
	
		
	}

}
