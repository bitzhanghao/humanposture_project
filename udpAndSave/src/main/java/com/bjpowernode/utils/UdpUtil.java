package com.bjpowernode.utils;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpUtil
{
    private DatagramSocket socket;
    public UdpUtil(int port)
    {
        try
        {
            socket = new DatagramSocket(port); // 这个端口的信息可以随时调节
        } catch (SocketException e)
        {
            e.printStackTrace();
        }
    }

    // 这里定义发送接收的方法
    public String UdpReceive(DatagramSocket socket) throws IOException
    {
        int cnt = 0;
        byte[] data1 = new byte[1024]; // 定义好数据包读取的长度
        DatagramPacket packet = new DatagramPacket(data1,data1.length);
        socket.receive(packet); // 这样接收数据之后将数据存在packet中
        String ip = packet.getAddress().getHostAddress(); // 将获得的ip地址转换为String需要的格式
        if(cnt < 1)
        {
            cnt++;
            System.out.println("发送端的ip地址为 " + ip);
        }
        // 将packet包的数据进行解析
        byte[] data2 = packet.getData();
        String msg = new String(data2,0,data2.length);
        // System.out.println(msg);
        return msg;
    }

    public byte[] UdpReceiveByte(DatagramSocket socket) throws IOException
    {
        int cnt = 0;
        byte[] data1 = new byte[1024]; // 定义好数据包读取的长度
        DatagramPacket packet = new DatagramPacket(data1,data1.length);
        socket.receive(packet); // 这样接收数据之后将数据存在packet中
        String ip = packet.getAddress().getHostAddress(); // 将获得的ip地址转换为String需要的格式
        if(cnt < 1)
        {
            cnt++;
            System.out.println("发送端的ip地址为 " + ip);
        }
        // 将packet包的数据进行解析
        byte[] data2 = packet.getData();
        // String msg = new String(data2);
        // System.out.println(msg);
        return data2;
    }

    public String getMessage()
    {
        String msg = null;
        try
        {
            msg = this.UdpReceive(socket);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return msg;
    }
    public byte[] getMessageByte()
    {
        byte[] msg = new byte[1024];
        try
        {
            msg = this.UdpReceiveByte(socket);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return msg;
    }

}
