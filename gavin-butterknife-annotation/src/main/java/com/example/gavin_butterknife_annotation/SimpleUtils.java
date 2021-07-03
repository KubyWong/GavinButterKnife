package com.example.gavin_butterknife_annotation;

import java.util.Collection;
import java.util.Set;

import javax.lang.model.element.TypeElement;

/**
 * @Author: Gavin
 * @CreateDate: 7/3/21 1:55 PM
 * @Description:
 */
public class SimpleUtils {

    public static boolean isEmpty(Collection set) {
        return set == null || set.isEmpty();
    }
}
