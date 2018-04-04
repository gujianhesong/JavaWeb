package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.MusicDao;
import com.soecode.lyf.entity.Music;
import com.soecode.lyf.service.AlbumService;
import com.soecode.lyf.service.MusicService;
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
