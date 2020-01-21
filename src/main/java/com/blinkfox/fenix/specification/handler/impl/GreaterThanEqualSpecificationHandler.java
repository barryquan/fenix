package com.blinkfox.fenix.specification.handler.impl;

import com.blinkfox.fenix.specification.annotation.GreaterThanEqual;
import com.blinkfox.fenix.specification.handler.AbstractSpecificationHandler;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

/**
 * 构建“大于等于条件”({@code field >= 'xxx'})场景的 Specification 监听器.
 *
 * @author YangWenpeng on 2019-12-17
 * @author blinkfox on 2020-01-14
 * @since v2.2.0
 */
public class GreaterThanEqualSpecificationHandler extends AbstractSpecificationHandler {

    @Override
    protected <Z, X> Predicate buildPredicate(
            CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value, Object annotation) {
        return criteriaBuilder.and(super.buildGreaterThanEqualPredicate(criteriaBuilder, from, fieldName, value));
    }

    @Override
    public <Z, X> Predicate buildPredicate(
            CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value) {
        return criteriaBuilder.and(super.buildGreaterThanEqualPredicate(criteriaBuilder, from, fieldName, value));
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<GreaterThanEqual> getAnnotation() {
        return GreaterThanEqual.class;
    }

}