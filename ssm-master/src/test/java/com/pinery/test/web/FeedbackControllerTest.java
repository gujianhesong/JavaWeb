package com.pinery.test.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * 
 * @author Kemin
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class FeedbackControllerTest extends AbstractContextControllerTests {

	private MockMvc mockMvc;
	private String listUrl = "/feedback/list";
	private String insertUrl = "/feedback/add";
	private long bookId = 1000;

	@Before
	public void setup() {
		this.mockMvc = webAppContextSetup(this.wac).alwaysExpect(status().isOk()).alwaysDo(print()).build();
	}

	@Test
	public void list() throws Exception {
		this.mockMvc.perform(get(listUrl))
				.andExpect(status().isOk())    //返回的状态是200
				.andDo(print())         //打印出请求和相应的内容
				.andReturn().getResponse().getContentAsString();
	}

	@Test
	public void insert() throws Exception {
		String appPackage = "com.test.test";
		String content = "测试数据";
		String createTime = String.valueOf(System.currentTimeMillis());

		this.mockMvc.perform(post(insertUrl)
				.contentType(MediaType.APPLICATION_JSON)
				.param("appPackage", appPackage)
				.param("content", content)
				.param("createTime", createTime))
				.andExpect(status().isOk())
				.andDo(print());

	}

}
