package day3;
//2��ʹ���ļ�������myfile.txt�ļ�Ϊmyfile_cp.txt
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
		//f.mkdirs();//�����ļ���
		//File ff = new File(f,"myfile.txt");
		//ff.createNewFile();//�����ļ�
		String fileSrc="C:/JMPX/myfile.txt";
		String fileDes="C:/JMPX/myfile_cp.txt";
		copyFile(fileSrc,fileDes);//�����ļ����Ʒ���
		System.out.println("C:/JMPX/Copy�ļ����ļ����Ƴɹ�");
		}

}
