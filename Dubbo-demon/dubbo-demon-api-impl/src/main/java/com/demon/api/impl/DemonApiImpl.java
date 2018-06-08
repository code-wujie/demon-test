package com.demon.api.impl;

import com.demon.api.DemonApi;

/**
 * Created by WJ on 2018/6/8.
 */
public class DemonApiImpl implements DemonApi {
    @Override
    public String getStr(String str) {
        return "your string is :"+str;
    }
}
