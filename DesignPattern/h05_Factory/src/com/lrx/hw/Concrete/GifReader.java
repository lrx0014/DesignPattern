package com.lrx.hw.Concrete;

import com.lrx.hw.Interface.ImageReader;

public class GifReader implements ImageReader {
	@Override
	public void read(){
		System.out.println("Using Gif Reader...");
	}
}
