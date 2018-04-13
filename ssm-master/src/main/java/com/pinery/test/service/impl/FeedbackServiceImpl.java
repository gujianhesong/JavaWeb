package com.pinery.test.service.impl;

import com.pinery.test.dao.FeedbackDao;
import com.pinery.test.service.FeedbackService;
import com.pinery.test.entity.Feedback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private FeedbackDao feedbackDao;

    public List<Feedback> queryAll() {
        return feedbackDao.queryAll();
    }

    public int insert(Feedback bean) {
        return feedbackDao.insert(bean);
    }
}
