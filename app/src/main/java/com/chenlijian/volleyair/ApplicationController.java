package com.chenlijian.volleyair;

public class ApplicationController extends com.android.volley.base.ApplicationController {


	private NetworkModule networkModule;

	@Override
	public void onCreate() {
		super.onCreate();
	}

	public NetworkModule getNetworkModule() {
		if (networkModule == null) {
			networkModule = new NetworkModule(this);
		}
		return networkModule;
	}

}