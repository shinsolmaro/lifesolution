package kr.co.lifesolution.spend.service;

import java.util.Map;

import kr.co.lifesolution.repository.domain.SpendPageVO;
public interface SpendService {
	public Map<String, Object> list(SpendPageVO page);
}
