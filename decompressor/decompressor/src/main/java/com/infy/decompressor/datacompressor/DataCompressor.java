package com.infy.decompressor.datacompressor;

public interface DataCompressor<T> {
	byte[] compress(Object t) throws Exception ;
	T decompress(byte[] compressedData) throws Exception ;
}

