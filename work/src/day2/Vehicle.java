package day2;
//1������һ����ͨ����Vehicle�࣬���а�����
//���ԣ��ٶ�(speed)�����(size)
//����������speedUp(), ����speedDown()�������п���̨����ַ��������١�/�����١�����
//2����д������Main, main������ʵ����Vehicle����Ϊ�������Ը�ֵ������������ü��٣����ٷ�����

public class Vehicle {
	private float speed;
	private float size;
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", size=" + size + "]";
	}
	public  void speedUp() {
		System.out.println("����");
		
	}
	public  void speedDown() {
		System.out.println("����");
		
	}
}
