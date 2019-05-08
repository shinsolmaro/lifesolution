package kr.co.lifesolution.repository.mapper;

import java.util.List;
import java.util.Map;

import kr.co.lifesolution.repository.domain.SpendCodeVO;
import kr.co.lifesolution.repository.domain.SpendPageVO;
import kr.co.lifesolution.repository.domain.SpendVO;

public interface SpendMapper {
	public Map<String, Object> list(SpendPageVO page);
	public List<SpendVO> selectSpend(SpendPageVO page);
	public int selectSpendCount();
	public List<SpendCodeVO> selectSpendCode();
}
