package codes.eduardoargueta.WieDErgabeliste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WieDErgabelisteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WieDErgabelisteApplication.class, args);
	}

	@GetMapping("/hallo")
	public String hallo(@RequestParam(value = "name") String name){
		return String.format("Hallo %s", name);
	}

}
