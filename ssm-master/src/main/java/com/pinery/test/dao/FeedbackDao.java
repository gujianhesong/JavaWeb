package com.pinery.test.dao;

import com.pinery.test.entity.Feedback;

import java.util.List;

public interface FeedbackDao {

    List<Feedback> queryAll();

    int insert(Feedback bean);

}
