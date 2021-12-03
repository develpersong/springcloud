package com.geostar.elasticsearch;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.geostar.elasticsearch.dao.DlghslFkRepository;
import com.geostar.elasticsearch.entity.DlGhslFk;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 电力过户受理反馈测试
 * @author: songwen
 * @date: 2021-12-03 17:17
 */
@SpringBootTest
public class DlghslFkTest {

    @Autowired
    private DlghslFkRepository dlghslFkRepository;

    @Test
    void testAdd(){
        DlGhslFk dlGhslFk = new DlGhslFk();
        dlGhslFk.setYwh("111111");
        dlGhslFk.setAppDate(LocalDateTime.now());
        dlghslFkRepository.save(dlGhslFk);
    }

    @Test
    void findAll(){
        List<DlGhslFk> dlGhslFkList = Lists.newArrayList(dlghslFkRepository.findAll());
        System.out.println(JSONArray.toJSONString(dlGhslFkList));
    }

    @Test
    void testDel(){
        dlghslFkRepository.deleteAll();
    }
}
