package com.pinery.test.web;

import com.pinery.test.dto.Result;
import com.pinery.test.entity.Feedback;
import com.pinery.test.service.FeedbackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/feedback")
public class FeedbackCotroller {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FeedbackService service;

    @RequestMapping("/list")
    @ResponseBody
    private Map<String, Object> list() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        List<Feedback> list = service.queryAll();
        map.put("data", list);
        map.put("status", 1);
        map.put("msg", "success");
        return map;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"})
    @ResponseBody
    private Result<Feedback> add(@RequestParam("appPackage") String appPackage, @RequestParam("content") String content, @RequestParam("createTime") Long createTime) {
        if (appPackage == null || appPackage.equals("") || content == null || content.equals("") || createTime == null) {
            return new Result<Feedback>(false, "数据字段不能为空");
        }

        try {
            Feedback feedback = new Feedback();
            feedback.setAppPackage(appPackage);
            feedback.setContent(content);
            feedback.setCreateTime(createTime);

            int id = service.insert(feedback);
            if(id >= 0){
                return new Result<Feedback>(true, "插入成功");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result<Feedback>(false, "插入失败, " + e.getMessage());
        }
        return new Result<Feedback>(false, "插入失败");
    }
}
