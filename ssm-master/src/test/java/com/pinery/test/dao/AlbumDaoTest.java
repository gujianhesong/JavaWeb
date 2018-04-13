package com.pinery.test.dao;

import com.pinery.test.BaseTest;
import com.pinery.test.entity.Album;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AlbumDaoTest extends BaseTest {

    @Autowired
    private AlbumDao albumDao;

    @Test
    public void testQueryAll(){
        List<Album> list = albumDao.queryAll();
        System.out.println("专辑数：" + list.size());
    }
}
