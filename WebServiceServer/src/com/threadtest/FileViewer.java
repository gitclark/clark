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
	 * ���������·��
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/***************************************************************************
	 * ���ص�ǰĿ¼·��
	 */
	public String getDirectory() {
		return myDir.getPath();
	}

	/**
	 * ˢ���б�
	 */
	public void refreshList() {
		if (this.path.equals(""))
			path = "C:\\Users\\chenjinjin\\Desktop\\temp\\error\\";
		myDir = new File(path);

		vectorList.clear();
		contents = myDir.listFiles();
		System.out.println("length"+contents.length);
		// ����װ��·�����ļ�
		for (int i = 0; i < contents.length; i++) {
			vectorList.add(contents[i]);
		}
		currentFileView = vectorList.iterator();
	}

	/**
	 * �ƶ���ǰ�ļ����ϵ�ָ��ָ����һ����Ŀ
	 * 
	 * @return �ɹ�����true,����false
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
	 * ���ص�ǰָ����ļ�������ļ�����
	 */
	public String getFileName() {
		return currentFile.getName();
	}

	/**
	 * ���ص�ǰָ����ļ�������ļ��ߴ�
	 */
	public String getFileSize() {
		return new Long(currentFile.length()).toString();
	}

	/**
	 * ���ص�ǰָ����ļ����������޸�����
	 */
	public String getFileTimeStamp() {
		return new Date(currentFile.lastModified()).toString();
	}

	/**
	 * ���ص�ǰָ����ļ������Ƿ���һ���ļ�Ŀ¼
	 */
	public boolean getFileType() {
		return currentFile.isDirectory();
	}
}