package main;

import java.io.File;
import java.util.Iterator;

public class FileIterator implements Iterator<File> {
	private File[] archivos;
	private int actualIndex;
	public FileIterator(File dir) {
		if(dir.isDirectory()) {
			archivos=dir.listFiles();
		}else {
			archivos=new File[0];
		}
		actualIndex=0;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		boolean actual=actualIndex<archivos.length;
		return actual;
	}
	@Override
	public File next() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			File nextFile=archivos[actualIndex];
			actualIndex++;
			return nextFile;
		}
		return null;
	}
	
}
