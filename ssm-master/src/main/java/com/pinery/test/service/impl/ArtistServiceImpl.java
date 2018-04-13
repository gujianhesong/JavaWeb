package com.pinery.test.service.impl;

import com.pinery.test.dao.ArtistDao;
import com.pinery.test.entity.Artist;
import com.pinery.test.service.ArtistService;
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
