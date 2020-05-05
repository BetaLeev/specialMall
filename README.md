第一次上传java的，不知道要忽略哪些，都上传过去了

http://127.0.0.1:8080/specialMail/user/register.do?name=test&password=100000&phone=100000 注册


http://127.0.0.1:8080/specialMail/user/login.do?name=test&password=100000 登录


http://127.0.0.1:8080/specialMail/user/queryById.do?id=25 根据ID查询用户

具体接口参数参数判断你自己添加吧


CREATE TABLE `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '自动排序序列',
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1

