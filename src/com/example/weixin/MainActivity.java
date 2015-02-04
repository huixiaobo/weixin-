package com.example.weixin;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.example.weixin.adapter.FriendAdapter;
import com.example.weixin.bean.Friend;
import com.example.weixin.util.MyJson;

public class MainActivity extends Activity {
   private String path="http://www.yasite.net/rss.php";
   private Context context;
   private ListView list_view;
   private FriendAdapter adapter;
   private  Friend friend;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context =this;
		//init();
		list_view=(ListView) findViewById(R.id.listView1);
		View v=getLayoutInflater().inflate(R.layout.list_hand, null);
		list_view.addHeaderView(v);
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				String result=MyJson.getHttpConnertion(path);
				Friend friend=MyJson.parserJson(result);
				Message msg=handler.obtainMessage(11, friend);
				handler.sendMessage(msg);
			}
		}.start();
		
	}
	
	Handler handler=new Handler(){
		public void handleMessage(android.os.Message msg) {
		super.handleMessage(msg);
		if(msg.what==11){
			friend=(Friend) msg.obj;
			adapter=new FriendAdapter(context, friend);
			list_view.setAdapter(adapter);
		}
		
	  };
	};
	/*private void init() {
		// TODO Auto-generated method stub
		
	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
