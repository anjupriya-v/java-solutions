import java.io.*;
import java.util.*;
class File_det{
	public static void main(String args[]){
		String fileName;
		String filePath;
		int _in;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the File Name With File Extension");
		fileName=sc.nextLine();
		File f=new File(fileName);
		filePath=f.getAbsolutePath();
		System.out.println("File Exists :"+f.exists());
		System.out.println("File Readable :"+f.canRead());
		System.out.println("File Writable :"+f.canWrite());
		System.out.println("File Extension :"+extension(filePath));
		System.out.println("File Length :"+f.length());
	}
	public static String extension(String filePath){
		int ext=filePath.lastIndexOf(".");
		return filePath.substring(ext+1);
	}
}
