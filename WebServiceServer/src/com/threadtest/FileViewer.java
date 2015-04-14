package com.threadtest;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;



public class FileViewer{

	File myDir;

	File[] contents;

	Vector vectorList;

	public Vector getVectorList() {
		return vectorList;
	}

	public void setVectorList(Vector vectorList) {
		this.vectorList = vectorList;
	}

	Iterator currentFileView;

	File currentFile;

	String path;

	public FileViewer() {
		path = new String("");
		vectorList = new Vector();
	}

	public FileViewer(String path) {
		this.path = path;
		vectorList = new Vector();
	}

	public File getCurrentFile() {
		return currentFile;
	}

	/**
	 * 设置浏览的路径
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/***************************************************************************
	 * 返回当前目录路径
	 */
	public String getDirectory() {
		return myDir.getPath();
	}

	/**
	 * 刷新列表
	 */
	public void refreshList() {
		if (this.path.equals(""))
			path = "C:\\Users\\chenjinjin\\Desktop\\temp\\error\\";
		myDir = new File(path);

		vectorList.clear();
		contents = myDir.listFiles();
		System.out.println("length"+contents.length);
		// 重新装入路径下文件
		for (int i = 0; i < contents.length; i++) {
			vectorList.add(contents[i]);
		}
		currentFileView = vectorList.iterator();
	}

	/**
	 * 移动当前文件集合的指针指到下一个条目
	 * 
	 * @return 成功返回true,否则false
	 */
	public boolean nextFile() {
		//while (currentFileView.hasNext()) {
		if(currentFileView.hasNext())
			{
		while (true) {
			currentFile = (File) currentFileView.next();
			if(currentFile!=null)
			    return true;
			else
				return false;
		}
			}
		return false;
	}

	/**
	 * 返回当前指向的文件对象的文件名称
	 */
	public String getFileName() {
		return currentFile.getName();
	}

	/**
	 * 返回当前指向的文件对象的文件尺寸
	 */
	public String getFileSize() {
		return new Long(currentFile.length()).toString();
	}

	/**
	 * 返回当前指向的文件对象的最后修改日期
	 */
	public String getFileTimeStamp() {
		return new Date(currentFile.lastModified()).toString();
	}

	/**
	 * 返回当前指向的文件对象是否是一个文件目录
	 */
	public boolean getFileType() {
		return currentFile.isDirectory();
	}
}