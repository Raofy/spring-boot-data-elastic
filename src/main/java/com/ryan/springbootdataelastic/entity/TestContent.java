package com.ryan.springbootdataelastic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.net.ServerSocket;
import java.util.Date;

/**
 * test_content索引表结构
 */
@Setter
@Getter
@Document(indexName = "test_content_total")
@ToString
public class TestContent implements Serializable {


    /**
     *         "app_name": "jin10",
     *         "display_time": "2020-10-13 20:40:32",
     *         "env": "rel",
     *         "percent": "72.74%",
     *         "source_id": "65656",
     *         "source_type": "news",
     *         "title": "白银日内留意上升楔形 阴跌颓势能否逆转？",
     *         "total": 200
     *         "day_total": 205,
     *         "week_total": 204,
     *         "month_total": 206,
     *         "content_type":"免费"
     *
     */

    @Id
    private String id;
    /**
     * appName
     */
    @Field(type = FieldType.Text, name = "app_name")
    private String appName;

    /**
     * 上线时间
     */
    @Field(name = "display_time", type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss")
    private String displayTime;

    /**
     * 开发环境
     */
    @Field(type = FieldType.Text)
    private String env;

    /**
     * 来源id
     */
    @Field(name = "source_id", type = FieldType.Text)
    private String sourceId;

    /**
     * 来源类型
     */
    @Field(name = "source_type", type = FieldType.Text)
    private String sourceType;

    /**
     * 标题
     */
    @Field(type = FieldType.Text)
    private String title;

    /**
     * 总量
     */
    @Field(type = FieldType.Integer)
    private Integer total;

    /**
     * 天总数
     */
    @Field(name = "day_total", type = FieldType.Integer)
    private Integer dayTotal;

    /**
     * 周总数
     */
    @Field(name = "week_total", type = FieldType.Integer)
    private Integer weekTotal;

    /**
     * 月总数
     */
    @Field(name = "month_total", type = FieldType.Integer)
    private Integer monthTotal;

    /**
     * 完成度
     */
    @Field(type = FieldType.Text)
    private String percent;

    /**
     * 分享量
     */
    @Field(name = "share_total", type = FieldType.Integer)
    private Integer shareTotal;

    /**
     * 评论量
     */
    @Field(name = "comment_total", type = FieldType.Integer)
    private Integer commentTotal;

    /**
     * 点赞量
     */
    @Field(type = FieldType.Integer)
    private Integer good;

    /**
     * 收藏量
     */
    @Field(name = "fav_total", type = FieldType.Integer)
    private Integer favTotal;

    /**
     * 热度
     */
    @Field(type = FieldType.Double)
    private Double heat;

    /**
     * 付费
     */
    @Field(name = "content_type", type = FieldType.Text)
    private String contentType;



}
