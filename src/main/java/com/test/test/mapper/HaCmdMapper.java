package com.test.test.mapper;

import com.test.test.pojo.HaCmd;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface HaCmdMapper {
    List<HaCmd> HaCmdList(@Param("pageSize") int pageSize,@Param("pageNo") int pageNo);

    int queryHaCmdCount();
}
