package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseVoucherCopy<M extends BaseVoucherCopy<M>> extends Model<M> implements IBean {

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

	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setFax(java.lang.String fax) {
		set("fax", fax);
	}
	
	public java.lang.String getFax() {
		return getStr("fax");
	}

	public void setPayee(java.lang.String payee) {
		set("payee", payee);
	}
	
	public java.lang.String getPayee() {
		return getStr("payee");
	}

	public void setBank(java.lang.String bank) {
		set("bank", bank);
	}
	
	public java.lang.String getBank() {
		return getStr("bank");
	}

	public void setAccountType(java.lang.String accountType) {
		set("account_type", accountType);
	}
	
	public java.lang.String getAccountType() {
		return getStr("account_type");
	}

	public void setOrderId(java.lang.Long orderId) {
		set("order_id", orderId);
	}
	
	public java.lang.Long getOrderId() {
		return getLong("order_id");
	}

	public void setDirection(java.lang.Integer direction) {
		set("direction", direction);
	}
	
	public java.lang.Integer getDirection() {
		return getInt("direction");
	}

	public void setState(java.lang.String state) {
		set("state", state);
	}
	
	public java.lang.String getState() {
		return getStr("state");
	}

	public void setFileId(java.lang.String fileId) {
		set("file_id", fileId);
	}
	
	public java.lang.String getFileId() {
		return getStr("file_id");
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

	public void setAccount(java.lang.String account) {
		set("account", account);
	}
	
	public java.lang.String getAccount() {
		return getStr("account");
	}

	public void setPaymentTime(java.util.Date paymentTime) {
		set("payment_time", paymentTime);
	}
	
	public java.util.Date getPaymentTime() {
		return get("payment_time");
	}

}
