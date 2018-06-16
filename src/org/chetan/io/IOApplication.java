package org.chetan.io;

import java.io.File;

public class IOApplication {

	public static void main(String[] args) {
		
		listFilesAndFilesSubDirectories("D:\\myworkspace_csql_merged___wrongupdated");
	}

	private static void listFilesAndFilesSubDirectories(String path) {
		File main = new File(path);
		File[] innerFiles = main.listFiles();
		for (int i = 0; i < innerFiles.length; i++) {
			File innerFile = innerFiles[i];
			if(innerFile.isFile()){
				System.out.println("File Found : "+innerFile.getAbsolutePath());
			}else if(innerFile.isDirectory()){
				System.out.println("Directory Fiound : "+innerFile.getAbsolutePath());
				System.out.println("listing it's files --------------------------------------");
				listFilesAndFilesSubDirectories(innerFile.getAbsolutePath());
			}else{
				System.err.println("File type not found.");
			}
		}
	}
}
