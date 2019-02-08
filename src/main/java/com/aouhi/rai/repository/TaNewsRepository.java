package com.aouhi.rai.repository;

import com.aouhi.rai.entity.TaNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("TaNewsRepository")
public interface TaNewsRepository extends JpaRepository<TaNews, Serializable> {

    public List<TaNews> findTop6ByOrderByIdDesc();
}
