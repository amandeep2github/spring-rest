package learn.spring.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import learn.spring.rest.entity.Festival;

@RestController
@RequestMapping("/festival")
public class FestivalController {
	@RequestMapping("/populate")
	public Festival getFestival(@RequestParam String name){
		Festival festival = new Festival();
		festival.setName(name);
		return festival;
	}
}


