package day3;
//2、使用文件流复制myfile.txt文件为myfile_cp.txt
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
	public static void copyFile(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while ((c = in.read(buffer)) != -1) {
			for (int i = 0; i < c; i++)
				out.write(buffer[i]);
		}
		in.close();
		out.close();
	}
	public static void main(String[] args) throws IOException {
		
		//File f = new File("C:/JMPX");
		//f.mkdirs();//创建文件夹
		//File ff = new File(f,"myfile.txt");
		//ff.createNewFile();//创建文件
		String fileSrc="C:/JMPX/myfile.txt";
		String fileDes="C:/JMPX/myfile_cp.txt";
		copyFile(fileSrc,fileDes);//调用文件复制方法
		System.out.println("C:/JMPX/Copy文件夹文件复制成功");
		}

}
