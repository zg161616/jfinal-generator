package com.jinsubao.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseExchangeRate<M extends BaseExchangeRate<M>> extends Model<M> implements IBean {

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

	public void setRenminbi(java.lang.Double renminbi) {
		set("renminbi", renminbi);
	}
	
	public java.lang.Double getRenminbi() {
		return getDouble("renminbi");
	}

	public void setExchangeBuy(java.lang.Double exchangeBuy) {
		set("exchange_buy", exchangeBuy);
	}
	
	public java.lang.Double getExchangeBuy() {
		return getDouble("exchange_buy");
	}

	public void setMoneyBuy(java.lang.Double moneyBuy) {
		set("money_buy", moneyBuy);
	}
	
	public java.lang.Double getMoneyBuy() {
		return getDouble("money_buy");
	}

	public void setExchangeSell(java.lang.Double exchangeSell) {
		set("exchange_sell", exchangeSell);
	}
	
	public java.lang.Double getExchangeSell() {
		return getDouble("exchange_sell");
	}

	public void setMoneySell(java.lang.Double moneySell) {
		set("money_sell", moneySell);
	}
	
	public java.lang.Double getMoneySell() {
		return getDouble("money_sell");
	}

	public void setTime(java.util.Date time) {
		set("time", time);
	}
	
	public java.util.Date getTime() {
		return get("time");
	}

}