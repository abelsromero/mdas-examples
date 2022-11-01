package mdas.docker.demoboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

	@GetMapping(value = {"/hello/{username}"})
	public Message hello(@PathVariable(required = false) String username) {
		return new Message(sayHello(username));
	}

	private String sayHello(String username) {
		return String.format("Hello %s!", username);
	}

	record Message(String text) { }
}
