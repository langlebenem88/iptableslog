package com.googlecode.networklog;

import android.util.Log;

public class MyLog {
  public static boolean enabled = true;
  public static String tag = "NetworkLog";

  public static void d(String msg) {
    d(tag, msg);
  }

  public static void d(String tag, String msg) {
    if(!enabled) {
      return;
    }

    for(String line : msg.split("\n")) {
      Log.d(tag, line);
    }
  }
}