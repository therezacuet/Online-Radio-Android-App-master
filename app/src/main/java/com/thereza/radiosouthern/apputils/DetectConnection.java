package com.thereza.radiosouthern.apputils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class DetectConnection {             
	  public static boolean checkInternetConnection(Context context) {   

	    ConnectivityManager con_manager = (ConnectivityManager) 
	      context.getSystemService(Context.CONNECTIVITY_SERVICE);

		  return con_manager.getActiveNetworkInfo() != null
				  && con_manager.getActiveNetworkInfo().isAvailable()
				  && con_manager.getActiveNetworkInfo().isConnected();
	  }
	}