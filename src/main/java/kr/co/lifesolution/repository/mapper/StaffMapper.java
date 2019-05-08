package kr.co.lifesolution.repository.mapper;

import java.util.List;

import kr.co.lifesolution.repository.domain.Staff;

public interface StaffMapper {
    List<Staff> selectStaff();
}
