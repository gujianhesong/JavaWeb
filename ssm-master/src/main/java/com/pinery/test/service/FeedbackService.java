package com.pinery.test.service;

import com.pinery.test.entity.Feedback;

import java.util.List;

public interface FeedbackService {

    List<Feedback> queryAll();

    int insert(Feedback bean);
}
