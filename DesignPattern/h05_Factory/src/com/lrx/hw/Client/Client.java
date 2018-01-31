package com.lrx.hw.Client;

import com.lrx.hw.Interface.ImageReader;
import com.lrx.hw.Interface.ImageReaderFactory;
import com.lrx.hw.UtilXML.XMLUtil;

public class Client {
	public static void main(String[] args){
		ImageReaderFactory imageReaderFactory;
		ImageReader imageReader;
		imageReaderFactory = (ImageReaderFactory)XMLUtil.getBean();
		imageReader = imageReaderFactory.getReader();
		imageReader.read();
	}
}
