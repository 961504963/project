package com.test.test.service.impl;

import com.test.test.mapper.HaCmdMapper;
import com.test.test.pojo.HaCmd;
import com.test.test.service.HaCmdService;
import com.test.test.util.JqueryTable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HaCmdServiceImpl implements HaCmdService {

    @Resource
    private HaCmdMapper haCmdMapper;


    @Override
    public JqueryTable HaCmdList(int draw, int pageSize,int pageNo) {
        JqueryTable table = new JqueryTable();
        table.setDraw(draw);
        table.setRecordsTotal(haCmdMapper.queryHaCmdCount());
        table.setRecordsFiltered(table.getRecordsTotal());
        table.setData(haCmdMapper.HaCmdList(pageSize,pageNo));
        return table;
    }
}
