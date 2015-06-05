package com.segalaj.cordova.wifidirect;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class WifiDirect extends CordovaPlugin {
	
    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getStatus")) {
            callbackContext.success("getStatusAnswer");

            return true;

        } else {
            
            return false;

        }
    }
}
