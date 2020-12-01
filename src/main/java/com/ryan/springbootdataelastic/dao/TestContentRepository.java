package com.ryan.springbootdataelastic.dao;

import com.ryan.springbootdataelastic.entity.TestContent;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TestContentRepository extends ElasticsearchRepository<TestContent, String> {
}
