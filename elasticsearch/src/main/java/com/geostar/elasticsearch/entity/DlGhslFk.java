package com.geostar.elasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @description: 电力过户受理反馈
 * @author: songwen
 * @date: 2021-12-03 16:59
 */
@Document(indexName = "dlghslfk")
@Data
public class DlGhslFk {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 业务号
     */
    private String ywh;

    /**
     * 用户编号（电表号）
     */
    private String consNo;

    /**
     * 不动产单元号
     */
    private String eleNo;

    /**
     * 行政区划代码（6位）
     */
    private String xzqhNo;

    /**
     * 过户完成标识
     */
    private String flag;

    /**
     * 失败信息
     */
    private String errorMsg;

    /**
     * 完成时间
     */
    @Field(type = FieldType.Date, format = DateFormat.date_hour_minute_second)
    private LocalDateTime appDate;
}
