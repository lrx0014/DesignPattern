package com.lrx.hw.Concrete;

import com.lrx.hw.Interface.ImageReader;
import com.lrx.hw.Interface.ImageReaderFactory;

public class GifReaderFactory implements ImageReaderFactory {
	@Override
	public ImageReader getReader(){
		return new GifReader();
	}
}
