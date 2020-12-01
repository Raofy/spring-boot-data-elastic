package com.ryan.springbootdataelastic;

import com.ryan.springbootdataelastic.dao.TestContentRepository;
import com.ryan.springbootdataelastic.entity.TestContent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDataElasticApplicationTests {

    @Autowired
    private TestContentRepository repository;

    @Test
    void contextLoads() {
        TestContent testContent = new TestContent();
        testContent.setAppName("app名字");
        testContent.setEnv("jin10");
        testContent.setDisplayTime("2020-10-13 20:40:32");
        testContent.setSourceId("65656");
        testContent.setSourceType("news");
        testContent.setTitle("测试标题");
        testContent.setTotal(290);
        testContent.setDayTotal(205);
        testContent.setWeekTotal(304);
        testContent.setMonthTotal(398);
        testContent.setContentType("免费");
        repository.save(testContent);
        Iterable<TestContent> all = repository.findAll();
        all.forEach(System.out::println);
    }

}
