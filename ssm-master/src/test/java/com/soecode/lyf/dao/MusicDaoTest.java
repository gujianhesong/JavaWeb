package com.soecode.lyf.dao;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.entity.Artist;
import com.soecode.lyf.entity.Music;
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
