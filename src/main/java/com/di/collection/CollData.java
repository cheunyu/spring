package com.di.collection;

import java.util.*;

/**
 * @author:cheunyu
 * @date:2018/5/6 2:02
 */
public class CollData {

    private String[] arrays;
    private List<String> list;
    private Map map;
    private Set set;
    private Properties properties;

    public String[] getArrays() {
        return arrays;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollData{" +
                "arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", properties=" + properties +
                '}';
    }
}
