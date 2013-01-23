package com.obriand.android_projecttemplate.dependency;

import com.obriand.android_projecttemplate.config.ConfigurationManager;

import android.content.Context;

/**
 * Interface defining a Dependency Resolver. The Dependency Resolver is responsible of making
 * application-wide objects (typically singleton) available to the whole application. Such objects
 * can be accessed through the methods defined in this interface.
 * 
 * @author Olivier Briand
 * 
 */
public interface DependencyResolver {

	/**
	 * Return the Application {@link Context} for the application.
	 */
	public Context getApplicationContext();

	/**
	 * Return the {@link ProjectData} instance used by the application to manage the access to the
	 * ProjectData API as well as to request it using a {@link ProjectDataRequestor}.
	 */
	//public ProjectData getProjectData();
	
	/**
	 * Create a new videos fetcher using the current ProjectData object and returns it.
	 */
	//public AsyncDataObjectsFetcher createDataObjectsFetcher();
	
	/**
	 * Return the Configuration Manager used to store the application settings
	 */
	public ConfigurationManager getConfiguration();

}
