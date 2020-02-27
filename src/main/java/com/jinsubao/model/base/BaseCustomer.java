package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCustomer<M extends BaseCustomer<M>> extends Model<M> implements IBean {

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}
	
	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setCustomerNo(java.lang.String customerNo) {
		set("customer_no", customerNo);
	}
	
	public java.lang.String getCustomerNo() {
		return getStr("customer_no");
	}

	public void setArea(java.lang.String area) {
		set("area", area);
	}
	
	public java.lang.String getArea() {
		return getStr("area");
	}

	public void setSource(java.lang.String source) {
		set("source", source);
	}
	
	public java.lang.String getSource() {
		return getStr("source");
	}

	public void setEcotype(java.lang.String ecotype) {
		set("ecotype", ecotype);
	}
	
	public java.lang.String getEcotype() {
		return getStr("ecotype");
	}

	public void setLevel(java.lang.String level) {
		set("level", level);
	}
	
	public java.lang.String getLevel() {
		return getStr("level");
	}

	public void setTrade(java.lang.String trade) {
		set("trade", trade);
	}
	
	public java.lang.String getTrade() {
		return getStr("trade");
	}

	public void setSatisfy(java.lang.Integer satisfy) {
		set("satisfy", satisfy);
	}
	
	public java.lang.Integer getSatisfy() {
		return getInt("satisfy");
	}

	public void setCredit(java.lang.Integer credit) {
		set("credit", credit);
	}
	
	public java.lang.Integer getCredit() {
		return getInt("credit");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setWebsite(java.lang.String website) {
		set("website", website);
	}
	
	public java.lang.String getWebsite() {
		return getStr("website");
	}

	public void setZipcode(java.lang.String zipcode) {
		set("zipcode", zipcode);
	}
	
	public java.lang.String getZipcode() {
		return getStr("zipcode");
	}

	public void setLinkman(java.lang.String linkman) {
		set("linkman", linkman);
	}
	
	public java.lang.String getLinkman() {
		return getStr("linkman");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public void setTel(java.lang.String tel) {
		set("tel", tel);
	}
	
	public java.lang.String getTel() {
		return getStr("tel");
	}

	public void setFax(java.lang.String fax) {
		set("fax", fax);
	}
	
	public java.lang.String getFax() {
		return getStr("fax");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setMainProduct(java.lang.String mainProduct) {
		set("main_product", mainProduct);
	}
	
	public java.lang.String getMainProduct() {
		return getStr("main_product");
	}

	public void setTalk(java.lang.String talk) {
		set("talk", talk);
	}
	
	public java.lang.String getTalk() {
		return getStr("talk");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}

	public void setIntro(java.lang.String intro) {
		set("intro", intro);
	}
	
	public java.lang.String getIntro() {
		return getStr("intro");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setOwnerUserId(java.lang.Long ownerUserId) {
		set("owner_user_id", ownerUserId);
	}
	
	public java.lang.Long getOwnerUserId() {
		return getLong("owner_user_id");
	}

	public void setConnTime(java.util.Date connTime) {
		set("conn_time", connTime);
	}
	
	public java.util.Date getConnTime() {
		return get("conn_time");
	}

	public void setNextTime(java.util.Date nextTime) {
		set("next_time", nextTime);
	}
	
	public java.util.Date getNextTime() {
		return get("next_time");
	}

	public void setConnBody(java.lang.String connBody) {
		set("conn_body", connBody);
	}
	
	public java.lang.String getConnBody() {
		return getStr("conn_body");
	}

	public void setBillCompany(java.lang.String billCompany) {
		set("bill_company", billCompany);
	}
	
	public java.lang.String getBillCompany() {
		return getStr("bill_company");
	}

	public void setBillNo(java.lang.String billNo) {
		set("bill_no", billNo);
	}
	
	public java.lang.String getBillNo() {
		return getStr("bill_no");
	}

	public void setBillTel(java.lang.String billTel) {
		set("bill_tel", billTel);
	}
	
	public java.lang.String getBillTel() {
		return getStr("bill_tel");
	}

	public void setBillBank(java.lang.String billBank) {
		set("bill_bank", billBank);
	}
	
	public java.lang.String getBillBank() {
		return getStr("bill_bank");
	}

	public void setBillAccount(java.lang.String billAccount) {
		set("bill_account", billAccount);
	}
	
	public java.lang.String getBillAccount() {
		return getStr("bill_account");
	}

	public void setBillRemark(java.lang.String billRemark) {
		set("bill_remark", billRemark);
	}
	
	public java.lang.String getBillRemark() {
		return getStr("bill_remark");
	}

	public void setBusinessLicenseFileId(java.lang.String businessLicenseFileId) {
		set("business_license_file_id", businessLicenseFileId);
	}
	
	public java.lang.String getBusinessLicenseFileId() {
		return getStr("business_license_file_id");
	}

	public void setOpenAccountFileId(java.lang.String openAccountFileId) {
		set("open_account_file_id", openAccountFileId);
	}
	
	public java.lang.String getOpenAccountFileId() {
		return getStr("open_account_file_id");
	}

	public void setFrontIdcardFileId(java.lang.String frontIdcardFileId) {
		set("front_idcard_file_id", frontIdcardFileId);
	}
	
	public java.lang.String getFrontIdcardFileId() {
		return getStr("front_idcard_file_id");
	}

	public void setBackIdcardFileId(java.lang.String backIdcardFileId) {
		set("back_idcard_file_id", backIdcardFileId);
	}
	
	public java.lang.String getBackIdcardFileId() {
		return getStr("back_idcard_file_id");
	}

	public void setHoldIdcardFileId(java.lang.String holdIdcardFileId) {
		set("hold_idcard_file_id", holdIdcardFileId);
	}
	
	public java.lang.String getHoldIdcardFileId() {
		return getStr("hold_idcard_file_id");
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

	public void setTransStatus(java.lang.Integer transStatus) {
		set("trans_status", transStatus);
	}
	
	public java.lang.Integer getTransStatus() {
		return getInt("trans_status");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}

	public void setEnterpriseCode(java.lang.String enterpriseCode) {
		set("enterprise_code", enterpriseCode);
	}
	
	public java.lang.String getEnterpriseCode() {
		return getStr("enterprise_code");
	}

	public void setPid(java.lang.Long pid) {
		set("pid", pid);
	}
	
	public java.lang.Long getPid() {
		return getLong("pid");
	}

	public void setBillLinkman(java.lang.String billLinkman) {
		set("bill_linkman", billLinkman);
	}
	
	public java.lang.String getBillLinkman() {
		return getStr("bill_linkman");
	}

	public void setBillAddress(java.lang.String billAddress) {
		set("bill_address", billAddress);
	}
	
	public java.lang.String getBillAddress() {
		return getStr("bill_address");
	}

	public void setScore(java.math.BigDecimal score) {
		set("score", score);
	}
	
	public java.math.BigDecimal getScore() {
		return get("score");
	}

	public void setTid(java.lang.Long tid) {
		set("tid", tid);
	}
	
	public java.lang.Long getTid() {
		return getLong("tid");
	}

}