package com.blog.server;

import com.blog.dao.PostMapper;
import com.blog.domain.Post;
import com.blog.thrift.service.*;
import org.apache.thrift.TException;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import com.blog.thrift.service.PostService;
import com.blog.handler.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

    private void start(){
        //加法
        AdditionService.Processor additionProcessor = new AdditionService.Processor<>(new AdditionHandler());

        //乘法
        MultiplicationService.Processor multiplicationProcessor = new MultiplicationService.Processor<>(new MultiplicationHandler());

        //Post Service
        PostService.Processor postProcessor = new PostService.Processor<>(new PostHandler());


        TMultiplexedProcessor processor = new TMultiplexedProcessor();
        processor.registerProcessor("AdditionService", additionProcessor);
        processor.registerProcessor("MultiplicationService", multiplicationProcessor);
        processor.registerProcessor("PostService", postProcessor);

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
        String springXML = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springXML);

        PostMapper postMapper = (PostMapper) applicationContext.getBean("postMapper");
        Post post = postMapper.findById(1);
        System.out.println(post);

//        Server server = new Server();
//        server.start();
    }
}
