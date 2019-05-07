package kr.co.lifesolution.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// service 를 해주는 애 ..  mapper와 접근한다.
// db에서 구한 데이터를 controller 에게 넘겨주는 역할.

// bean 으로 등록시키는 어노테이션.
@Service
public class BoardServiceImpl implements BoardService {
	/*
	@Autowired
	private BoardMapper mapper;
	
	public List<Comment> commentList(int no) {
		return mapper.selectCommentByNo(no);
	}

	public void write(Board board) {
		mapper.insertBoard(board);
	}
	
	public Board updateForm(int no) {
		return mapper.selectBoardByNo(no);
	}
	
	public void update(Board board) {
		mapper.updateBoard(board);
	}
	
	public void delete(int no) {
		mapper.deleteBoard(no);
	}
	
	public Board detail(int no) {
		return mapper.selectBoardByNo(no);
	}
	
	public Map<String, Object> list(Page page) {
		Map<String, Object> result = new HashMap<>();
		result.put("list", mapper.selectBoard(page));
		result.put("pageResult", new PageResult(
				page.getPageNo(), mapper.selectBoardCount()
		));
		return result;
	}
	*/
}
