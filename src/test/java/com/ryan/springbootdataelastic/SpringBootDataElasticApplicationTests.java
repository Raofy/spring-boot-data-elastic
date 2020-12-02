package com.ryan.springbootdataelastic;

import com.ryan.springbootdataelastic.dao.InfoRepository;
import com.ryan.springbootdataelastic.dao.TestContentRepository;
import com.ryan.springbootdataelastic.entity.TestContent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.Date;

@SpringBootTest
class SpringBootDataElasticApplicationTests {

    @Autowired
    private TestContentRepository repository;

    @Autowired
    private InfoRepository infoRepository;

    @Test
    void contextLoads() {
//        TestContent testContent = new TestContent();
//        testContent.setId(1);
//        testContent.setAppName("app名字");
//        testContent.setEnv("jin10");
//        testContent.setDisplayTime("2020-10-13 20:40:32");
//        testContent.setSourceId("65656");
//        testContent.setSourceType("news");
//        testContent.setTitle("测试标题");
//        testContent.setTotal(290);
//        testContent.setDayTotal(205);
//        testContent.setWeekTotal(304);
//        testContent.setMonthTotal(398);
//        testContent.setContentType("免费");
//        repository.save(testContent);
//        Iterable<TestContent> all = repository.findAll();
//        all.forEach(System.out::println);
    }

    @Test
    void Info() {
        infoRepository.findAll().forEach(System.out::println);
    }

    /**
     * 测试线上的es数据
     */
    @Test
    void testContent(){
        /**
         * 查询所有数据
         */
        //repository.findAll().forEach(System.out::println);

        /**
         * 统计索引表总的数据量
         */
        System.out.println("总的索引记录数：" + repository.count());


    }

    /**
     * 根据字段进行排序
     */
    @Test
    void sort() {
        /**
         * 1. 按照总量total进行倒序返回（单个字段）
         */
//        Sort sort = Sort.by("total").descending();
//        repository.findAll(sort).forEach(System.out::println);

        /**
         * 2. 最新一天并且按照total进行倒序排
         */
        Sort sort1 = Sort.by("display_time").descending().and(Sort.by("total").descending());
        repository.findAll(sort1).forEach(System.out::println);


    }

    /**
     * 条件查询
     */
    void conditionSearch() {

    }

}
