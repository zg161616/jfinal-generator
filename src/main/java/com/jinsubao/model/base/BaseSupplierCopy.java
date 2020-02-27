package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSupplierCopy<M extends BaseSupplierCopy<M>> extends Model<M> implements IBean {

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

	public void setLinkman(java.lang.String linkman) {
		set("linkman", linkman);
	}
	
	public java.lang.String getLinkman() {
		return getStr("linkman");
	}

	public void setTel(java.lang.String tel) {
		set("tel", tel);
	}
	
	public java.lang.String getTel() {
		return getStr("tel");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}
	
	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public void setArea(java.lang.String area) {
		set("area", area);
	}
	
	public java.lang.String getArea() {
		return getStr("area");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setDocker(java.lang.String docker) {
		set("docker", docker);
	}
	
	public java.lang.String getDocker() {
		return getStr("docker");
	}

	public void setDockerTel(java.lang.String dockerTel) {
		set("docker_tel", dockerTel);
	}
	
	public java.lang.String getDockerTel() {
		return getStr("docker_tel");
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

	public void setEcotype(java.lang.String ecotype) {
		set("ecotype", ecotype);
	}
	
	public java.lang.String getEcotype() {
		return getStr("ecotype");
	}

	public void setTrade(java.lang.String trade) {
		set("trade", trade);
	}
	
	public java.lang.String getTrade() {
		return getStr("trade");
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

	public void setFax(java.lang.String fax) {
		set("fax", fax);
	}
	
	public java.lang.String getFax() {
		return getStr("fax");
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

	public void setBusinessLicenseFileId(java.lang.Long businessLicenseFileId) {
		set("business_license_file_id", businessLicenseFileId);
	}
	
	public java.lang.Long getBusinessLicenseFileId() {
		return getLong("business_license_file_id");
	}

	public void setOpenAccountFileId(java.lang.Long openAccountFileId) {
		set("open_account_file_id", openAccountFileId);
	}
	
	public java.lang.Long getOpenAccountFileId() {
		return getLong("open_account_file_id");
	}

	public void setFrontIdcardFileId(java.lang.Long frontIdcardFileId) {
		set("front_idcard_file_id", frontIdcardFileId);
	}
	
	public java.lang.Long getFrontIdcardFileId() {
		return getLong("front_idcard_file_id");
	}

	public void setBackIdcardFileId(java.lang.Long backIdcardFileId) {
		set("back_idcard_file_id", backIdcardFileId);
	}
	
	public java.lang.Long getBackIdcardFileId() {
		return getLong("back_idcard_file_id");
	}

	public void setHoldIdcardFileId(java.lang.Long holdIdcardFileId) {
		set("hold_idcard_file_id", holdIdcardFileId);
	}
	
	public java.lang.Long getHoldIdcardFileId() {
		return getLong("hold_idcard_file_id");
	}

}
