package com.lrx.hw.Concrete;

import com.lrx.hw.Interface.ImageReader;
import com.lrx.hw.Interface.ImageReaderFactory;

public class JpgReaderFactory implements ImageReaderFactory {
	@Override
	public ImageReader getReader(){
		return new JpgReader();
	}
}
