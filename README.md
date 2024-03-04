## 简介

基于Spring Cloud的在线购票系统，实现了用户注册、车票查询、车票下单以及支付等功能，底层采用缓存、消息队列及分库分表等技术支持海量用户购票和数据存储


## 系统架构

![架构图](https://images-machen.oss-cn-beijing.aliyuncs.com/image-20230802104007774.png)

## 目录结构

```
mallcloud
├─mallcloud-api -- 内网接口
│  ├─mallcloud-api-auth  -- 授权对内接口
│  ├─mallcloud-api-biz  -- biz对内接口
│  ├─mallcloud-api-leaf  -- 美团分布式id生成接口
│  ├─mallcloud-api-multishop  -- 店铺对内接口
│  ├─mallcloud-api-order  -- 订单对内接口
│  ├─mallcloud-api-platform  -- 平台对内接口
│  ├─mallcloud-api-product  -- 商品对内接口
│  ├─mallcloud-api-rbac  -- 用户角色权限对内接口
│  ├─mallcloud-api-search  -- 搜索对内接口
│  └─mallcloud-api-user  -- 用户对内接口
├─mallcloud-auth  -- 授权校验模块
├─mallcloud-biz  -- mallcloud 业务代码。如图片上传/短信等
├─mallcloud-common -- 一些公共的方法
│  ├─mallcloud-common-cache  -- 缓存相关公共代码
│  ├─mallcloud-common-core  -- 公共模块核心（公共中的公共代码）
│  ├─mallcloud-common-database  -- 数据库连接相关公共代码
│  ├─mallcloud-common-order  -- 订单相关公共代码
│  ├─mallcloud-common-product  -- 商品相关公共代码
│  ├─mallcloud-common-rocketmq  -- rocketmq相关公共代码
│  └─mallcloud-common-security  -- 安全相关公共代码
├─mallcloud-gateway  -- 网关
├─mallcloud-leaf  -- 基于美团leaf的生成id服务
├─mallcloud-multishop  -- 商家端
├─mallcloud-order  -- 订单服务
├─mallcloud-payment  -- 支付服务
├─mallcloud-platform  -- 平台端
├─mallcloud-product  -- 商品服务
├─mallcloud-rbac  -- 用户角色权限模块
├─mallcloud-search  -- 搜索模块
└─mallcloud-user  -- 用户服务
```