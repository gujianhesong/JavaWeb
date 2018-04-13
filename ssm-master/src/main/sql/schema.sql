-- 创建反馈表
CREATE TABLE `feedback` (
  `_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `appPackage` varchar(100) NOT NULL COMMENT 'App包名',
  `content` TEXT NOT NULL COMMENT '反馈内容',
  `createTime` LONG NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='反馈表';

-- 初始化反馈数据
INSERT INTO `feedback` (`appPackage`, `content`, `createTime`)
VALUES
	('com.pinery.reader', '还有很多不足', 10),
	('com.pinery.eye', '好用，喜欢', 10),
	('com.pinery.reader', '还好', 10);
