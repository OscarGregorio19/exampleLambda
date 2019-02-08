package com.aouhi.rai.handler;

import com.aouhi.rai.entity.TaNews;
import com.aouhi.rai.model.Request;
import com.aouhi.rai.service.impl.NewsServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;

@Component("UpperCaseStringHandler")
public class UpperCaseStringHandler implements Function<Request, List<TaNews>> {

    @Autowired
    @Qualifier("NewsServicesImpl")
    private NewsServicesImpl newsServices;

    @Override
    public List<TaNews> apply(Request input) {

        return newsServices.listNoticias();
    }
}
