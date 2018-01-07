package com.blog.handler;

import org.apache.thrift.TException;
import com.blog.thrift.service.AdditionService;

public class AdditionHandler implements AdditionService.Iface  {

    public int add(int n1, int n2) throws TException {
        System.out.println("Add(" + n1 + "," + n2 + ")");
        return n1 + n2;
    }
}
