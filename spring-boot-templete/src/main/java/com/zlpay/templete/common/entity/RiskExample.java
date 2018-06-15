package com.zlpay.templete.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdIsNull() {
            addCriterion("TRADE_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdIsNotNull() {
            addCriterion("TRADE_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdEqualTo(String value) {
            addCriterion("TRADE_DETAIL_ID =", value, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdNotEqualTo(String value) {
            addCriterion("TRADE_DETAIL_ID <>", value, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdGreaterThan(String value) {
            addCriterion("TRADE_DETAIL_ID >", value, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_DETAIL_ID >=", value, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdLessThan(String value) {
            addCriterion("TRADE_DETAIL_ID <", value, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdLessThanOrEqualTo(String value) {
            addCriterion("TRADE_DETAIL_ID <=", value, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdLike(String value) {
            addCriterion("TRADE_DETAIL_ID like", value, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdNotLike(String value) {
            addCriterion("TRADE_DETAIL_ID not like", value, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdIn(List<String> values) {
            addCriterion("TRADE_DETAIL_ID in", values, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdNotIn(List<String> values) {
            addCriterion("TRADE_DETAIL_ID not in", values, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdBetween(String value1, String value2) {
            addCriterion("TRADE_DETAIL_ID between", value1, value2, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andTradeDetailIdNotBetween(String value1, String value2) {
            addCriterion("TRADE_DETAIL_ID not between", value1, value2, "tradeDetailId");
            return (Criteria) this;
        }

        public Criteria andPayerIdIsNull() {
            addCriterion("PAYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayerIdIsNotNull() {
            addCriterion("PAYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayerIdEqualTo(String value) {
            addCriterion("PAYER_ID =", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotEqualTo(String value) {
            addCriterion("PAYER_ID <>", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdGreaterThan(String value) {
            addCriterion("PAYER_ID >", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_ID >=", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdLessThan(String value) {
            addCriterion("PAYER_ID <", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdLessThanOrEqualTo(String value) {
            addCriterion("PAYER_ID <=", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdLike(String value) {
            addCriterion("PAYER_ID like", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotLike(String value) {
            addCriterion("PAYER_ID not like", value, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdIn(List<String> values) {
            addCriterion("PAYER_ID in", values, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotIn(List<String> values) {
            addCriterion("PAYER_ID not in", values, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdBetween(String value1, String value2) {
            addCriterion("PAYER_ID between", value1, value2, "payerId");
            return (Criteria) this;
        }

        public Criteria andPayerIdNotBetween(String value1, String value2) {
            addCriterion("PAYER_ID not between", value1, value2, "payerId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("DEVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("DEVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("DEVICE_ID =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("DEVICE_ID <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("DEVICE_ID >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("DEVICE_ID <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_ID <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("DEVICE_ID like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("DEVICE_ID not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("DEVICE_ID in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("DEVICE_ID not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("DEVICE_ID between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("DEVICE_ID not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("DEVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("DEVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("DEVICE_TYPE =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("DEVICE_TYPE <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("DEVICE_TYPE >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_TYPE >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("DEVICE_TYPE <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_TYPE <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("DEVICE_TYPE like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("DEVICE_TYPE not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("DEVICE_TYPE in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("DEVICE_TYPE not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("DEVICE_TYPE between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("DEVICE_TYPE not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceOsIsNull() {
            addCriterion("DEVICE_OS is null");
            return (Criteria) this;
        }

        public Criteria andDeviceOsIsNotNull() {
            addCriterion("DEVICE_OS is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceOsEqualTo(String value) {
            addCriterion("DEVICE_OS =", value, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsNotEqualTo(String value) {
            addCriterion("DEVICE_OS <>", value, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsGreaterThan(String value) {
            addCriterion("DEVICE_OS >", value, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_OS >=", value, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsLessThan(String value) {
            addCriterion("DEVICE_OS <", value, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_OS <=", value, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsLike(String value) {
            addCriterion("DEVICE_OS like", value, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsNotLike(String value) {
            addCriterion("DEVICE_OS not like", value, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsIn(List<String> values) {
            addCriterion("DEVICE_OS in", values, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsNotIn(List<String> values) {
            addCriterion("DEVICE_OS not in", values, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsBetween(String value1, String value2) {
            addCriterion("DEVICE_OS between", value1, value2, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsNotBetween(String value1, String value2) {
            addCriterion("DEVICE_OS not between", value1, value2, "deviceOs");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionIsNull() {
            addCriterion("DEVICE_OS_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionIsNotNull() {
            addCriterion("DEVICE_OS_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionEqualTo(String value) {
            addCriterion("DEVICE_OS_VERSION =", value, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionNotEqualTo(String value) {
            addCriterion("DEVICE_OS_VERSION <>", value, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionGreaterThan(String value) {
            addCriterion("DEVICE_OS_VERSION >", value, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_OS_VERSION >=", value, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionLessThan(String value) {
            addCriterion("DEVICE_OS_VERSION <", value, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_OS_VERSION <=", value, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionLike(String value) {
            addCriterion("DEVICE_OS_VERSION like", value, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionNotLike(String value) {
            addCriterion("DEVICE_OS_VERSION not like", value, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionIn(List<String> values) {
            addCriterion("DEVICE_OS_VERSION in", values, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionNotIn(List<String> values) {
            addCriterion("DEVICE_OS_VERSION not in", values, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionBetween(String value1, String value2) {
            addCriterion("DEVICE_OS_VERSION between", value1, value2, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceOsVersionNotBetween(String value1, String value2) {
            addCriterion("DEVICE_OS_VERSION not between", value1, value2, "deviceOsVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIsNull() {
            addCriterion("DEVICE_IP is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIsNotNull() {
            addCriterion("DEVICE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIpEqualTo(String value) {
            addCriterion("DEVICE_IP =", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotEqualTo(String value) {
            addCriterion("DEVICE_IP <>", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpGreaterThan(String value) {
            addCriterion("DEVICE_IP >", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP >=", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLessThan(String value) {
            addCriterion("DEVICE_IP <", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_IP <=", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpLike(String value) {
            addCriterion("DEVICE_IP like", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotLike(String value) {
            addCriterion("DEVICE_IP not like", value, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpIn(List<String> values) {
            addCriterion("DEVICE_IP in", values, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotIn(List<String> values) {
            addCriterion("DEVICE_IP not in", values, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpBetween(String value1, String value2) {
            addCriterion("DEVICE_IP between", value1, value2, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceIpNotBetween(String value1, String value2) {
            addCriterion("DEVICE_IP not between", value1, value2, "deviceIp");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIsNull() {
            addCriterion("DEVICE_GPS is null");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIsNotNull() {
            addCriterion("DEVICE_GPS is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsEqualTo(String value) {
            addCriterion("DEVICE_GPS =", value, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsNotEqualTo(String value) {
            addCriterion("DEVICE_GPS <>", value, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsGreaterThan(String value) {
            addCriterion("DEVICE_GPS >", value, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_GPS >=", value, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsLessThan(String value) {
            addCriterion("DEVICE_GPS <", value, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_GPS <=", value, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsLike(String value) {
            addCriterion("DEVICE_GPS like", value, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsNotLike(String value) {
            addCriterion("DEVICE_GPS not like", value, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIn(List<String> values) {
            addCriterion("DEVICE_GPS in", values, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsNotIn(List<String> values) {
            addCriterion("DEVICE_GPS not in", values, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsBetween(String value1, String value2) {
            addCriterion("DEVICE_GPS between", value1, value2, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsNotBetween(String value1, String value2) {
            addCriterion("DEVICE_GPS not between", value1, value2, "deviceGps");
            return (Criteria) this;
        }

        public Criteria andDeviceSimIsNull() {
            addCriterion("DEVICE_SIM is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSimIsNotNull() {
            addCriterion("DEVICE_SIM is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSimEqualTo(String value) {
            addCriterion("DEVICE_SIM =", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimNotEqualTo(String value) {
            addCriterion("DEVICE_SIM <>", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimGreaterThan(String value) {
            addCriterion("DEVICE_SIM >", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_SIM >=", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimLessThan(String value) {
            addCriterion("DEVICE_SIM <", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_SIM <=", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimLike(String value) {
            addCriterion("DEVICE_SIM like", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimNotLike(String value) {
            addCriterion("DEVICE_SIM not like", value, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimIn(List<String> values) {
            addCriterion("DEVICE_SIM in", values, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimNotIn(List<String> values) {
            addCriterion("DEVICE_SIM not in", values, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimBetween(String value1, String value2) {
            addCriterion("DEVICE_SIM between", value1, value2, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andDeviceSimNotBetween(String value1, String value2) {
            addCriterion("DEVICE_SIM not between", value1, value2, "deviceSim");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}