package day2_2;

public class Main {
	public static void Person(String name) {
		System.out.println("����:"+name);
	}
	public static void Person(String name,int age) {
		System.out.println("����:"+name+"  ���䣺"+age);
	}
	public static void Person(String name,int age,String gender) {
		System.out.println("����:"+name+"  ���䣺"+age+"  �Ա�"+gender);
	}
	public static void main(String[] args) {
		Person  person=new Person();
		person.setName("��");
		person .setAge(20);
		person .setGender("��");
		Person(person.getName());
		Person(person.getName(),person.getAge());
		Person(person.getName(),person.getAge(),person.getGender());
	}

}
