JAVA-SpringBoot后端工程模板
==========================================

# 初始化项目

## IDEA

```shell
./gradlew idea
```

## eclipse

```shell
./gradlew eclipse
```

# 开发分支

使用Git flow 参考：[GitFlow](https://blog.csdn.net/xingbaozhen1210/article/details/81386269)

# 运行

run SpringBootApplication.java

如果报错 找不到或无法加载主类 参考
https://blog.csdn.net/bai_bug/article/details/79121109

# 构建&发布

## 构建

``` shell
./build.sh
```

## 发布

使用构建出的tar，上传至服务器指定的目录解压。

在目录运行脚本

```shell
./run.sh restart
```

# restful 接口命名规则

/服务名/模块名/端名/功能名

端名：app或者admin

例：

App服务/用户模块/运营后台/获取用户信息

/JfAppService/user/admin/getUserInfo

# restful 返回值规则

## 字段

code:返回码（必须），0成功，其他失败

time:返回时间（必须），服务器处理完成的时间

msg:响应信息（必须），解释code的意思

data:业务数据结构体

## 例子

```json
{
    "code": 0,
    "time": 1523847315,
    "msg": "成功!",
    "data": 
}
```

# 命名规则

## 包命名规则

* common 公共
  - const 常量
  - http 公共http封装

* 功能模块
    - app/admin 端名：app功能/运营后台
        - common 功能模块公共信息 如模块特有常量
        - repertory 仓库信息,包括mysql,redis,mc或者通过接口获取数据
            - db 访问数据层 - 只针对mysql
                - dao 数据库操作
                - entity PO类存放位置
                - service 数据库操作上层service抽象接口/类
                    - impl 实现
                - vo vo类存放位置
            - redis - 针对redis
                - 内部结构可参考上面
    
            - reference -针对通过接口获取数据
                - 内部结构可参考上面
    
            - mc - 针对mc
                - 内部结构可参考上面
        - exception 异常
        - thread 多线程编程类
        - service thrift接口实现类
        - controller restful接口实现类
            - vo vo类存放位置
        - utils 工具类
        - strategy 策略类
        
## 类命名规则

* app接口：

例：UserController 用户服务restful接口

* 运营后台功能加 Admin

例：UserAdminController 运营后台用户服务restful接口
        
# 测试用例

每个方法至少有一个测试用例

# 上线前准备

* 代码必须至少有一个人review
* 数据库变更提前准备好