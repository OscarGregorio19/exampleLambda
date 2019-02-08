package com.aouhi.rai.service;

import com.aouhi.rai.entity.TaNews;

import java.util.List;

public interface INewsService {

    public abstract TaNews saveNoticias(TaNews news);

    public abstract List<TaNews> listNoticias();
}
