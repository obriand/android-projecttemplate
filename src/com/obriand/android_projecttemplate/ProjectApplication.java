package com.obriand.android_projecttemplate;

import com.obriand.android_projecttemplate.dependency.DependencyResolverImpl;

import android.app.Application;

/**
 * Extension of the default Android {@link Application} class to allow the initialization of the
 * Dependency Resolver before the rest of the application is set up.
 * 
 * @author Olivier Briand
 * 
 */
public class ProjectApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Simple initialization of the Dependency Resolver.
		DependencyResolverImpl.initialize(getApplicationContext());

		// Configure global component once and for all.
		setupGlobalComponent();
	}

	private void setupGlobalComponent() {
		// Set here your global component init methods over all the application 
	}
}
