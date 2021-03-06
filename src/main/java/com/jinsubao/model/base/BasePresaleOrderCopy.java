package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePresaleOrderCopy<M extends BasePresaleOrderCopy<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setOrderNo(java.lang.String orderNo) {
		set("order_no", orderNo);
	}
	
	public java.lang.String getOrderNo() {
		return getStr("order_no");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}
	
	public java.lang.String getCode() {
		return getStr("code");
	}

	public void setCustomerId(java.lang.Long customerId) {
		set("customer_id", customerId);
	}
	
	public java.lang.Long getCustomerId() {
		return getLong("customer_id");
	}

	public void setRemainNum(java.math.BigDecimal remainNum) {
		set("remain_num", remainNum);
	}
	
	public java.math.BigDecimal getRemainNum() {
		return get("remain_num");
	}

	public void setNum(java.math.BigDecimal num) {
		set("num", num);
	}
	
	public java.math.BigDecimal getNum() {
		return get("num");
	}

	public void setTax(java.lang.String tax) {
		set("tax", tax);
	}
	
	public java.lang.String getTax() {
		return getStr("tax");
	}

	public void setTaxPrice(java.math.BigDecimal taxPrice) {
		set("tax_price", taxPrice);
	}
	
	public java.math.BigDecimal getTaxPrice() {
		return get("tax_price");
	}

	public void setNormalPrice(java.math.BigDecimal normalPrice) {
		set("normal_price", normalPrice);
	}
	
	public java.math.BigDecimal getNormalPrice() {
		return get("normal_price");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setState(java.lang.String state) {
		set("state", state);
	}
	
	public java.lang.String getState() {
		return getStr("state");
	}

	public void setSalesmanName(java.lang.String salesmanName) {
		set("salesman_name", salesmanName);
	}
	
	public java.lang.String getSalesmanName() {
		return getStr("salesman_name");
	}

	public void setSalesmanPhone(java.lang.String salesmanPhone) {
		set("salesman_phone", salesmanPhone);
	}
	
	public java.lang.String getSalesmanPhone() {
		return getStr("salesman_phone");
	}

	public void setTransportType(java.lang.String transportType) {
		set("transport_type", transportType);
	}
	
	public java.lang.String getTransportType() {
		return getStr("transport_type");
	}

	public void setTradeType(java.lang.String tradeType) {
		set("trade_type", tradeType);
	}
	
	public java.lang.String getTradeType() {
		return getStr("trade_type");
	}

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}
	
	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

	public void setSalesmanId(java.lang.Long salesmanId) {
		set("salesman_id", salesmanId);
	}
	
	public java.lang.Long getSalesmanId() {
		return getLong("salesman_id");
	}

	public void setContractFileId(java.lang.String contractFileId) {
		set("contract_file_id", contractFileId);
	}
	
	public java.lang.String getContractFileId() {
		return getStr("contract_file_id");
	}

	public void setRemainderNum(java.math.BigDecimal remainderNum) {
		set("remainder_num", remainderNum);
	}
	
	public java.math.BigDecimal getRemainderNum() {
		return get("remainder_num");
	}

	public void setFee(java.math.BigDecimal fee) {
		set("fee", fee);
	}
	
	public java.math.BigDecimal getFee() {
		return get("fee");
	}

	public void setFreight(java.math.BigDecimal freight) {
		set("freight", freight);
	}
	
	public java.math.BigDecimal getFreight() {
		return get("freight");
	}

	public void setTotalPrice(java.math.BigDecimal totalPrice) {
		set("total_price", totalPrice);
	}
	
	public java.math.BigDecimal getTotalPrice() {
		return get("total_price");
	}

	public void setSignFileId(java.lang.String signFileId) {
		set("sign_file_id", signFileId);
	}
	
	public java.lang.String getSignFileId() {
		return getStr("sign_file_id");
	}

	public void setSignFileNum(java.lang.String signFileNum) {
		set("sign_file_num", signFileNum);
	}
	
	public java.lang.String getSignFileNum() {
		return getStr("sign_file_num");
	}

	public void setAuditReason(java.lang.String auditReason) {
		set("audit_reason", auditReason);
	}
	
	public java.lang.String getAuditReason() {
		return getStr("audit_reason");
	}

	public void setInvoiceFileId(java.lang.String invoiceFileId) {
		set("invoice_file_id", invoiceFileId);
	}
	
	public java.lang.String getInvoiceFileId() {
		return getStr("invoice_file_id");
	}

	public void setArea(java.lang.String area) {
		set("area", area);
	}
	
	public java.lang.String getArea() {
		return getStr("area");
	}

	public void setInvoiceFileNum(java.lang.String invoiceFileNum) {
		set("invoice_file_num", invoiceFileNum);
	}
	
	public java.lang.String getInvoiceFileNum() {
		return getStr("invoice_file_num");
	}

	public void setAcceptedPrice(java.math.BigDecimal acceptedPrice) {
		set("accepted_price", acceptedPrice);
	}
	
	public java.math.BigDecimal getAcceptedPrice() {
		return get("accepted_price");
	}

	public void setFromAddress(java.lang.String fromAddress) {
		set("from_address", fromAddress);
	}
	
	public java.lang.String getFromAddress() {
		return getStr("from_address");
	}

	public void setDeliveryTime(java.util.Date deliveryTime) {
		set("delivery_time", deliveryTime);
	}
	
	public java.util.Date getDeliveryTime() {
		return get("delivery_time");
	}

}
