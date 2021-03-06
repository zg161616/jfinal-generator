package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSms<M extends BaseSms<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setTelephone(java.lang.String telephone) {
		set("telephone", telephone);
	}
	
	public java.lang.String getTelephone() {
		return getStr("telephone");
	}

	public void setSmsCode(java.lang.String smsCode) {
		set("sms_code", smsCode);
	}
	
	public java.lang.String getSmsCode() {
		return getStr("sms_code");
	}

	public void setSms(java.lang.String sms) {
		set("sms", sms);
	}
	
	public java.lang.String getSms() {
		return getStr("sms");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}
	
	public java.lang.String getIp() {
		return getStr("ip");
	}

	public void setSmsType(java.lang.String smsType) {
		set("sms_type", smsType);
	}
	
	public java.lang.String getSmsType() {
		return getStr("sms_type");
	}

	public void setIsUsed(java.lang.Integer isUsed) {
		set("is_used", isUsed);
	}
	
	public java.lang.Integer getIsUsed() {
		return getInt("is_used");
	}

	public void setInvalidTime(java.lang.Long invalidTime) {
		set("invalid_time", invalidTime);
	}
	
	public java.lang.Long getInvalidTime() {
		return getLong("invalid_time");
	}

	public void setCreateTime(java.lang.Long createTime) {
		set("create_time", createTime);
	}
	
	public java.lang.Long getCreateTime() {
		return getLong("create_time");
	}

	public void setUpdateTime(java.lang.Long updateTime) {
		set("update_time", updateTime);
	}
	
	public java.lang.Long getUpdateTime() {
		return getLong("update_time");
	}

	public void setTid(java.lang.Long tid) {
		set("tid", tid);
	}
	
	public java.lang.Long getTid() {
		return getLong("tid");
	}

}
