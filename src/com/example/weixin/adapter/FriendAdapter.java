package com.example.weixin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import cache.loader.ImageWorker;

import com.example.weixin.R;
import com.example.weixin.R.layout;
import com.example.weixin.bean.Friend;

public class FriendAdapter extends BaseAdapter {
	private Context context;
	private Friend friend;

	public FriendAdapter(Context context, Friend friend) {
		super();
		this.context = context;
		this.friend = friend;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return friend.getData().size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View v, ViewGroup arg2) {
		// TODO Auto-generated method stub
		Viewhonlde h = null;
		if (v == null) {
			v = LayoutInflater.from(context).inflate(R.layout.list_item, null);
			h = new Viewhonlde();
			h.image_user = (ImageView) v.findViewById(R.id.image_user);
			h.image_content = (ImageView) v.findViewById(R.id.image_content);
			h.text_tv1 = (TextView) v.findViewById(R.id.text_username);
			h.text_tv2 = (TextView) v.findViewById(R.id.text_content);
			h.text_tv3 = (TextView) v.findViewById(R.id.text_time);
			v.setTag(h);
		} else {
			h = (Viewhonlde) v.getTag();
		}
		ImageWorker.getImage(context, friend.getData().get(arg0).getAuthor()
				.getAvatar(), h.image_user, R.drawable.ic_launcher);
		h.text_tv1
				.setText(friend.getData().get(arg0).getAuthor().getUsername());
		h.text_tv2.setText(friend.getData().get(arg0).getContent());
		// ImageWorker.getImage(context,
		// friend.getData().get(arg0).getAttachments().get(arg0).getUrl(),
		// h.image_content, R.drawable.ic_launcher);
		h.text_tv3.setText(friend.getData().get(arg0).getCreated_at());
		return v;
	}

	public class Viewhonlde {
		ImageView image_user, image_content;
		TextView text_tv1, text_tv2, text_tv3;
	}
}
