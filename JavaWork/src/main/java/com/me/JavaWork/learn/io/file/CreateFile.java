package com.me.JavaWork.learn.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
	public static void main(String[] args) {
		File f = new File("E:/filetest/a.200.238.248.txt");
		try {
			f.mkdirs(); // 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
			f.createNewFile(); // 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
			System.out.println("该分区大小" + f.getTotalSpace() / (1024 * 1024 * 1024) + "G"); // 返回由此抽象路径名表示的文件或目录的名称。

			// f.delete(); // 删除此抽象路径名表示的文件或目录
			System.out.println("文件名  " + f.getName()); // 返回由此抽象路径名表示的文件或目录的名称。
			System.out.println("文件父目录字符串 " + f.getParent());// 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回
															// null。

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			PrintWriter printWriter = new PrintWriter(new File("D:/myfile.txt"));
			printWriter.println("java创建文件");
			printWriter.flush();
			printWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
