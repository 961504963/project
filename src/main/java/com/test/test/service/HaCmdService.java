package com.test.test.service;

import com.test.test.pojo.HaCmd;
import com.test.test.util.JqueryTable;

import java.util.List;


public interface HaCmdService {
    JqueryTable HaCmdList(int draw,int pageSize,int pageNo);
}
