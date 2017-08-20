package cn.itheima.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//代表SpringBoot应用的运行主类
@SpringBootApplication(scanBasePackages="cn.itheima.springboot")
public class Application {

	public static void main(String[] args) {
		//方式一
		//SpringApplication.run(Application.class, args);
		
		//方式二
		SpringApplication springApplication = new SpringApplication(Application.class);
		//取消SoringBoot的Banner横幅
		springApplication.setBannerMode(Mode.OFF);
		springApplication.run(args);
	}

}
