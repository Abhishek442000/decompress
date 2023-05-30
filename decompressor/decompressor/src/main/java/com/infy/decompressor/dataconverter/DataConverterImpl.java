package com.infy.decompressor.dataconverter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DataConverterImpl<T> implements DataConverter<T>  {
	
	private static ObjectMapper objectMapper = new ObjectMapper() ;
	
	private final Class<T> entityClass ; 
	
		
		public DataConverterImpl( Class<T> entityClass) {
			this.entityClass = entityClass ;
		}
		public DataConverterImpl() {
			this.entityClass = null ;
		}
	

	@Override
	public T jsonToJavaObject(String jsonData) throws Exception{
		return objectMapper.readValue(jsonData, entityClass ) ;	
	}
	
	@Override
	public String javaObjectToJson(Object object) throws Exception{
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/check.json"), object);
		return objectMapper.writeValueAsString(object) ;
	}
	




	@Override
	public T[] jsonArrayToJavaArray(String jsonArrayData) throws Exception {
	    return (T[]) objectMapper.readValue(jsonArrayData, entityClass.arrayType());
	}

}
