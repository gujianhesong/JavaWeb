package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.ArtistDao;
import com.soecode.lyf.entity.Artist;
import com.soecode.lyf.service.ArtistService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ArtistDao artistDao;

    public List<Artist> queryAll() {
        return artistDao.queryAll();
    }

}
