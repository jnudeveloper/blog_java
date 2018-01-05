package com.blog.handler;

import org.apache.thrift.TException;
import com.blog.thrift.service.MultiplicationService;

public class MultiplicationHandler implements MultiplicationService.Iface {

    public int multiply(int n1, int n2) throws TException {
        System.out.println("Multiply(" + n1 + "," + n2 + ")");
        return n1 * n2;
    }
}

