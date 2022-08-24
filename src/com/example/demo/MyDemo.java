package com.example.demo;

import com.example.exception.MyException;

public class MyDemo {
    private int balance;

    public MyDemo(int balance){
        this.balance = balance;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int myBalance() throws MyException {
        if(balance < 1000){
            //generate exception
            //MyException myException = new MyException("Low Balance");

            // throw the exception

                throw new MyException("Low Balance");

        }
        return balance;
    }
}
