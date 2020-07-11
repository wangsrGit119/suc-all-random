#### 随机生成工具包
##### 为供测试或者数据库模拟数据方便，想便利大家，只需引入此jar就可以mock数据

##### 使用方式，引入一下依赖
```xml
    <dependency>
            <groupId>io.github.wangsrgit119.random.util</groupId>
            <artifactId>suc-all-random</artifactId>
            <version>1.0.0</version>
   </dependency>

```
##### 具体方法

>:hatched_chick:随机生成位置信息 

```java
 RandomPersonInfoUtil.getRandomLocation()
```

>:hatched_chick:随机生成中文男女姓名
```java
 RandomPersonInfoUtil.getRandomChineseName()
```

>:hatched_chick:随机生成邮箱
```java
 RandomPersonInfoUtil.getEmail()
```

>:hatched_chick:随机生成时间
```java
 RandomPersonInfoUtil.randomDate()
```

>:hatched_chick:随机生成固定8位数
```java
  RandomPersonInfoUtil.getNumEndNum()
 ```

>:hatched_chick:随机生成11位手机号
```java
 RandomPersonInfoUtil.getRandomTelephoneNumber()
```