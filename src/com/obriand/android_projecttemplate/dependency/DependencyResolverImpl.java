package com.obriand.android_projecttemplate.dependency;

import java.util.concurrent.Executors;

import com.obriand.android_projecttemplate.config.ConfigurationManager;
import com.obriand.android_projecttemplate.config.Constants;

import android.content.Context;


/**
 * Implementation of {@link DependencyResolver} giving access to singleton and utility objects
 * required by the rest of the application.
 * 
 * @author Olivier Briand
 * 
 */
public class DependencyResolverImpl implements DependencyResolver {

	private static DependencyResolver sInstance;

	/** Application Context */
	private final Context mAppContext;

	/** Global project data object useful to interact with internet web API. */
	//private ProjectData mProjectData;

	/** Configuration Manager */
	private ConfigurationManager mConfigManager;

	/** Cache Updater used to cache locally the playlists and videos */
	//private HeroesCacheUpdater mCacheUpdater;

	public static void initialize(Context appContext) {
		if (sInstance == null) {
			sInstance = new DependencyResolverImpl(appContext);
		}
	}

	public static DependencyResolver getInstance() {
		if (sInstance == null) {
			throw new IllegalStateException(
					"Dependency resolver should be initialized before being accessed");
		}
		return sInstance;
	}

	private DependencyResolverImpl(Context appContext) {
		mAppContext = appContext;
	}

	@Override
	public Context getApplicationContext() {
		return mAppContext;
	}

//	@Override
//	public ProjectData getProjectData() {
//		if (mProjectData == null) {
//			mProjectData = new ProjectData(getApplicationContext(),
//					Executors.newCachedThreadPool(), Constants.PROJECTDATA_CLIENT_ID,
//					Constants.PROJECTDATA_CLIENT_SECRET);
//		}
//		return mProjectData;
//	}

//	@Override
//	public AsyncDataObjectsFetcher createDataObjectsFetcher() {
//		return new AsyncDataObjectsFetcher(mProjectData, getApplicationContext());
//	}


	@Override
	public ConfigurationManager getConfiguration() {
		if (mConfigManager == null) {
			mConfigManager = new ConfigurationManager(getApplicationContext());
		}
		return mConfigManager;
	}

}
