/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Viet
 */
//SecurityConfig giúp cấu hình các vai trò và các chức năng (các trang) được phép truy cập ứng với vai trò đó.
public class SecurityConfig {

    public static final String ROLE_MANAGER = "2";
    public static final String ROLE_CUSTOMER = "4";
    public static final String ROLE_ADMIN = "1";
    public static final String ROLE_STAFF = "3";
    private static final Map<String, List<String>> mapConfig = new HashMap<String, List<String>>();

    private static void init() {
        List<String> urlPattern1 = new ArrayList<String>();
        urlPattern1.add("/userinfo");
        urlPattern1.add("/homepage");
        urlPattern1.add("/register");
        mapConfig.put(ROLE_CUSTOMER, urlPattern1);

        List<String> urlPattern2 = new ArrayList<String>();
    }

    public static Set<String> getAllAppRoles() {
        return mapConfig.keySet();
    }

    public static List<String> getUrlPatternsForRole(String role) {
        return mapConfig.get(role);
    }
}
