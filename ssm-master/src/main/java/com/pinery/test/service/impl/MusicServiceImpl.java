package com.pinery.test.service.impl;

import com.pinery.test.dao.MusicDao;
import com.pinery.test.entity.Music;
import com.pinery.test.service.MusicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MusicDao musicDao;

    public List<Music> queryAll() {
        return musicDao.queryAll();
    }

}
