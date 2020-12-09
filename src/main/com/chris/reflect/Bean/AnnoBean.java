package com.chris.reflect.Bean;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Lilun
 * @Date 2020-11-30 17:53
 * @Description
 **/
@Data
public class AnnoBean {

    private String name;

    @AnnotationTest(key = "import")
    private String attr;


    public static void main(String[] args) throws IllegalAccessException {
        AnnoBean annoBean = new AnnoBean();
        annoBean.setName("xxx");
        annoBean.setAttr("eee");


        Class cls = annoBean.getClass();
        Field[] superFileds = cls.getSuperclass().getDeclaredFields();
        Field[] subFields = cls.getDeclaredFields();

        List<Field> allFields = new ArrayList<>();
        allFields.addAll(Arrays.asList(superFileds));
        allFields.addAll(Arrays.asList(subFields));

        if (!allFields.isEmpty() ) {
            for (Field field : allFields) {
                if (null != field && field.isAnnotationPresent(AnnotationTest.class)) {
                    AnnotationTest annotation = field.getAnnotation(AnnotationTest.class);
                    String key = annotation.key();
                    field.setAccessible(true);
                    String fieldName = field.getName();
                    String fieldValue = "";
                    Object value = field.get(annoBean);
                    if (null != value) {
                        if (field.getType() == List.class) {
                            List list = (List) value;
                            fieldValue = list.toString();
                        } else if (field.getType() == Class.class) {
                            fieldValue = ((Class) value).getTypeName();
                        } else {
                            fieldValue = (String) value;
                        }
                    }

                }
            }
        }
    }
}
