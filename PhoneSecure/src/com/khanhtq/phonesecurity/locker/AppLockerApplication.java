package com.khanhtq.phonesecurity.locker;

import gueei.binding.Binder;
import android.app.Application;

public class AppLockerApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Binder.init(this);
	}
}
