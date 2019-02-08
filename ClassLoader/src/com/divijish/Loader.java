package com.divijish;

import java.util.List;
import java.util.logging.Logger;

public class Loader {

	public static void main(String[] args) {

		//ApplicationLoader
		System.out.println(":: Our "+Loader.class.getName()+" is load by"+Loader.class.getClassLoader());
		List a = null;
	
		//ExtensionLoader 
	System.out.println(":: Our "+Hello.class+" is loaded by "+Hello.class.getClassLoader());
			//BootstrapLoader
		System.out.println(":: Our "+List.class+" is loaded by "+List.class.getClassLoader());
		
	}

}
