package com.chris.reflect.type.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Person {
    List<Integer> integerList;
    Map<String, Integer> belongs;
}
