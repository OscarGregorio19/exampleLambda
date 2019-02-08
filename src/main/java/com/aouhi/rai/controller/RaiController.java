package com.aouhi.rai.controller;

import com.aouhi.rai.entity.TaNews;
import com.aouhi.rai.model.Response;
import com.aouhi.rai.service.impl.NewsServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/rest/rai"})
public class RaiController {

    @Autowired
    @Qualifier("NewsServicesImpl")
    private NewsServicesImpl newsServices;

    @GetMapping({"/r"})
    public List<TaNews> loanRequest()
    {
        return newsServices.listNoticias();
    }

    @PostMapping({"/s"})
    public Response save(@RequestBody TaNews input)
    {
        TaNews news = newsServices.saveNoticias(input);
        Response r = new Response();
        if(news != null) {
            r.setResult("ok");
            r.setStatus(true);
        } else {
            r.setResult("ocurrio un error");
            r.setStatus(false);
        }
        return r;
    }
}
