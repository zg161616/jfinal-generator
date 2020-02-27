package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseClassify<M extends BaseClassify<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setAliasName(java.lang.String aliasName) {
		set("alias_name", aliasName);
	}
	
	public java.lang.String getAliasName() {
		return getStr("alias_name");
	}

	public void setSeq(java.lang.Integer seq) {
		set("seq", seq);
	}
	
	public java.lang.Integer getSeq() {
		return getInt("seq");
	}

	public void setPid(java.lang.Long pid) {
		set("pid", pid);
	}
	
	public java.lang.Long getPid() {
		return getLong("pid");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setTid(java.lang.Long tid) {
		set("tid", tid);
	}
	
	public java.lang.Long getTid() {
		return getLong("tid");
	}

}
