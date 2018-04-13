package com.pinery.test.dao;

import com.pinery.test.BaseTest;
import com.pinery.test.entity.Music;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MusicDaoTest extends BaseTest {

    @Autowired
    MusicDao musicDao;

    @Test
    public void testQueryAll() throws Exception{
        List<Music> list =  musicDao.queryAll();
        System.out.println("歌曲数" + list.size());
    }

}
