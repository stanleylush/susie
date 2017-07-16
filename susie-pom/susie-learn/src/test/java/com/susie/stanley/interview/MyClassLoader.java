package com.susie.stanley.interview;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {
	
	private String myLibPath;
	
	public MyClassLoader(String path){
		this.myLibPath = path;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		
		String fileName = getFileName(name);
		File file = new File(this.myLibPath, fileName);
		
		try {
			FileInputStream is = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int len = 0;
			try {
				while((len = is.read()) != -1){
					bos.write(len);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			byte[] data = bos.toByteArray();
			is.close();
			bos.close();
			
			return super.defineClass(name, data, 0, data.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.findClass(name);
	}
	
	private String getFileName(String name){
		int i = name.lastIndexOf(".");
		if(i==-1){
			return name+".class";
		}
		return name.substring(i)+".class";
	}

}
