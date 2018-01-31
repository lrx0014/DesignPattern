package com.library.lrx.controller;

import java.io.*;
import java.util.ArrayList;

public class DataControl implements IController {

	private ArrayList<String> al = new ArrayList<String>();
	File f = new File("C:\\Users\\lrx00\\Desktop\\ttt.txt");

	@Override
	public void Operate() throws IOException {
		// TODO Auto-generated method stub
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while (s != null) {
				al.add(s);
				s = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void WriteBack()
	{
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(f));
			for(String s:al){
	            bw.write(s);
	            System.out.println(s);
	            bw.newLine();
	        }
	        bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void InsertBook(String Info)
	{
		String id = Info.split(",")[0];
		int i = 0;
		if(al!=null)
		{
			for(String s:al){
				if(s.split(",")[0].equals(id)){
					al.remove(i);
					break;
				}
				i++;
			}
		}
		
		al.add(Info);
		WriteBack();
	}
	
	public void deleteBook(String id)
	{
		System.out.println("Delete: " + id + "\n");
		int i = 0;
		if(al!=null)
		{
			for(String s:al){
				if(s.split(",")[0].equals(id)){
					al.remove(i);
					break;
				}
				i++;
			}
		}
		WriteBack();
	}
	
	public String Search(String keyword)
	{
		System.out.println("Search for: " + keyword + "\n");
		int i = 0;
		if(al!=null)
		{
			for(String s:al){
				String[] ss = s.split(",");
				if(ss[1].equals(keyword) || ss[2].equals(keyword)){
					return ("图书编号: "+ss[0] + "\n图书名称: "+ss[1] + "\n作者: "+ss[2] + "\n图书类型: "+ss[3]);
				}
				i++;
			}
		}
		return "没有符合条件的图书！";
	}
	
	public ArrayList<String> View()
	{
		return al;
	}

}
