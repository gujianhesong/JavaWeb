package com.pinery.test.dao;

import com.pinery.test.BaseTest;
import com.pinery.test.entity.Artist;
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
