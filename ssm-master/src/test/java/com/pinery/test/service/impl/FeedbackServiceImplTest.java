package com.pinery.test.service.impl;

import com.pinery.test.service.FeedbackService;
import com.pinery.test.BaseTest;
import com.pinery.test.entity.Feedback;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FeedbackServiceImplTest extends BaseTest {

	@Autowired
	private FeedbackService feedbackService;

	@Test
	public void testQueryAll() throws Exception {
		List<Feedback> list = feedbackService.queryAll();
		System.out.println(list.size());
	}

	@Test
	public void testInsert() throws Exception {
		Feedback feedback = new Feedback();
		feedback.setAppPackage("com.test.test");
		feedback.setContent("测试数据");
		feedback.setCreateTime(System.currentTimeMillis());

		int id = feedbackService.insert(feedback);

		System.out.println("插入id : " + id);
	}

}
