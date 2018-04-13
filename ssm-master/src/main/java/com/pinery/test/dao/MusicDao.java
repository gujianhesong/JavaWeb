package com.pinery.test.dao;

import com.pinery.test.entity.Music;

import java.util.List;

public interface MusicDao {

    List<Music> queryAll();

}