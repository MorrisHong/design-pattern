package kr.gracelove.designpattern;

import kr.gracelove.designpattern.facade.Facade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		//퍼사드
		//한번만 호출하지만 내부동작에 의해 FacadeSub.. 들의 프로세스가 모두 동작한다.
		Facade facade = new Facade();
		facade.process();
	}

}
