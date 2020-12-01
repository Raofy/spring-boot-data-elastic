package com.ryan.springbootdataelastic.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.net.ServerSocket;

/**
 * test_content索引表结构
 */
@Setter
@Getter
@Document(indexName = "my_test_content")
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
    @Field(type = FieldType.Text)
    private String appName;

    /**
     * 上线时间
     */
    @Field(type = FieldType.Date)
    private String displayTime;

    /**
     * 开发环境
     */
    @Field(type = FieldType.Text)
    private String env;

    /**
     * 来源id
     */
    @Field(type = FieldType.Text)
    private String sourceId;

    /**
     * 来源类型
     */
    @Field(type = FieldType.Text)
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
    @Field(type = FieldType.Integer)
    private Integer dayTotal;

    /**
     * 周总数
     */
    @Field(type = FieldType.Integer)
    private Integer weekTotal;

    /**
     * 月总数
     */
    @Field(type = FieldType.Integer)
    private Integer monthTotal;

    /**
     * 完成度
     */
    @Field(type = FieldType.Text)
    private String percent;

    /**
     * 分享量
     */
    @Field(type = FieldType.Integer)
    private Integer shareTotal;

    /**
     * 评论量
     */
    @Field(type = FieldType.Integer)
    private Integer commentTotal;

    /**
     * 点赞量
     */
    @Field(type = FieldType.Integer)
    private Integer good;

    /**
     * 收藏量
     */
    @Field(type = FieldType.Integer)
    private Integer favTotal;

    /**
     * 热度
     */
    @Field(type = FieldType.Double)
    private Double heat;

    /**
     * 付费
     */
    @Field(type = FieldType.Text)
    private String contentType;

    /**
     * 跳转连接
     */
    private String link;

}
