package com.code.art.abstractfactory;

public interface AbstractFactory {
    /**
     * 获取位置信息来源
     * @param dataFrom 信息来源
     * @return 抽象信息来源
     */
    DataSource getLocationDataSource(DataFrom dataFrom);
    /**
     * 获取用户信息来源
     * @param dataFrom 信息来源
     * @return 抽象信息来源
     */
    DataSource getUserDataSource(DataFrom dataFrom);
}
