package com.soecode.lyf.dao;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Artist;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArtistDaoTest extends BaseTest {

    @Autowired
    ArtistDao artistDao;

    @Test
    public void testQueryAll() throws Exception{
        List<Artist> list =  artistDao.queryAll();
        System.out.println("歌手数" + list.size());
    }

}
