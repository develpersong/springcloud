package com.geostar.elasticsearch.dao;

import com.geostar.elasticsearch.entity.DlGhslFk;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @description: 电力过户受理反馈
 * @author: songwen
 * @date: 2021-12-03 17:16
 */
public interface DlghslFkRepository extends ElasticsearchRepository<DlGhslFk,String> {
}
