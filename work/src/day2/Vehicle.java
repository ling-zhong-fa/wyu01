package day2;
//1）定义一个交通工具Vehicle类，类中包含：
//属性：速度(speed)、体积(size)
//方法：加速speedUp(), 减速speedDown()，方法中控制台输出字符串“加速”/“减速”即可
//2）编写测试类Main, main方法中实例化Vehicle对象，为所有属性赋值并输出，最后调用加速，减速方法。

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
		System.out.println("加速");
		
	}
	public  void speedDown() {
		System.out.println("减速");
		
	}
}
