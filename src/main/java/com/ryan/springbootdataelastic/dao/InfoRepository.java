package com.ryan.springbootdataelastic.dao;

import com.ryan.springbootdataelastic.entity.Info;
import com.ryan.springbootdataelastic.entity.TestContent;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends ElasticsearchRepository<Info, String> {
}
