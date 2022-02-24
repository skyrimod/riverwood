package com.skyrimod.riverwood.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.skyrimod.riverwood.model.SqlInfo;
import com.skyrimod.riverwood.request.TestJsonRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/json")
public class TestJsonController {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Map<String, String> testJson(@RequestBody TestJsonRequest request){
        HashMap<String, String> map = new HashMap();
        map.put("message","success");
        map.put("name", request.getInspectName());
        map.put("CnName", request.getInspectCnName());
        map.put("team", request.getOwnerTeam());

        String content = request.getInspectContent();
        JSONObject jsonObject = new JSONObject();
        SqlInfo sqlInfo = JSONUtil.toBean(content, SqlInfo.class);
        map.put("sqlInfo", sqlInfo.toString());
        return map;
    }
}
