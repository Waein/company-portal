package com.zaelot.article.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.zaelot.article.dao.NewsDao;
import com.zaelot.article.domain.NewsDO;
import com.zaelot.article.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao newsDao;
	
	@Override
	public NewsDO get(Long cid){
		return newsDao.get(cid);
	}
	
	@Override
	public List<NewsDO> list(Map<String, Object> map){
		return newsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return newsDao.count(map);
	}
	
	@Override
	public int save(NewsDO news){
		return newsDao.save(news);
	}
	
	@Override
	public int update(NewsDO news){
		return newsDao.update(news);
	}
	
	@Override
	public int remove(Long cid){
		return newsDao.remove(cid);
	}
	
	@Override
	public int batchRemove(Long[] cids){
		return newsDao.batchRemove(cids);
	}
	
	
}
