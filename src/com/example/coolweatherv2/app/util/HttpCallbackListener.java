package com.example.coolweatherv2.app.util;

public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e);
}
