package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProduct<M extends BaseProduct<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setCategory(java.lang.String category) {
		set("category", category);
	}
	
	public java.lang.String getCategory() {
		return getStr("category");
	}

	public void setVariety(java.lang.String variety) {
		set("variety", variety);
	}
	
	public java.lang.String getVariety() {
		return getStr("variety");
	}

	public void setArea(java.lang.String area) {
		set("area", area);
	}
	
	public java.lang.String getArea() {
		return getStr("area");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}
	
	public java.lang.String getCode() {
		return getStr("code");
	}

	public void setMfr(java.lang.String mfr) {
		set("mfr", mfr);
	}
	
	public java.lang.String getMfr() {
		return getStr("mfr");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
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

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setSeq(java.lang.Integer seq) {
		set("seq", seq);
	}
	
	public java.lang.Integer getSeq() {
		return getInt("seq");
	}

	public void setCategorySeq(java.lang.Integer categorySeq) {
		set("category_seq", categorySeq);
	}
	
	public java.lang.Integer getCategorySeq() {
		return getInt("category_seq");
	}

	public void setTid(java.lang.Long tid) {
		set("tid", tid);
	}
	
	public java.lang.Long getTid() {
		return getLong("tid");
	}

}
