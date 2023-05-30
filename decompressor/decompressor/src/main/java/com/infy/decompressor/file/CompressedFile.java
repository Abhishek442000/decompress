package com.infy.decompressor.file;

//import java.io.File;
//
//import java.io.FileOutputStream;
//import java.io.OutputStream;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class CompressedFile {
//	static String FILEPATH = "src/main/resources/file.txt" ;
//	static File file = new File(FILEPATH) ;
//	public static void bytetoFile(byte[] jsonData) {
//		try {
//			OutputStream os = new FileOutputStream(file) ;
//			os.write(jsonData) ;
//			os.close() ;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
import java.io.FileOutputStream;
import java.io.IOException;

public class CompressedFile {
  public static void bytetoFile(byte[] data, String filePath) {
      try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
          fos.write(data);
          System.out.println("Data appended to file: " + filePath);
      } catch (IOException e) {
          System.out.println("Error writing data to file: " + e.getMessage());
      }
  }
}
