package com.zaelot.common.service;

import org.springframework.stereotype.Service;

import com.zaelot.common.domain.LogDO;
import com.zaelot.common.domain.PageDO;
import com.zaelot.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
