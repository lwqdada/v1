package com.hzxy.show.web.api;

import com.hzxy.domain.entity.AreaContent;
import com.hzxy.domain.utils.ResultModel;
import com.hzxy.domain.utils.ResultTools;
import com.hzxy.show.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/show/content")
public class ContentController {
    @Autowired
    private ContentService contentService;


    /*返回所有内容记录*/
    @GetMapping("/lists")
    private ResultModel lists(){
        Map<String,Object> result=new HashMap<>();
        List<AreaContent> areaContents = contentService.selectAll();
        int flag=0;
        if(areaContents.size()==0){
            flag=1;
        }
        result.put("data",areaContents);
        return ResultTools.result(flag,"",result);
    }


    /*根据分类id查找相应的内容记录*/
    @GetMapping("/SelectByCategoryId")
    private ResultModel SelectByCategoryId( Long id){
        Map<String,Object> result=new HashMap<>();
        List<AreaContent> areaContents = contentService.selectAllByCategoryId(id);
        int flag=0;
        if(areaContents.size()==0){
            flag=1;
        }
        result.put("data",areaContents);
        return ResultTools.result(flag,"",result);
    }

    /*根据id查找相应的内容记录*/




}
