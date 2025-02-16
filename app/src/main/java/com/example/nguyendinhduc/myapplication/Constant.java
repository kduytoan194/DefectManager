package com.example.nguyendinhduc.myapplication;

/**
 * Created by nguyendinhduc on 11/8/15.
 */
public class Constant {
    public static final int ADMIN_ROLE = 0;
    public static final int MANAGER_ROLE = 1;
    public static final int QUALITY_CONTROL_ROLE = 2;
    public static final int DEVELOPER_ROLE = 3;

    public static final int PROJECT_STATUS_STABLE = 0;
    public static final int PROJECT_STATUS_RELEASE = 3;
    public static final int PROJECT_STATUS_DEVELOPMENT = 1;
    public static final int PROJECT_STATUS_TEST = 2;

    public static final String PROJECT_TABLE = "Project";
    public static final String PROJECT_ID = "objectId";
    public static final String PROJECT_NAME = "projectName";
    public static final String PROJECT_DESCRIPTION = "description";
    public static final String PROJECT_STATUS = "projectStatus";
    public static final String PROJECT_USER = "userID";
    public static final String PRJECT_CATEGORY = "categoryID";

    public static final String CATEGORY_TABLE = "Category";
    public static final String CATEGORY_ID = "objectId";
    public static final String CATEGORY_NAME = "categoryName";
    public static final String CATEGORY_BRANCH = "branch";
    public static final String CATEGORY_VERSION = "version";

    public static final String USER_TABLE = "_User";
    public static final String USER_ID = "objectId";
    public static final String USER_NAME = "username";
    public static final String USER_EMAIL = "email";
    public static final String USER_FULLNAME = "fullname";
    public static final String USER_ACCESS_LEVEL = "accessLv";
}
