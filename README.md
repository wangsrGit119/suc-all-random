#### 随机生成工具包
##### 为供测试或者数据库模拟数据方便，想便利大家，只需引入此jar就可以mock数据

##### 使用方式，引入一下依赖(记得选择最新版本)
```xml
    <dependency>
            <groupId>io.github.wangsrgit119.random.util</groupId>
            <artifactId>suc-all-random</artifactId>
            <version>1.0.0</version>
   </dependency>

```
##### 具体方法

----

#### 1.0.0版本功能

----

>随机生成位置信息 

```java
 RandomPersonInfoUtil.getRandomLocation()
```

>随机生成中文男女姓名
```java
 RandomPersonInfoUtil.getRandomChineseName()
```

>随机生成邮箱
```java
 RandomPersonInfoUtil.getEmail()
```

>随机生成时间
```java
 RandomPersonInfoUtil.randomDate()
```

>随机生成固定8位数
```java
  RandomPersonInfoUtil.getNumEndNum()
 ```

>随机生成11位手机号
```java
 RandomPersonInfoUtil.getRandomTelephoneNumber()
```

----

#### 1.0.1新增功能

----

>随机生成IP地址
```java
 RandomPersonInfoUtil.getRandomIpv4()
```

>随机生成网络协议
```java
 RandomPersonInfoUtil.getRandomProtocol()
```

>随机指定长度域名（不包括域名后缀长度）
```java
 RandomPersonInfoUtil.getRandomDomain(size)
```

>获取指定域名前缀长度的随机url（不包括域名后缀长度）
```java
 RandomPersonInfoUtil.getRandomUrl(size)
```