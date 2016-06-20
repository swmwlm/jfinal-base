package com.jfinal.base.common.model;

import java.util.Map;

import com.jfinal.base.common.model.base.BaseSysLog;
import com.jfinal.base.utils.ObjectUtils;
import com.jfinal.plugin.activerecord.Page;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class SysLog extends BaseSysLog<SysLog> {
	public static final SysLog dao = new SysLog();
	public Page<SysLog> paginate(int pageNumber, int pageSize,Map<String,Object> param) {
		StringBuffer sqlWhere = new StringBuffer("from sys_log where 1=1 ");
	    if(ObjectUtils.isNotEmpty(param.get("startTime"))){
	    	String startTime = (String) param.get("startTime");
	    	sqlWhere.append(" and create_time>='"+startTime+"'");
	    }
	    if(ObjectUtils.isNotEmpty(param.get("endTime"))){
	    	String endTime = (String) param.get("endTime");
	    	sqlWhere.append(" and create_time<='"+endTime+"'");
	    }
        if(ObjectUtils.isNotEmpty(param.get("logContext"))){
        	String logContext = (String) param.get("logContext");
	    	sqlWhere.append(" and title like '%"+logContext+"%'");
	    }
        sqlWhere.append("order by id desc");
		return paginate(pageNumber, pageSize, "select *", sqlWhere.toString());
	}
}
