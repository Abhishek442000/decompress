package com.infy.decompressor.dataconverter;

public interface DataConverter<T> {
	
	T jsonToJavaObject(String jsonData ) throws Exception;
	T[] jsonArrayToJavaArray(String jsonArrayData) throws Exception;

	String javaObjectToJson(Object t1) throws Exception ;
}
