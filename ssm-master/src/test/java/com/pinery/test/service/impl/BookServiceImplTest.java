package com.pinery.test.service.impl;

import static org.junit.Assert.fail;

import com.pinery.test.dto.AppointExecution;
import com.pinery.test.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pinery.test.BaseTest;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}

}
