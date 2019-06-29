# 进程之间是如何通信的
- [常见的通信方式](https://www.cnblogs.com/LUO77/p/5816326.html)
- [程序间通信的各种途径及解析](https://www.cnblogs.com/wskaihd/archive/2009/07/22/1528471.html)

# 计算机网络简明教程
- [计算机网络简明教程及仿真实验](https://www.bilibili.com/video/av34135819/?p=5)


# IO中断
- 网卡中断



# question
- response 什么时间返回
- socket 返回过程
- 网卡工作原理


# linux
- 文件描述符

# accept
- jvm accept实现方式
    - Linux for
    - Linux accept

# 操作系统IO操作

# tcp/ip


-非阻塞I/O有一个缺点
    如果所有设备都一直没有数据到达，调用者需要反复查询做无用功，如果阻塞在那里，操作系统可以调度别的进程执行，就不会做无用功了。select(2) 函数可以阻塞地同时监视多个设备，还可以设定阻塞等待的超时时间，从而圆满地解决了这个问题。


- 搞懂select,poll,epoll区别
    - [聊聊IO多路复用之select、poll、epoll详解-区别](https://www.jianshu.com/p/dfd940e7fca2)
    - [Linux下的I/O复用与epoll详解](https://www.cnblogs.com/lojunren/p/3856290.html)



# 理解IO
    - 简明通信原理
    - 进程之间是如何通信的
    - TCP/IP
    - 操作系统架构
    - 操作系统中断
    - 网卡的工作方式
    - 网络编程
    - 文件描述符
    - Linux网络编程
    - select,poll,epoll
    - java NIO



# references
- [操作系统IO操作模式](https://blog.csdn.net/u012474535/article/details/80733118)
- [网络编程中Socket和TCP连接过程-学习笔记](https://blog.csdn.net/la745739773/article/details/91385275)
- [https://www.bilibili.com/video/av50961486](https://www.bilibili.com/video/av50961486)
- [Java NIO之Selector（选择器）](https://www.cnblogs.com/snailclimb/p/9086334.html)
- [Java BIO,NIO与AIO的区别](https://www.cnblogs.com/barrywxx/p/8430790.html)
- [一文让你彻底理解 Java NIO 核心组件](https://blog.csdn.net/javaxuexi123/article/details/81910644)
- [阿里面试必备之分析IO及NIO的底层原理](https://www.bilibili.com/video/av23594034/?spm_id_from=333.788.b_7265636f5f6c697374.4)
- [《操作系统》总结五（I/O管理）](https://blog.csdn.net/bigpudding24/article/details/48901473#t3)
- [操作系统IO模式整理](https://juejin.im/entry/5a72d7f36fb9a01ca8724e36)
- [C++网络通信中write和read的为什么会阻塞](https://blog.csdn.net/bian_qing_quan11/article/details/77853701)
- [Unix/Linux中的read和write函数](https://www.cnblogs.com/xiehongfeng100/p/4619451.html)
- [如何学习Java的NIO？](https://www.zhihu.com/question/29005375/answer/667616386)
- [理解socket connect和accept的实现细节](http://xiaorui.cc/2016/05/04/%E7%90%86%E8%A7%A3socket-connect%E5%92%8Caccept%E7%9A%84%E5%AE%9E%E7%8E%B0%E7%BB%86%E8%8A%82/)
- [从操作系统内核看Java非阻塞IO事件检测](https://blog.csdn.net/wangyangzhizhou/article/details/52573310)
- [Linux Socket编程（不限Linux）](https://www.cnblogs.com/skynet/archive/2010/12/12/1903949.html)
- [socket API 实现（四）—— accept 函数](http://blog.guorongfei.com/2014/10/29/socket-accept/)
- [浅谈Linux内存管理](https://zhuanlan.zhihu.com/p/67059173)
- [【Linux 内核网络协议栈源码剖析】accept 函数剖析](https://blog.csdn.net/wenqian1991/article/details/46794647)
- [linux阻塞和非阻塞原理](https://ezbcw.iteye.com/blog/2164778)
- [12.Redis的事件驱动（IO多路复用）](https://blog.csdn.net/u014590757/article/details/79860766)
- [Java IO多路复用技术详解](https://blog.csdn.net/weililansehudiefei/article/details/70885515)
- [系统间通讯方式之（Java NIO多路复用模式）（四）](https://blog.csdn.net/u010963948/article/details/78507255)
- [Java编程的艺术-NIO的原理](https://www.bilibili.com/video/av55255759?from=search&seid=9541834285236327097)