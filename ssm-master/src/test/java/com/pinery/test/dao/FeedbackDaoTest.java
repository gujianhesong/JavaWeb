package com.pinery.test.dao;

import com.pinery.test.BaseTest;
import com.pinery.test.entity.Feedback;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FeedbackDaoTest extends BaseTest {

    @Autowired
    FeedbackDao feedbackDao;

    @Test
    public void testQueryAll() throws Exception{
        List<Feedback> list =  feedbackDao.queryAll();
        System.out.println("反馈数" + list.size());
    }

    @Test
    public void testInsert() throws Exception{
        Feedback feedback = new Feedback();
        feedback.setAppPackage("com.test.test");
        feedback.setContent("测试数据");
        feedback.setCreateTime(System.currentTimeMillis());

        int id = feedbackDao.insert(feedback);
        System.out.println("插入id : " + id);
    }

}
