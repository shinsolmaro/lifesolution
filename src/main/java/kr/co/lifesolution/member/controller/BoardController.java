package kr.co.lifesolution.member.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

// service 와 통신하고 service 가 mapper 와통신한 결과를 받는 역할.
@Controller
@RequestMapping("/board")
public class BoardController {
	/*
	// 멤버변수로 BoardService (sevice 역할을 해주는 인터페이스) 선언.
	@Autowired
	private BoardService service;

	@RequestMapping("/comment-list.json")
	@ResponseBody
	public List<Comment> commentList(int no) {
		return service.commentList(no);
	}

	// void 일 때 :  /jsp   +  /board/writeForm  +  .jsp
	@RequestMapping("/writeForm.do")
	public void writeForm() {}
	
	@RequestMapping("/write.do")
	public String write(Board board) {
		service.write(board);
		return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "list.do";
	}
	
	@RequestMapping("/updateForm.do")
	public void updateForm(int no, Model model) {
		model.addAttribute("board", service.updateForm(no));
	}
	
	@RequestMapping("/update.do")
	public String update(Board board) {
		service.update(board);
		return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "list.do";
	}
	
	@RequestMapping("/delete.do")
	public String delete(int no) {
		service.delete(no);
		return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "list.do";
	}
	
	@RequestMapping("/detail.do")
	public void detail(int no, Model model) {
		model.addAttribute("board", service.detail(no));
	}
	
	@RequestMapping("/list.do")
	public void list(Page page, Model model) {
		Map<String, Object> result = service.list(page);
		
		model.addAttribute("list", result.get("list"));
		model.addAttribute("pageResult", result.get("pageResult"));
	}
	*/
}
