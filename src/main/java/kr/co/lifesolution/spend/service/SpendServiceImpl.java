package kr.co.lifesolution.spend.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.lifesolution.common.page.SpendPageResult;
import kr.co.lifesolution.repository.domain.SpendPageVO;
import kr.co.lifesolution.repository.mapper.SpendMapper;

// service 를 해주는 애 ..  mapper와 접근한다.
// db에서 구한 데이터를 controller 에게 넘겨주는 역할.

// bean 으로 등록시키는 어노테이션.
@Service
public class SpendServiceImpl implements SpendService {
	
	@Autowired
	private SpendMapper mapper;
	
	public Map<String, Object> list(SpendPageVO page) {
		Map<String, Object> result = new HashMap<>();
		result.put("list", mapper.selectSpend(page));
		result.put("SpendpageResult", new SpendPageResult(
				page.getPageNo(), mapper.selectSpendCount()
		));
		result.put("code", mapper.selectSpendCode());
		return result;
	};

	
}
