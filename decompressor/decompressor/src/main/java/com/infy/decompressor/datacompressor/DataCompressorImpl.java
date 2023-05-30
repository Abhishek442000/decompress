package com.infy.decompressor.datacompressor;

import org.springframework.stereotype.Service;

import org.xerial.snappy.Snappy;

import com.infy.decompressor.dataconverter.DataConverter;



@Service
public class DataCompressorImpl<T> implements DataCompressor<T> {
		
	private final DataConverter<T> dataConverter ;
	
	public DataCompressorImpl(DataConverter<T> dataConverter) {
		this.dataConverter = dataConverter ; 
	}
	
	public DataCompressorImpl() {
		this.dataConverter = null ;
	}
	
	@Override
	public byte[] compress(Object object) throws Exception {
		
		byte[] jsonData = dataConverter.javaObjectToJson(object).getBytes() ;
		return Snappy.compress(jsonData);
		
	}
	
	@Override
	public T decompress(byte[] compressedData ) throws Exception {
		
		byte[] decompressedData = Snappy.uncompress(compressedData) ;
		String jsonData = new String(decompressedData) ;		
		return dataConverter.jsonToJavaObject(jsonData) ;
		
	}
}
