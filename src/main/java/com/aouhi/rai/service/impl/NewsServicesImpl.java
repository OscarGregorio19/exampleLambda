package com.aouhi.rai.service.impl;

import com.aouhi.rai.entity.TaNews;
import com.aouhi.rai.repository.TaNewsRepository;
import com.aouhi.rai.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NewsServicesImpl")
public class NewsServicesImpl implements INewsService {

    @Autowired
    @Qualifier("TaNewsRepository")
    private TaNewsRepository newsRepository;

    @Override
    public TaNews saveNoticias(TaNews news) {
        return newsRepository.save(news);
    }

    @Override
    public List<TaNews> listNoticias() {
        return newsRepository.findTop6ByOrderByIdDesc();
    }
}
