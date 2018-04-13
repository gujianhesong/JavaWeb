package com.pinery.test.web;

import com.pinery.test.entity.Album;
import com.pinery.test.service.AlbumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/album")
public class AlbumCotroller {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AlbumService service;

    @RequestMapping("/list")
    @ResponseBody
    private Map<String, Object> list(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        List<Album> list = service.queryAll();
        map.put("data", list);
        map.put("status", 1);
        map.put("msg", "success");
        return map;
    }
}
