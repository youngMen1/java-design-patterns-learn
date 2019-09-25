package com.seal.observer.service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/9/25 16:22
 * @description
 **/
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
