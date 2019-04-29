package kt2.kt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//(4)Ühendate selle Spring Boot'ga,
//ehk päringu seest saate teksti teete analüüsi ja tagastate väärtuse.

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
