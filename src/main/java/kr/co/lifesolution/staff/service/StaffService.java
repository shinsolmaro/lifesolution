package kr.co.lifesolution.staff.service;

import java.util.Map;
public interface StaffService {
	/*
	public List<Comment> commentList(int no);

	public void write(Board board);
	
	public Board updateForm(int no);
	
	public void update(Board board);
	
	public void delete(int no);
	
	public Board detail(int no);
	
	 */
	public Map<String,Object> list() throws Exception;
}
