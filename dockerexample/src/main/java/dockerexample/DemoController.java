package dockerexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@RequestMapping("/hello")
	public String hello(@RequestParam String name)
	{
		return "Demo in "+name;
	}
	
	@CrossOrigin
	@RequestMapping(name="/greeting", method=RequestMethod.GET,produces="application/json")
	public @ResponseBody Greeting sayHello(@RequestParam String param)
	{
		return new Greeting("Hello  "+param);
	}
	
}
