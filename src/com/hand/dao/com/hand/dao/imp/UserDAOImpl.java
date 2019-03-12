package com.hand.dao.com.hand.dao.imp;

import com.hand.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

    @Override
    public int getInt() {
        return 1521;
    }

    public static  void getCheng(){
        System.out.println("你是个qipa" +
                "");
    }
    public static void main(String []args){
        getCheng();
    }
}
