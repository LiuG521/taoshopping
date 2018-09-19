package com.cssl.util;


import java.util.Timer;
import java.util.TimerTask;

public class verificationCode {

	public static Integer vCode;

	public static Integer i=0;


	public static void setvCode(Integer vCode) {
		verificationCode.vCode = vCode;
	}

	static {
		vCode = (int)((Math.random()*9+1)*100000);
//		//记时器
//		Timer timer = new Timer();
//		// 第一次试探timer的使用
//		timer.schedule(new TimerTask() { //要做的事情,在规则里面进行声明
//			@Override
//			public void run() {
//				System.out.println(++i);
//				if(i==61){
//					verificationCode.setvCode(01210121);
//					System.out.println(verificationCode.vCode);
//					timer.cancel();
//				}
//			}
//		}, 1000, 1000); //十秒 (第二个参数表示10秒表示之后每隔2秒bombing依次)
	}
}
