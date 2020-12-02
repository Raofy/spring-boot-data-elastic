package com.ryan.springbootdataelastic.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Document(indexName = "info")
public class Info implements Serializable {

    @Id
    private String id;

    @Field(type = FieldType.Long)
    private long sid;

    @Field(type = FieldType.Text)
    private String name;
}
