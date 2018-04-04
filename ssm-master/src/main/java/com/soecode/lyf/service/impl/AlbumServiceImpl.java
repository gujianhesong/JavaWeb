package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.AlbumDao;
import com.soecode.lyf.entity.Album;
import com.soecode.lyf.service.AlbumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AlbumDao albumDao;

    public List<Album> queryAll() {
        return albumDao.queryAll();
    }

}
