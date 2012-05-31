package com.jshop.entity;

// Generated 2012-5-31 15:44:56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GoodsAttributeT generated by hbm2java
 */
public class GoodsAttributeT implements java.io.Serializable {

	private String goodsattributeid;
	private String goodsattributename;
	private String goodsTypeId;
	private String goodsTypeName;
	private Date createtime;
	private String state;
	private String creatorid;
	private String attributeType;
	private String attributelist;
	private String sort;
	private String attributeIndex;
	private String issearch;
	private String issametolink;

	public GoodsAttributeT() {
	}

	public GoodsAttributeT(String goodsattributeid, String goodsattributename,
			String goodsTypeId, String goodsTypeName, Date createtime,
			String state, String creatorid, String attributeType,
			String attributelist, String sort) {
		this.goodsattributeid = goodsattributeid;
		this.goodsattributename = goodsattributename;
		this.goodsTypeId = goodsTypeId;
		this.goodsTypeName = goodsTypeName;
		this.createtime = createtime;
		this.state = state;
		this.creatorid = creatorid;
		this.attributeType = attributeType;
		this.attributelist = attributelist;
		this.sort = sort;
	}

	public GoodsAttributeT(String goodsattributeid, String goodsattributename,
			String goodsTypeId, String goodsTypeName, Date createtime,
			String state, String creatorid, String attributeType,
			String attributelist, String sort, String attributeIndex,
			String issearch, String issametolink) {
		this.goodsattributeid = goodsattributeid;
		this.goodsattributename = goodsattributename;
		this.goodsTypeId = goodsTypeId;
		this.goodsTypeName = goodsTypeName;
		this.createtime = createtime;
		this.state = state;
		this.creatorid = creatorid;
		this.attributeType = attributeType;
		this.attributelist = attributelist;
		this.sort = sort;
		this.attributeIndex = attributeIndex;
		this.issearch = issearch;
		this.issametolink = issametolink;
	}

	public String getGoodsattributeid() {
		return this.goodsattributeid;
	}

	public void setGoodsattributeid(String goodsattributeid) {
		this.goodsattributeid = goodsattributeid;
	}

	public String getGoodsattributename() {
		return this.goodsattributename;
	}

	public void setGoodsattributename(String goodsattributename) {
		this.goodsattributename = goodsattributename;
	}

	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getGoodsTypeName() {
		return this.goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getAttributeType() {
		return this.attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public String getAttributelist() {
		return this.attributelist;
	}

	public void setAttributelist(String attributelist) {
		this.attributelist = attributelist;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getAttributeIndex() {
		return this.attributeIndex;
	}

	public void setAttributeIndex(String attributeIndex) {
		this.attributeIndex = attributeIndex;
	}

	public String getIssearch() {
		return this.issearch;
	}

	public void setIssearch(String issearch) {
		this.issearch = issearch;
	}

	public String getIssametolink() {
		return this.issametolink;
	}

	public void setIssametolink(String issametolink) {
		this.issametolink = issametolink;
	}

}
