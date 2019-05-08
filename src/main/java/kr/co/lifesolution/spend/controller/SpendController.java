package kr.co.lifesolution.spend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.lifesolution.repository.domain.SpendPageVO;
import kr.co.lifesolution.spend.service.SpendService;

// service 와 통신하고 service 가 mapper 와통신한 결과를 받는 역할.
@Controller
@RequestMapping("/spend")
public class SpendController {
	
	// 멤버변수로 BoardService (sevice 역할을 해주는 인터페이스) 선언.
	@Autowired
	private SpendService service;
	
	@RequestMapping("/list.do")
	public void list(SpendPageVO page, Model model) {
		Map<String, Object> result = service.list(page);
		
		model.addAttribute("list", result.get("list"));
		model.addAttribute("pageResult", result.get("pageResult"));
	}
	
}
