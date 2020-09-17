package day2_2;

public class Main {
	public static void Person(String name) {
		System.out.println("名字:"+name);
	}
	public static void Person(String name,int age) {
		System.out.println("名字:"+name+"  年龄："+age);
	}
	public static void Person(String name,int age,String gender) {
		System.out.println("名字:"+name+"  年龄："+age+"  性别："+gender);
	}
	public static void main(String[] args) {
		Person  person=new Person();
		person.setName("凌");
		person .setAge(20);
		person .setGender("男");
		Person(person.getName());
		Person(person.getName(),person.getAge());
		Person(person.getName(),person.getAge(),person.getGender());
	}

}
