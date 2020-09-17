package day3;
//ʹ�û���������myfile.txt�ļ�Ϊmyfile_cp2.txt
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFileDemo3 {
	public static void main(String[] args) throws IOException {
		String fileSrc = "C:/JMPX/myfile.txt";
		String fileDes = "C:/JMPX/myfile_cp.txt2";
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel in = null;
		FileChannel out = null;
		try {
			fi = new FileInputStream(fileSrc);
			fo = new FileOutputStream(fileDes);
			in = fi.getChannel();// �õ���Ӧ���ļ�ͨ��
			out = fo.getChannel();// �õ���Ӧ���ļ�ͨ��
			in.transferTo(0, in.size(), out);// ��������ͨ�����Ҵ�inͨ����ȡ��Ȼ��д��outͨ��
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				in.close();
				fo.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("C:/JMPX/Copy�ļ����ļ����Ƴɹ�");
	}
}
