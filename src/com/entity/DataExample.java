package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andMarkNameIsNull() {
            addCriterion("mark_name is null");
            return (Criteria) this;
        }

        public Criteria andMarkNameIsNotNull() {
            addCriterion("mark_name is not null");
            return (Criteria) this;
        }

        public Criteria andMarkNameEqualTo(String value) {
            addCriterion("mark_name =", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotEqualTo(String value) {
            addCriterion("mark_name <>", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameGreaterThan(String value) {
            addCriterion("mark_name >", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameGreaterThanOrEqualTo(String value) {
            addCriterion("mark_name >=", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLessThan(String value) {
            addCriterion("mark_name <", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLessThanOrEqualTo(String value) {
            addCriterion("mark_name <=", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameLike(String value) {
            addCriterion("mark_name like", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotLike(String value) {
            addCriterion("mark_name not like", value, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameIn(List<String> values) {
            addCriterion("mark_name in", values, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotIn(List<String> values) {
            addCriterion("mark_name not in", values, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameBetween(String value1, String value2) {
            addCriterion("mark_name between", value1, value2, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkNameNotBetween(String value1, String value2) {
            addCriterion("mark_name not between", value1, value2, "markName");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeIsNull() {
            addCriterion("mark_latitude is null");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeIsNotNull() {
            addCriterion("mark_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeEqualTo(Double value) {
            addCriterion("mark_latitude =", value, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeNotEqualTo(Double value) {
            addCriterion("mark_latitude <>", value, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeGreaterThan(Double value) {
            addCriterion("mark_latitude >", value, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("mark_latitude >=", value, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeLessThan(Double value) {
            addCriterion("mark_latitude <", value, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("mark_latitude <=", value, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeIn(List<Double> values) {
            addCriterion("mark_latitude in", values, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeNotIn(List<Double> values) {
            addCriterion("mark_latitude not in", values, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeBetween(Double value1, Double value2) {
            addCriterion("mark_latitude between", value1, value2, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("mark_latitude not between", value1, value2, "markLatitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeIsNull() {
            addCriterion("mark_longitude is null");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeIsNotNull() {
            addCriterion("mark_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeEqualTo(Double value) {
            addCriterion("mark_longitude =", value, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeNotEqualTo(Double value) {
            addCriterion("mark_longitude <>", value, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeGreaterThan(Double value) {
            addCriterion("mark_longitude >", value, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("mark_longitude >=", value, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeLessThan(Double value) {
            addCriterion("mark_longitude <", value, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("mark_longitude <=", value, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeIn(List<Double> values) {
            addCriterion("mark_longitude in", values, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeNotIn(List<Double> values) {
            addCriterion("mark_longitude not in", values, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeBetween(Double value1, Double value2) {
            addCriterion("mark_longitude between", value1, value2, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("mark_longitude not between", value1, value2, "markLongitude");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeIsNull() {
            addCriterion("mark_describe is null");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeIsNotNull() {
            addCriterion("mark_describe is not null");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeEqualTo(String value) {
            addCriterion("mark_describe =", value, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeNotEqualTo(String value) {
            addCriterion("mark_describe <>", value, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeGreaterThan(String value) {
            addCriterion("mark_describe >", value, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("mark_describe >=", value, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeLessThan(String value) {
            addCriterion("mark_describe <", value, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeLessThanOrEqualTo(String value) {
            addCriterion("mark_describe <=", value, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeLike(String value) {
            addCriterion("mark_describe like", value, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeNotLike(String value) {
            addCriterion("mark_describe not like", value, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeIn(List<String> values) {
            addCriterion("mark_describe in", values, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeNotIn(List<String> values) {
            addCriterion("mark_describe not in", values, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeBetween(String value1, String value2) {
            addCriterion("mark_describe between", value1, value2, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkDescribeNotBetween(String value1, String value2) {
            addCriterion("mark_describe not between", value1, value2, "markDescribe");
            return (Criteria) this;
        }

        public Criteria andMarkAddressIsNull() {
            addCriterion("mark_address is null");
            return (Criteria) this;
        }

        public Criteria andMarkAddressIsNotNull() {
            addCriterion("mark_address is not null");
            return (Criteria) this;
        }

        public Criteria andMarkAddressEqualTo(String value) {
            addCriterion("mark_address =", value, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressNotEqualTo(String value) {
            addCriterion("mark_address <>", value, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressGreaterThan(String value) {
            addCriterion("mark_address >", value, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mark_address >=", value, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressLessThan(String value) {
            addCriterion("mark_address <", value, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressLessThanOrEqualTo(String value) {
            addCriterion("mark_address <=", value, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressLike(String value) {
            addCriterion("mark_address like", value, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressNotLike(String value) {
            addCriterion("mark_address not like", value, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressIn(List<String> values) {
            addCriterion("mark_address in", values, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressNotIn(List<String> values) {
            addCriterion("mark_address not in", values, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressBetween(String value1, String value2) {
            addCriterion("mark_address between", value1, value2, "markAddress");
            return (Criteria) this;
        }

        public Criteria andMarkAddressNotBetween(String value1, String value2) {
            addCriterion("mark_address not between", value1, value2, "markAddress");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNull() {
            addCriterion("last_date is null");
            return (Criteria) this;
        }

        public Criteria andLastDateIsNotNull() {
            addCriterion("last_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateEqualTo(Date value) {
            addCriterion("last_date =", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotEqualTo(Date value) {
            addCriterion("last_date <>", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThan(Date value) {
            addCriterion("last_date >", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_date >=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThan(Date value) {
            addCriterion("last_date <", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateLessThanOrEqualTo(Date value) {
            addCriterion("last_date <=", value, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateIn(List<Date> values) {
            addCriterion("last_date in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotIn(List<Date> values) {
            addCriterion("last_date not in", values, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateBetween(Date value1, Date value2) {
            addCriterion("last_date between", value1, value2, "lastDate");
            return (Criteria) this;
        }

        public Criteria andLastDateNotBetween(Date value1, Date value2) {
            addCriterion("last_date not between", value1, value2, "lastDate");
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