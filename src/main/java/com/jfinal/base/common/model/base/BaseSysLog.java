package com.jfinal.base.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysLog<M extends BaseSysLog<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}

	public java.lang.String getType() {
		return get("type");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setCreateBy(java.lang.String createBy) {
		set("create_by", createBy);
	}

	public java.lang.String getCreateBy() {
		return get("create_by");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setRemoteAddr(java.lang.String remoteAddr) {
		set("remote_addr", remoteAddr);
	}

	public java.lang.String getRemoteAddr() {
		return get("remote_addr");
	}

	public void setUserAgent(java.lang.String userAgent) {
		set("user_agent", userAgent);
	}

	public java.lang.String getUserAgent() {
		return get("user_agent");
	}

	public void setRequestUri(java.lang.String requestUri) {
		set("request_uri", requestUri);
	}

	public java.lang.String getRequestUri() {
		return get("request_uri");
	}

	public void setMethod(java.lang.String method) {
		set("method", method);
	}

	public java.lang.String getMethod() {
		return get("method");
	}

	public void setParams(java.lang.String params) {
		set("params", params);
	}

	public java.lang.String getParams() {
		return get("params");
	}

	public void setException(java.lang.String exception) {
		set("exception", exception);
	}

	public java.lang.String getException() {
		return get("exception");
	}

}