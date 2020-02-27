简介：
    非关系型数据库NoSQL，本质上就是高性能键值对数据库。
    需要安装，windows和linux都支持，建议linux。
why redis
    传统的关系型数据库SQL面对以下问题有点力不从心：
       1.高并发读写（Hight Performance）
       2.海量数据的高效率存储和访问（Huge Storage）
       3.高可扩展性和高可用行（Hight Scalability && Hight Avaliability）
    非关系型数据库NoSQL可以解决传统的关系型数据库SQL面对的问题，
    目前NoSQL数据库有MongoDB、Redis等等  Redis目前主流
Redis 的特点
    易扩展
    灵活的数据模型
    大数据量，高性能
    高可用
Redis，支持的键值数据类型
    字符串类型
    列表类型
    有序集合类型
    散列类型
    集合类型
Redis 的应用场景
    缓存:通常就是用来做缓存。
    任务队列
    网站访问统计
    数据过期处理
    应用排行榜
    分布式集群架构中的session分离 
redis安装   
   准备工具：
       XSHell：是一个强大的终端模拟器，通过互联网连接到远程主机。简单的说就是在Windows下远程连接Linux主机、并对Linux主机进行操作的工具。
       VMware：虚拟机，安装centos7
       gcc：redis是c编写的，需要gcc作为c的编译器。 java的编译器是javac，jre包含javac。
   第一步：
        Vmware安装centos
        XShell连接到centos
   第二步：下载
        安装gcc
            yum -y install gcc-c++
        安装wget，linux下的ftp/http传输工具，可以把指定内容下载到当前路径，一般linux默认安装
            yum -y install wget
        下载redis
            wget http://download.redis.io/releases/redis-3.2.9.tar.gz
        解压下载的redis
            tar -zxvf redis-3.2.9.tar.gz
   第三步：编译和安装redis
        编译redis：进入到redis-3.2.9文件夹下
            cd redis-3.2.9
            make
        安装redis到/usr/local/redis
            make PREFIX=/usr/local/redis install
            在/usr/local/redis/bin目录下有以后要用到的各种工具
   第四步：启动和停止redis
        启动redis：
            redis目录下
            ./bin/redis-server
        停止redis
            ./bin/redis-cli shutdown   或者 关闭前台(默认关闭前台就停止redis，ctrl+c退出当前)
   第五步：redis配置
        取消默认关闭前台就停止redis，修改配置文件redis.conf，使其后台启动运行
           vi /usr/local/redis/redis.conf 
           / 搜索
           找到daemonize no，把no改成yes
           然后保存退出，esc退出 wq!保存。               
        查看redis服务
            ps -ef | grep -i redis
   第六步：连接redis，存储和获取数据
        进入到redis客户端
            ./bin/redis-cli
        存储数据
            set name java1234
        获取数据
            get name
        获取所有key
            keys *
        删除数据
            del name
        退出
            exit
            
            
        
       

   