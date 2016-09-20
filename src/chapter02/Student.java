package chapter02;

public class Student extends Person {
	public Student() {
		age = 40; // 부모의 디폴트 접근자는 접근 가능 (단, 같은 패키지에서만)		
		name = "배승진"; // protected 는 자식에서 접근 가능( 다른 패키지에서도 가능)
		// height = 172; //private 는 접근 불가
		weight = 75; //public은 접근 가능
	}
}
