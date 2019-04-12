package pl.piotrdawidziuk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParamDemoController {
	
	//https://www.baeldung.com/spring-request-param
	
//	@GetMapping("/api/foos")
//	@ResponseBody
//	public String getFoos(@RequestParam String id) {
//	    return "ID: " + id;
//	}
	
//	@GetMapping("/api/foos")
//	@ResponseBody
//	public String getFoos(@RequestParam(required = false) String id) { 
//	    
//		String idParam = id;
//		if(idParam == null) {
//			idParam = "Cannot find Id";
//		}
//		
//		return "ID: " + idParam;
//	}
	
	@GetMapping("/api/foos")
	@ResponseBody
	public String getFoos(@RequestParam(defaultValue = "test") String id) {
	    return "ID: " + id;
	}
	

}
