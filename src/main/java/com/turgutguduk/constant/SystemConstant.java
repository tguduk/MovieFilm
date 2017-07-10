package com.turgutguduk.constant;

public class SystemConstant {
    public static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
    public static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    public static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";
    public static final String PROPERTY_NAME_HIBERNATE_NEW_GENERATOR_MAPPINGS = "hibernate.id.new_generator_mappings";
    public static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
    public static final String PROPERTY_VALUE_HIBERNATE_DB_DRIVER = "${db.driver}";
    public static final String PROPERTY_VALUE_HIBERNATE_DB_PASSWORD = "${db.password}";
    public static final String PROPERTY_VALUE_HIBERNATE_DB_URL = "${db.url}";
    public static final String PROPERTY_VALUE_HIBERNATE_DB_USERNAME = "${db.username}";
    public static final String PROPERTY_VALUE_HIBERNATE_DIALECT = "${hibernate.dialect}";
    public static final String PROPERTY_VALUE_HIBERNATE_SHOW_SQL = "${hibernate.show_sql}";
    public static final String PROPERTY_VALUE_HIBERNATE_HBM2DLL_AUTO = "${hibernate.hbm2ddl.auto}";
    public static final String PROPERTY_VALUE_ENTITYMANAGER_PACKAGES_TO_SCAN = "${entitymanager.packagesToScan}";


    public static final String PROPERTY_NAME_DATASOURCE = "java:/MovieFilm";
    public static final String PROPERTY_NAME_BASE_PACKAGE = "com.turgutguduk";
    public static final String PROPERTY_NAME_REPOSITORY_PACKAGE = "com.turgutguduk.repository";
    public static final String PROPERTY_NAME_APPLICATION_PROPERTIES = "classpath:application.properties";
    public static final String PROPERTY_NAME_MESSAGE_SOURCE_BASE = "message.source.basename";
    public static final String PROPERTY_NAME_PAGE_PREFIX = "/WEB-INF/pages/";
    public static final String PROPERTY_NAME_PAGE_SUFFIX = ".jsp";
    public static final String DISPATCHER_SERVLET_NAME = "dispatcher";
}
