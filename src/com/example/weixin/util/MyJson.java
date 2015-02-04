package com.example.weixin.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.util.Log;

import com.example.weixin.bean.Friend;
import com.google.gson.Gson;

public class MyJson {
	public static Friend parserJson(String result) {
		Gson g = new Gson();
		Friend friend = g.fromJson(result, Friend.class);
		Log.e("-----", friend.getData().size()+"");
		Log.e("------", friend.toString());
		return friend;
	}

	public static String getHttpConnertion(String path) {
		InputStream inStream = null;
		try {
			HttpURLConnection conn = (HttpURLConnection) new URL(path)
					.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			conn.setRequestMethod("GET");
			if (conn.getResponseCode() == 200) {
				inStream = conn.getInputStream();
				Log.e("-------", conn.getResponseMessage());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inStreamTool(inStream);
	}

	public static String inStreamTool(InputStream inStream) {
		StringBuffer buffer = new StringBuffer();
		byte[] b = new byte[1024];
		int len = 0;
		try {
			while ((len = inStream.read(b)) != -1) {
				buffer.append(new String(b, 0, len));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buffer.toString();
	}
}
