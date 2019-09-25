package com.seal.filter.service;

import java.util.List;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 09:20
 * @description
 **/
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
