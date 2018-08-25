package com.ren;

import java.util.Random;
import java.util.UUID;

public class JniNative {
	static{
		System.loadLibrary("Jni_01");
	}
	
	public int age = 10;
	
	public static int salary = 10000;
	
	public String name ="renzhenming";
	
	public Boss boss = new Boss();
	
	public native static String getStringFromC();
	//调用Java方法
	public native void getJavaMethod();
	//调用Java静态方法
	public native void getJavaStaticMethod();
	//修改java成员变量属性
	public native void modifyJavaField();
	//修改Java成员的静态属性
	public native void modifyJavaStaticField();
	//访问构造方法
	public native void callConstructorMethod();
	//调用父类方法
	public native void accessNonVirtualMethod();
	//解决乱码问题
	public native String toChineesString();
	//在c中对数组排序
	public native void sortArrayInC(int []array);
	//获取一个c中的数组
	public native int[] getArrayFromC();
	//捕获c代码异常信息
	public native void catchException();
	///////////////////////////////////////////////
	//产生指定范围的随机数
    public int genRandomInt(int max){
        System.out.println("genRandomInt 执行了...");
        return new Random().nextInt(max);
    }
    
    //产生UUID字符串
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

}