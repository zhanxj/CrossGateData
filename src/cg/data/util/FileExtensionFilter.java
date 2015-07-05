package cg.data.util;

import java.io.File;
import java.io.FileFilter;

public class FileExtensionFilter implements FileFilter {
	private String[] extension;
	private boolean allowDir;
	
	/**
	 * @param ext example:new String[]{"pip","cts"}
	 * @param allowDir
	 */
	public FileExtensionFilter(String[] ext, boolean allowDir) {
		extension = ext;
		this.allowDir = allowDir;
	}
	
	public boolean accept(File pathname) {
		if(pathname.isHidden()){
			return false;
		}
		if (pathname.isDirectory() && !pathname.getName().toUpperCase().equals("CVS") && !pathname.getName().startsWith(".")) {
			return allowDir;
		}
		for (int i = 0; i < extension.length; i++) {
			if (pathname.getName().toLowerCase().endsWith("." + extension[i])) {
				return true;
			}
		}
		return false;
	}	
}
