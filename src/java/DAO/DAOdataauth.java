/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Customer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Viet
 */
public class DAOdataauth {
    private static final Map<String, Customer> mapCus = new HashMap<String, Customer>();
    static {
        initUsers();
    }
    private static void initUsers(){
        
    }
}
