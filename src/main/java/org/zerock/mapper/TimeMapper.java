package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("Select current_date from dual")
	public String getTime();

	
	public String getTime2();
	
}
