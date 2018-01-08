package com.blog.server;

import com.blog.handler.AdditionHandler;
import com.blog.thrift.service.AdditionService;
import org.apache.thrift.TException;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TServerTransport;
import com.blog.handler.MultiplicationHandler;
import com.blog.thrift.service.MultiplicationService;

public class Server {
//    private static MultiplicationHandler handler;
//    private static MultiplicationService.Processor processor;

//    public static void main(String [] args) {
//        try {
//            handler = new MultiplicationHandler();
//            processor = new MultiplicationService.Processor<MultiplicationHandler>(handler);
//            Runnable simple = new Runnable() {
//                public void run() {
//                    simple(processor);
//                }
//            };
//            new Thread(simple).start();
//        } catch (Exception x) {
//            x.printStackTrace();
//        }
//    }

//    private static void simple(MultiplicationService.Processor processor) {
//        try {
//            TServerTransport serverTransport = new TServerSocket(9090);
//            TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));
//            System.out.println("Starting the simple server...");
//            server.serve();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    private static void multiplicationServer(MultiplicationService.Processor processor) {
//        try {
//            TServerTransport serverTransport = new TServerSocket(9009);
//            TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
//            System.out.println("Starting the simple server...");
//            server.serve();
//        } catch (TException e){
//            e.printStackTrace();
//        }
//    }
//
//    // main function
//    public static void main(String [] args) {
//        handler = new MultiplicationHandler();
//        processor = new MultiplicationService.Processor<MultiplicationHandler>(handler);
//        Runnable server = new Runnable() {
//            public void run() {
//                multiplicationServer(processor);
//            }
//        };
//        new Thread(server).start();
//    }

    private void start(){
        //加法
        AdditionService.Processor additionProcessor = new AdditionService.Processor<>(new AdditionHandler());

        //乘法
        MultiplicationService.Processor multiplicationProcessor = new MultiplicationService.Processor<>(new MultiplicationHandler());

        TMultiplexedProcessor processor = new TMultiplexedProcessor();
        processor.registerProcessor("AdditionService", additionProcessor);
        processor.registerProcessor("MultiplicationService", multiplicationProcessor);

        Runnable server = new Runnable() {
            public void run() {
                startServer(processor);
            }
        };

        new Thread(server).start();

    }

    private static void startServer(TMultiplexedProcessor processor){
        try{
            TServerSocket serverTransport = new TServerSocket(7911);
            TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
            System.out.println("Starting server on port 7911...");

            server.serve();

        }catch (TTransportException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        Server server = new Server();
        server.start();
    }
}
