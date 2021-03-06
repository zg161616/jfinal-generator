package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSaleOrder<M extends BaseSaleOrder<M>> extends Model<M> implements IBean {

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

	public void setSaleTime(java.util.Date saleTime) {
		set("sale_time", saleTime);
	}
	
	public java.util.Date getSaleTime() {
		return get("sale_time");
	}

	public void setTotalPrice(java.math.BigDecimal totalPrice) {
		set("total_price", totalPrice);
	}
	
	public java.math.BigDecimal getTotalPrice() {
		return get("total_price");
	}

	public void setAcceptedPrice(java.math.BigDecimal acceptedPrice) {
		set("accepted_price", acceptedPrice);
	}
	
	public java.math.BigDecimal getAcceptedPrice() {
		return get("accepted_price");
	}

	public void setTradeType(java.lang.String tradeType) {
		set("trade_type", tradeType);
	}
	
	public java.lang.String getTradeType() {
		return getStr("trade_type");
	}

	public void setQuoteId(java.lang.Long quoteId) {
		set("quote_id", quoteId);
	}
	
	public java.lang.Long getQuoteId() {
		return getLong("quote_id");
	}

	public void setTax(java.lang.String tax) {
		set("tax", tax);
	}
	
	public java.lang.String getTax() {
		return getStr("tax");
	}

	public void setNum(java.math.BigDecimal num) {
		set("num", num);
	}
	
	public java.math.BigDecimal getNum() {
		return get("num");
	}

	public void setRemainderNum(java.math.BigDecimal remainderNum) {
		set("remainder_num", remainderNum);
	}
	
	public java.math.BigDecimal getRemainderNum() {
		return get("remainder_num");
	}

	public void setDriver(java.lang.String driver) {
		set("driver", driver);
	}
	
	public java.lang.String getDriver() {
		return getStr("driver");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setFee(java.math.BigDecimal fee) {
		set("fee", fee);
	}
	
	public java.math.BigDecimal getFee() {
		return get("fee");
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

	public void setSalesmanId(java.lang.Long salesmanId) {
		set("salesman_id", salesmanId);
	}
	
	public java.lang.Long getSalesmanId() {
		return getLong("salesman_id");
	}

	public void setSalesmanName(java.lang.String salesmanName) {
		set("salesman_name", salesmanName);
	}
	
	public java.lang.String getSalesmanName() {
		return getStr("salesman_name");
	}

	public void setSalesmanTel(java.lang.String salesmanTel) {
		set("salesman_tel", salesmanTel);
	}
	
	public java.lang.String getSalesmanTel() {
		return getStr("salesman_tel");
	}

	public void setCustomerId(java.lang.Long customerId) {
		set("customer_id", customerId);
	}
	
	public java.lang.Long getCustomerId() {
		return getLong("customer_id");
	}

	public void setCustomerName(java.lang.String customerName) {
		set("customer_name", customerName);
	}
	
	public java.lang.String getCustomerName() {
		return getStr("customer_name");
	}

	public void setCustomerMobile(java.lang.String customerMobile) {
		set("customer_mobile", customerMobile);
	}
	
	public java.lang.String getCustomerMobile() {
		return getStr("customer_mobile");
	}

	public void setTransportType(java.lang.String transportType) {
		set("transport_type", transportType);
	}
	
	public java.lang.String getTransportType() {
		return getStr("transport_type");
	}

	public void setTransportAddress(java.lang.String transportAddress) {
		set("transport_address", transportAddress);
	}
	
	public java.lang.String getTransportAddress() {
		return getStr("transport_address");
	}

	public void setPlateNo(java.lang.String plateNo) {
		set("plate_no", plateNo);
	}
	
	public java.lang.String getPlateNo() {
		return getStr("plate_no");
	}

	public void setFreight(java.math.BigDecimal freight) {
		set("freight", freight);
	}
	
	public java.math.BigDecimal getFreight() {
		return get("freight");
	}

	public void setCardNo(java.lang.String cardNo) {
		set("card_no", cardNo);
	}
	
	public java.lang.String getCardNo() {
		return getStr("card_no");
	}

	public void setStoreAddress(java.lang.String storeAddress) {
		set("store_address", storeAddress);
	}
	
	public java.lang.String getStoreAddress() {
		return getStr("store_address");
	}

	public void setTakeStartTime(java.util.Date takeStartTime) {
		set("take_start_time", takeStartTime);
	}
	
	public java.util.Date getTakeStartTime() {
		return get("take_start_time");
	}

	public void setTakeEndTime(java.util.Date takeEndTime) {
		set("take_end_time", takeEndTime);
	}
	
	public java.util.Date getTakeEndTime() {
		return get("take_end_time");
	}

	public void setState(java.lang.String state) {
		set("state", state);
	}
	
	public java.lang.String getState() {
		return getStr("state");
	}

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}
	
	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

	public void setCategory(java.lang.String category) {
		set("category", category);
	}
	
	public java.lang.String getCategory() {
		return getStr("category");
	}

	public void setInvoiceFileId(java.lang.String invoiceFileId) {
		set("invoice_file_id", invoiceFileId);
	}
	
	public java.lang.String getInvoiceFileId() {
		return getStr("invoice_file_id");
	}

	public void setDeliveryFileId(java.lang.String deliveryFileId) {
		set("delivery_file_id", deliveryFileId);
	}
	
	public java.lang.String getDeliveryFileId() {
		return getStr("delivery_file_id");
	}

	public void setLogisticsNumber(java.lang.String logisticsNumber) {
		set("logistics_number", logisticsNumber);
	}
	
	public java.lang.String getLogisticsNumber() {
		return getStr("logistics_number");
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

	public void setAmountReceivable(java.math.BigDecimal amountReceivable) {
		set("amount_receivable", amountReceivable);
	}
	
	public java.math.BigDecimal getAmountReceivable() {
		return get("amount_receivable");
	}

	public void setPreOrderId(java.lang.Long preOrderId) {
		set("pre_order_id", preOrderId);
	}
	
	public java.lang.Long getPreOrderId() {
		return getLong("pre_order_id");
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

	public void setInvoiceFileNum(java.lang.String invoiceFileNum) {
		set("invoice_file_num", invoiceFileNum);
	}
	
	public java.lang.String getInvoiceFileNum() {
		return getStr("invoice_file_num");
	}

	public void setAuditReason(java.lang.String auditReason) {
		set("audit_reason", auditReason);
	}
	
	public java.lang.String getAuditReason() {
		return getStr("audit_reason");
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

	public void setRemainNum(java.math.BigDecimal remainNum) {
		set("remain_num", remainNum);
	}
	
	public java.math.BigDecimal getRemainNum() {
		return get("remain_num");
	}

	public void setSymbol(java.lang.Integer symbol) {
		set("symbol", symbol);
	}
	
	public java.lang.Integer getSymbol() {
		return getInt("symbol");
	}

	public void setTid(java.lang.Long tid) {
		set("tid", tid);
	}
	
	public java.lang.Long getTid() {
		return getLong("tid");
	}

	public void setSpecialRemark(java.lang.String specialRemark) {
		set("special_remark", specialRemark);
	}
	
	public java.lang.String getSpecialRemark() {
		return getStr("special_remark");
	}

}
