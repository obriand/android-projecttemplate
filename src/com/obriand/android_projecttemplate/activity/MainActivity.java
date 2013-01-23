package com.obriand.android_projecttemplate.activity;

import com.obriand.android_projecttemplate.R;
import com.obriand.android_projecttemplate.R.layout;
import com.obriand.android_projecttemplate.R.menu;
import com.obriand.android_projecttemplate.config.ConfigurationManager;
import com.obriand.android_projecttemplate.dependency.DependencyResolver;
import com.obriand.android_projecttemplate.dependency.DependencyResolverImpl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * Main activity displayed to the user once he launches the application. 
 */
public class MainActivity extends Activity {
	
	private static final String LOG_TAG = "MainActivity";
	
	private ConfigurationManager mConfiguration;
	
	/**
	 * ProjectData object used to access remote content and to authenticate against ProjectData
	 * Internet API when the user selects the menu item.
	 */
//	private ProjectData mProjectData;

	private DependencyResolver mResolver;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mResolver = DependencyResolverImpl.getInstance();
//		mDailymotion = mResolver.getDailymotion();
		mConfiguration = mResolver.getConfiguration();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
