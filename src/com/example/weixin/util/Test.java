package com.example.weixin.util;

import android.test.AndroidTestCase;

public class Test extends AndroidTestCase{

	public void test(){
		String str = MyJson.getHttpConnertion("http://www.yasite.net/rss.php");
		System.out.println("``````"+str);
	}
}
