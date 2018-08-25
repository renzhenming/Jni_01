package com.ren;


import java.util.Random;


public class JNI_main {

	public static void main(String[] args) {
		JniNative jNative = new JniNative();
		//String fromC = JniNative.getStringFromC();
		//System.out.println(fromC);				
		//jNative.getJavaMethod();		
		//jNative.getJavaStaticMethod();
		//System.out.println(jNative.age+"");
		//System.out.println(jNative.name);
		//jNative.modifyJavaField();
		//System.out.println(jNative.age+"");
		//System.out.println(jNative.name);
		//jNative.callConstructorMethod();
		//System.out.println(jNative.salary+"");
		//jNative.modifyJavaStaticField();
		//System.out.println(jNative.salary+"");
		//jNative.accessNonVirtualMethod();
		//System.out.println(jNative.toChineesString());
		//int arr [] = {12,3,43,55,44,1,566};
		//jNative.sortArrayInC(arr);
        //for(int i = 0 ; i < arr.length;i++ ) {
        //    System.out.println(arr[i]); 
        //}
		
		//int arr[] = jNative.getArrayFromC();
		//for(int i = 0 ; i < arr.length;i++ ) {
	    //   System.out.println(arr[i]); 
	    //}
		try {
			jNative.catchException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
