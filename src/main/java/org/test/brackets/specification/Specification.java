package org.test.brackets.specification;

import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;

public interface Specification<T> {
	  Predicate toPredicate(Root<T> root, CriteriaBuilder cb);
}