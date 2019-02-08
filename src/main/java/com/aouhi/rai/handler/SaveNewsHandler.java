package com.aouhi.rai.handler;

import com.aouhi.rai.entity.TaNews;
import com.aouhi.rai.model.Response;
import com.aouhi.rai.service.impl.NewsServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("SaveNewsHandler")
public class SaveNewsHandler implements Function<TaNews, Response> {

    @Autowired
    @Qualifier("NewsServicesImpl")
    private NewsServicesImpl newsServices;

    @Override
    public Response apply(TaNews input) {

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