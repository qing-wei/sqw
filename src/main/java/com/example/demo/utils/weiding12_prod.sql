/*
Navicat MySQL Data Transfer

Source Server         : 47.95.237.225
Source Server Version : 50722
Source Host           : 47.95.237.225:3306
Source Database       : weiding12

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-09-19 15:46:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for as_antifake_code
-- ----------------------------
DROP TABLE IF EXISTS `as_antifake_code`;
CREATE TABLE `as_antifake_code` (
  `ac_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'acid',
  `antifake_code` varchar(80) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '防伪码',
  `bar_code` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '条形码',
  `parent_af_code` varchar(80) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '大包防伪码',
  `parent_bar_code` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '大包条形码',
  `company_id` int(11) DEFAULT NULL COMMENT '公司ID',
  `team_id` int(11) DEFAULT NULL COMMENT '团队ID',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `goods_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商品名称',
  `goods_sku_id` int(11) DEFAULT NULL,
  `batch` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '产品批次',
  `box_num` int(11) DEFAULT NULL COMMENT '箱数',
  `amount_per_box` int(11) DEFAULT NULL COMMENT '每箱数量',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `trader` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '经销商',
  `trader_id` int(11) DEFAULT NULL,
  `trace_ability` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'traceability',
  `website` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'website',
  `pc_website` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weixin` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'weixin',
  `pc_weixin` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `first_query` datetime DEFAULT NULL COMMENT '首次查询时间',
  `update_query` datetime DEFAULT NULL COMMENT '最新查询时间',
  `query_time` int(11) DEFAULT NULL COMMENT '查询次数',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `flag` int(11) DEFAULT NULL COMMENT '是否启用',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=641 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='防伪码表';

-- ----------------------------
-- Table structure for as_antifake_code_gen
-- ----------------------------
DROP TABLE IF EXISTS `as_antifake_code_gen`;
CREATE TABLE `as_antifake_code_gen` (
  `ac_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'acid',
  `antifake_code` varchar(80) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '防伪码',
  `bar_code` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '条形码',
  `parent_af_code` varchar(80) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '大包防伪码',
  `parent_bar_code` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '大包条形码',
  `company_id` int(11) DEFAULT NULL COMMENT '公司ID',
  `team_id` int(11) DEFAULT NULL COMMENT '团队ID',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `goods_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商品名称',
  `goods_sku_id` int(11) DEFAULT NULL,
  `batch` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '产品批次',
  `box_num` int(11) DEFAULT NULL COMMENT '箱数',
  `amount_per_box` int(11) DEFAULT NULL COMMENT '每箱数量',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `trader` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '经销商',
  `trader_id` int(11) DEFAULT NULL,
  `trace_ability` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'traceability',
  `website` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'website',
  `pc_website` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weixin` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'weixin',
  `pc_weixin` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `first_query` datetime DEFAULT NULL COMMENT '首次查询时间',
  `update_query` datetime DEFAULT NULL COMMENT '最新查询时间',
  `query_time` int(11) DEFAULT NULL COMMENT '查询次数',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `flag` int(11) DEFAULT NULL COMMENT '是否启用',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=725 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='防伪码表';

-- ----------------------------
-- Table structure for bs_attr_name
-- ----------------------------
DROP TABLE IF EXISTS `bs_attr_name`;
CREATE TABLE `bs_attr_name` (
  `anid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `attr_name` varchar(50) DEFAULT NULL COMMENT '属性名',
  `category_id` int(11) DEFAULT NULL COMMENT '所属类别',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `value_type` int(11) DEFAULT NULL,
  `chief_name` varchar(20) DEFAULT NULL COMMENT '简称',
  `is_key` int(11) DEFAULT NULL COMMENT '是否关键属性',
  `is_spu` int(11) DEFAULT NULL COMMENT '是否spu',
  `is_sku` int(11) DEFAULT NULL COMMENT '是否sku',
  `is_enum` int(11) DEFAULT NULL COMMENT '是否枚举',
  `is_multchoice` int(11) DEFAULT NULL COMMENT '是否多选',
  `is_input` int(11) DEFAULT NULL COMMENT '是否输入',
  `is_display` int(11) DEFAULT NULL COMMENT '是否显示',
  `is_search` int(11) DEFAULT NULL COMMENT '是否搜索',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`anid`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4 COMMENT='商品属性表';

-- ----------------------------
-- Table structure for bs_attr_value
-- ----------------------------
DROP TABLE IF EXISTS `bs_attr_value`;
CREATE TABLE `bs_attr_value` (
  `avid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `attr_value` varchar(50) DEFAULT NULL COMMENT '属性值名称',
  `attr_id` int(11) DEFAULT NULL COMMENT '属性值ID',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`avid`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=utf8mb4 COMMENT='商品属性值表';

-- ----------------------------
-- Table structure for bs_brand
-- ----------------------------
DROP TABLE IF EXISTS `bs_brand`;
CREATE TABLE `bs_brand` (
  `bid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `brand_name` varchar(50) DEFAULT NULL COMMENT '品牌名称',
  `english_name` varchar(255) DEFAULT NULL COMMENT '英文名称',
  `org_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `org_name` varchar(50) DEFAULT NULL COMMENT '商家名称',
  `add_time` datetime DEFAULT NULL COMMENT '入住时间',
  `is_auth` int(11) DEFAULT NULL COMMENT '是否审核',
  `logo` varchar(255) DEFAULT NULL COMMENT 'logo',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8mb4 COMMENT='品牌';

-- ----------------------------
-- Table structure for bs_category
-- ----------------------------
DROP TABLE IF EXISTS `bs_category`;
CREATE TABLE `bs_category` (
  `catid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `category_name` varchar(100) DEFAULT NULL COMMENT '分类名称',
  `chief_name` varchar(50) DEFAULT NULL COMMENT '分类简称',
  `keywords` varchar(200) DEFAULT NULL COMMENT '分类关键字',
  `category_desc` varchar(255) DEFAULT NULL COMMENT '分类描述',
  `parent_id` int(11) DEFAULT NULL COMMENT '父ID',
  `parents_id` varchar(100) DEFAULT NULL COMMENT '父级递增ID',
  `grade` int(11) DEFAULT NULL COMMENT '级别',
  `sort_order` int(11) DEFAULT NULL COMMENT '排序',
  `measure_unit` varchar(20) DEFAULT NULL COMMENT '计量单位',
  `template_file` varchar(255) DEFAULT NULL COMMENT '模板地址',
  `category_icon` varchar(255) DEFAULT NULL COMMENT '分类图片',
  `link` varchar(255) DEFAULT NULL COMMENT 'link',
  `rate` int(11) DEFAULT NULL COMMENT 'rate',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(100) DEFAULT NULL COMMENT '备注',
  `is_show` int(11) DEFAULT NULL COMMENT '备用判断',
  `is_top` int(11) DEFAULT NULL COMMENT '备用判断2',
  `company_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  PRIMARY KEY (`catid`)
) ENGINE=InnoDB AUTO_INCREMENT=667 DEFAULT CHARSET=utf8mb4 COMMENT='商品分类表';

-- ----------------------------
-- Table structure for bs_goods
-- ----------------------------
DROP TABLE IF EXISTS `bs_goods`;
CREATE TABLE `bs_goods` (
  `gid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `goods_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `category_id` int(11) DEFAULT NULL COMMENT '所属分类',
  `goods_sn` varchar(60) DEFAULT NULL COMMENT '商品编码',
  `bar_code` varchar(60) DEFAULT NULL COMMENT '条码',
  `goods_name_style` varchar(50) DEFAULT NULL COMMENT '名称样式',
  `brand_id` int(11) DEFAULT NULL COMMENT '所属品牌',
  `provider_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `provider_name` varchar(50) DEFAULT NULL COMMENT '商家名称',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `trader_id` int(11) DEFAULT NULL COMMENT '总经销商ID',
  `cost_price` float DEFAULT NULL COMMENT '成本价',
  `market_price` float DEFAULT NULL COMMENT '市场价',
  `shop_price` float DEFAULT NULL COMMENT '运费价',
  `promote_price` float DEFAULT NULL COMMENT '促销价',
  `promote_start_date` datetime DEFAULT NULL COMMENT '促销开始时间',
  `promote_end_date` datetime DEFAULT NULL COMMENT '促销结束时间',
  `keywords` varchar(255) DEFAULT NULL COMMENT '关键字',
  `goods_brief` varchar(255) DEFAULT NULL COMMENT '商品介绍',
  `goods_desc` text COMMENT '商品详细',
  `goods_thumb` varchar(255) DEFAULT NULL COMMENT '商品缩略图',
  `goods_img` varchar(255) DEFAULT NULL COMMENT '商品正图',
  `goods_mobile_img` varchar(255) DEFAULT NULL COMMENT '商品移动图',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `add_user_id` int(11) DEFAULT NULL COMMENT '添加人',
  `is_onsale` int(11) DEFAULT NULL COMMENT '是否上架',
  `down_sale_time` datetime DEFAULT NULL,
  `on_sale_time` datetime DEFAULT NULL COMMENT '上架时间',
  `update_user_id` int(11) DEFAULT NULL COMMENT '变更人',
  `is_delete` int(11) DEFAULT NULL COMMENT '是否删除',
  `is_best` int(11) DEFAULT NULL COMMENT '是否首页',
  `is_hot` int(11) DEFAULT NULL COMMENT '是否热销',
  `is_promote` int(11) DEFAULT NULL COMMENT '是否促销',
  `is_integral` int(11) DEFAULT NULL COMMENT '是否积分',
  `integral` int(11) DEFAULT NULL COMMENT '积分点数',
  `commission_rate` float DEFAULT NULL COMMENT '佣金率',
  `is_check` int(11) DEFAULT NULL COMMENT '是否检查',
  `goods_tag` varchar(255) DEFAULT NULL COMMENT '商品标签',
  `goods_unit` varchar(20) DEFAULT NULL COMMENT '商品单位',
  `freight` float DEFAULT NULL COMMENT '运费',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `product` varchar(50) DEFAULT NULL COMMENT '产品表',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=168 DEFAULT CHARSET=utf8mb4 COMMENT='商品表';

-- ----------------------------
-- Table structure for bs_goods_album
-- ----------------------------
DROP TABLE IF EXISTS `bs_goods_album`;
CREATE TABLE `bs_goods_album` (
  `gaid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `goods_id` int(11) DEFAULT NULL COMMENT '所属商品',
  `pic_address` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `address_prefix` varchar(255) DEFAULT NULL COMMENT '图片地址前缀',
  `is_main` int(11) DEFAULT NULL COMMENT '是否主图',
  `is_cover` int(11) DEFAULT NULL COMMENT '是否封面',
  `detail_desc` varchar(255) DEFAULT NULL COMMENT '详细描述',
  `is_roll` int(11) DEFAULT NULL COMMENT '是否轮播图',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `thumb_address` varchar(255) DEFAULT NULL COMMENT '缩略图地址',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `add_time` datetime DEFAULT NULL COMMENT '添加日期',
  PRIMARY KEY (`gaid`)
) ENGINE=InnoDB AUTO_INCREMENT=1378 DEFAULT CHARSET=utf8mb4 COMMENT='商品图册表';

-- ----------------------------
-- Table structure for bs_goods_history
-- ----------------------------
DROP TABLE IF EXISTS `bs_goods_history`;
CREATE TABLE `bs_goods_history` (
  `gid` int(11) NOT NULL COMMENT 'id',
  `goods_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `category_id` int(11) DEFAULT NULL COMMENT '所属分类',
  `goods_sn` varchar(60) DEFAULT NULL COMMENT '商品编码',
  `bar_code` varchar(60) DEFAULT NULL COMMENT '条码',
  `goods_name_style` varchar(50) DEFAULT NULL COMMENT '名称样式',
  `brand_id` int(11) DEFAULT NULL COMMENT '所属品牌',
  `provider_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `provider_name` varchar(50) DEFAULT NULL COMMENT '商家名称',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `trader_id` int(11) DEFAULT NULL COMMENT '总经销商ID',
  `cost_price` float DEFAULT NULL COMMENT '成本价',
  `market_price` float DEFAULT NULL COMMENT '市场价',
  `shop_price` float DEFAULT NULL COMMENT '运费价',
  `promote_price` float DEFAULT NULL COMMENT '促销价',
  `promote_start_date` datetime DEFAULT NULL COMMENT '促销开始时间',
  `promote_end_date` datetime DEFAULT NULL COMMENT '促销结束时间',
  `keywords` varchar(255) DEFAULT NULL COMMENT '关键字',
  `goods_brief` varchar(255) DEFAULT NULL COMMENT '商品介绍',
  `goods_desc` text COMMENT '商品详细',
  `goods_thumb` varchar(255) DEFAULT NULL COMMENT '商品缩略图',
  `goods_img` varchar(255) DEFAULT NULL COMMENT '商品正图',
  `goods_mobile_img` varchar(255) DEFAULT NULL COMMENT '商品移动图',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `add_user_id` int(11) DEFAULT NULL COMMENT '添加人',
  `is_onsale` int(11) DEFAULT NULL COMMENT '是否上架',
  `down_sale_time` datetime DEFAULT NULL,
  `on_sale_time` datetime DEFAULT NULL COMMENT '上架时间',
  `update_user_id` int(11) DEFAULT NULL COMMENT '变更人',
  `is_delete` int(11) DEFAULT NULL COMMENT '是否删除',
  `is_best` int(11) DEFAULT NULL COMMENT '是否首页',
  `is_hot` int(11) DEFAULT NULL COMMENT '是否热销',
  `is_promote` int(11) DEFAULT NULL COMMENT '是否促销',
  `is_integral` int(11) DEFAULT NULL COMMENT '是否积分',
  `integral` int(11) DEFAULT NULL COMMENT '积分点数',
  `commission_rate` float DEFAULT NULL COMMENT '佣金率',
  `is_check` int(11) DEFAULT NULL COMMENT '是否检查',
  `goods_tag` varchar(255) DEFAULT NULL COMMENT '商品标签',
  `goods_unit` varchar(20) DEFAULT NULL COMMENT '商品单位',
  `freight` float DEFAULT NULL COMMENT '运费',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `product` varchar(50) DEFAULT NULL COMMENT '产品表',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品变更表';

-- ----------------------------
-- Table structure for bs_goods_sku
-- ----------------------------
DROP TABLE IF EXISTS `bs_goods_sku`;
CREATE TABLE `bs_goods_sku` (
  `gskid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sku_code` varchar(50) DEFAULT NULL COMMENT 'sku编码',
  `sku_name` varchar(200) DEFAULT NULL COMMENT 'sku名称',
  `goods_id` int(11) DEFAULT NULL COMMENT '所属商品',
  `number` int(11) DEFAULT NULL COMMENT '数量',
  `price` float DEFAULT NULL COMMENT '价格',
  `cost_price` float DEFAULT NULL COMMENT '成本价',
  `bar_code` varchar(100) DEFAULT NULL COMMENT '条码',
  `product_code` varchar(100) DEFAULT NULL COMMENT '产品编码',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `spec_id` int(11) DEFAULT NULL COMMENT '所属销售规格',
  `attr_id_set` text COMMENT 'sku属性ID集',
  `attr_value_set` text COMMENT 'sku属性值集',
  `is_default` int(11) DEFAULT NULL,
  PRIMARY KEY (`gskid`)
) ENGINE=InnoDB AUTO_INCREMENT=313 DEFAULT CHARSET=utf8mb4 COMMENT='商品SKU表';

-- ----------------------------
-- Table structure for bs_goods_spec
-- ----------------------------
DROP TABLE IF EXISTS `bs_goods_spec`;
CREATE TABLE `bs_goods_spec` (
  `gspid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `goods_id` int(11) DEFAULT NULL COMMENT '所属商品id',
  `attr_id` int(11) DEFAULT NULL COMMENT '属性名ID',
  `attr_value_id` int(11) DEFAULT NULL COMMENT '属性值ID',
  `value_type` int(11) DEFAULT NULL,
  `attr_value` varchar(200) DEFAULT NULL,
  `is_sku` int(11) DEFAULT NULL COMMENT '是否SKU',
  `sku_id` int(11) DEFAULT NULL COMMENT 'skuid',
  `add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `is_display` int(11) DEFAULT NULL COMMENT '是否显示',
  `is_key` int(11) DEFAULT NULL COMMENT '是否关键',
  `is_delete` int(11) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`gspid`)
) ENGINE=InnoDB AUTO_INCREMENT=323 DEFAULT CHARSET=utf8mb4 COMMENT='商品规格表';

-- ----------------------------
-- Table structure for bs_orders
-- ----------------------------
DROP TABLE IF EXISTS `bs_orders`;
CREATE TABLE `bs_orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_sn` varchar(100) DEFAULT NULL COMMENT '订单SN',
  `team_id` int(11) DEFAULT NULL COMMENT '所属网络',
  `p_user_id` int(11) DEFAULT NULL COMMENT '收款人',
  `c_user_id` int(11) DEFAULT NULL COMMENT '下单人',
  `payment_type` int(11) DEFAULT NULL COMMENT '支付方式 预留',
  `contact` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `order_amount` decimal(18,2) DEFAULT NULL COMMENT '订单金额',
  `other_pay` decimal(10,2) DEFAULT NULL COMMENT '活动优惠金额',
  `end_amount` decimal(18,2) DEFAULT NULL COMMENT '实际金额',
  `campaign_id` varchar(50) DEFAULT NULL COMMENT '参加活动编号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态 订单状态 0-未支付未审核 1-已支付未审核 2-已支付已审核 3-已拒绝已审核 4-预留 5-已发货未收货 6-确认收货 -1-已取消',
  `pay_status` int(11) DEFAULT NULL COMMENT '支付标志 0 未支付 1 已支付 2 ',
  `pay_comment` varchar(100) DEFAULT NULL COMMENT '支付说明',
  `payment_proof` varchar(255) DEFAULT NULL COMMENT '支付证明',
  `shipping_status` int(11) DEFAULT NULL COMMENT '配送状态',
  `shipping_address` varchar(255) DEFAULT NULL COMMENT '配送地址',
  `flag` int(11) DEFAULT NULL COMMENT '标志',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  `receiver` varchar(100) DEFAULT NULL COMMENT '收货人',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=836 DEFAULT CHARSET=utf8mb4 COMMENT='订单表';

-- ----------------------------
-- Table structure for bs_orders_action
-- ----------------------------
DROP TABLE IF EXISTS `bs_orders_action`;
CREATE TABLE `bs_orders_action` (
  `oaid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `order_id` int(11) DEFAULT NULL COMMENT '订单ID',
  `order_sn` varchar(100) DEFAULT NULL COMMENT '订单SN',
  `action_type` int(11) DEFAULT NULL COMMENT '执行类型',
  `action_name` varchar(50) DEFAULT NULL COMMENT '执行名称',
  `action_status` int(11) DEFAULT NULL COMMENT '执行状态',
  `action_time` datetime DEFAULT NULL COMMENT '执行时间',
  `action_address` varchar(200) DEFAULT NULL COMMENT '执行地点',
  `action_verify` varchar(255) DEFAULT NULL COMMENT '执行证据',
  `action_note` varchar(200) DEFAULT NULL COMMENT '执行说明',
  `action_sort` int(11) DEFAULT NULL COMMENT '执行序号',
  PRIMARY KEY (`oaid`)
) ENGINE=InnoDB AUTO_INCREMENT=454 DEFAULT CHARSET=utf8mb4 COMMENT='订单执行表';

-- ----------------------------
-- Table structure for bs_orders_items
-- ----------------------------
DROP TABLE IF EXISTS `bs_orders_items`;
CREATE TABLE `bs_orders_items` (
  `oiid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `order_id` int(11) DEFAULT NULL COMMENT '订单号',
  `order_sn` varchar(100) DEFAULT NULL COMMENT '订单SN',
  `services_user_id` int(11) DEFAULT NULL COMMENT '提供者ID',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `goods_sn` varchar(100) DEFAULT NULL COMMENT '商品SN',
  `sku_id` int(11) DEFAULT NULL COMMENT 'SKUID',
  `price_id` int(11) DEFAULT NULL COMMENT '控价ID',
  `unit_price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `unit_cost_price` decimal(10,2) DEFAULT NULL COMMENT '单位成本价',
  `end_price` decimal(10,2) DEFAULT NULL COMMENT '实际单价',
  `amount` int(11) DEFAULT NULL COMMENT '数量',
  `total` decimal(18,2) DEFAULT NULL COMMENT '总价',
  `is_discount` int(11) DEFAULT NULL COMMENT '是否优惠',
  `discount` decimal(10,2) DEFAULT NULL COMMENT '折扣',
  `compaign_id` varchar(50) DEFAULT NULL COMMENT '活动ID',
  `end_cost_total` decimal(18,2) DEFAULT NULL COMMENT '最终成本',
  `end_total` decimal(18,2) DEFAULT NULL COMMENT '最终总价',
  `goods_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `introduction` text COMMENT '商品描述',
  `img_url` varchar(255) DEFAULT NULL COMMENT '商品图片',
  PRIMARY KEY (`oiid`)
) ENGINE=InnoDB AUTO_INCREMENT=776 DEFAULT CHARSET=utf8mb4 COMMENT='订单明细表';

-- ----------------------------
-- Table structure for bs_price_complaint
-- ----------------------------
DROP TABLE IF EXISTS `bs_price_complaint`;
CREATE TABLE `bs_price_complaint` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `send_user_id` int(11) DEFAULT NULL COMMENT '发起人ID',
  `receiver_user_id` int(11) DEFAULT NULL COMMENT '接收人ID',
  `content` varchar(255) DEFAULT NULL COMMENT '投诉内容',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `is_feedback` int(11) DEFAULT NULL COMMENT '是否已反馈',
  `feedback` varchar(255) DEFAULT NULL COMMENT '反馈内容',
  `proof1` varchar(255) DEFAULT NULL COMMENT '投诉证据1',
  `proof2` varchar(255) DEFAULT NULL COMMENT '投诉证据2',
  `proof3` varchar(255) DEFAULT NULL COMMENT '投诉证据3',
  `addtime` datetime DEFAULT NULL COMMENT '投诉时间',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `endtime` datetime DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='控价投诉表';

-- ----------------------------
-- Table structure for bs_price_control
-- ----------------------------
DROP TABLE IF EXISTS `bs_price_control`;
CREATE TABLE `bs_price_control` (
  `pcid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `goods_sku_id` int(11) DEFAULT NULL COMMENT '商品SKUID',
  `rank_id` int(11) DEFAULT NULL COMMENT '网络等级编号',
  `rank` int(11) DEFAULT NULL,
  `price` float DEFAULT NULL COMMENT '价格',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `add_time` datetime DEFAULT NULL COMMENT '设置时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`pcid`)
) ENGINE=InnoDB AUTO_INCREMENT=1790 DEFAULT CHARSET=utf8mb4 COMMENT='商品控价表';

-- ----------------------------
-- Table structure for bs_price_control_history
-- ----------------------------
DROP TABLE IF EXISTS `bs_price_control_history`;
CREATE TABLE `bs_price_control_history` (
  `pcid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `goods_sku_id` int(11) DEFAULT NULL COMMENT '商品SKUID',
  `rank_id` int(11) DEFAULT NULL COMMENT '网络等级编号',
  `price` float DEFAULT NULL COMMENT '价格',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `add_time` datetime DEFAULT NULL COMMENT '设置时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`pcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品控价变更表';

-- ----------------------------
-- Table structure for bs_rebate_record
-- ----------------------------
DROP TABLE IF EXISTS `bs_rebate_record`;
CREATE TABLE `bs_rebate_record` (
  `rrid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'rrid',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `trader_id` int(11) DEFAULT NULL COMMENT '获益推荐人',
  `source_trader_id` int(11) DEFAULT NULL COMMENT '来源人',
  `type` int(11) DEFAULT NULL COMMENT '类型  1 金谷粒返利 2 订单返利',
  `rebate_mode` int(11) DEFAULT NULL COMMENT '返利计算模式  1 按百分比 2 按金额 ',
  `order_id` int(11) DEFAULT NULL COMMENT '订单ID',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `base_amount` decimal(18,2) DEFAULT NULL COMMENT '基数金额',
  `sheme_id` int(11) DEFAULT NULL COMMENT '返利方案ID',
  `rebate_level` int(11) DEFAULT NULL COMMENT '返利级别  1 1级 2 2级  3 3级',
  `rebate` float DEFAULT NULL COMMENT '返利数',
  `rebate_amount` decimal(18,2) DEFAULT NULL COMMENT '返利金额',
  `reason` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '理由',
  `add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `auditor` int(11) DEFAULT NULL COMMENT '审核人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `payer` int(11) DEFAULT NULL COMMENT '支付人',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `comment` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `status` int(11) DEFAULT NULL COMMENT '状态  0未审核 1已审核 未支付 2 已审核 已支付   -1 过期',
  PRIMARY KEY (`rrid`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='经销商返利记录表';

-- ----------------------------
-- Table structure for bs_rebate_scheme
-- ----------------------------
DROP TABLE IF EXISTS `bs_rebate_scheme`;
CREATE TABLE `bs_rebate_scheme` (
  `rsid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `scheme_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '方案名称',
  `org_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `type` int(11) DEFAULT NULL COMMENT '类型  1 金谷粒返利 2 订单返利',
  `rebate_mode` int(11) DEFAULT NULL COMMENT '返利计算模式  1 按百分比 2 按金额 ',
  `rebate_level_num` int(11) DEFAULT NULL COMMENT '返利层级数  默认3 ',
  `precondition` int(11) DEFAULT NULL COMMENT '条件标志  0 无条件 1 有条件',
  `satisfy_condition` int(11) DEFAULT NULL COMMENT '满足条件 ',
  `reason` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '理由',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态  0 未启用 1启用    -1 过期',
  `comment` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `exeinfo` int(11) DEFAULT NULL COMMENT '执行',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`rsid`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='返利方案表';

-- ----------------------------
-- Table structure for bs_rebate_scheme_goods
-- ----------------------------
DROP TABLE IF EXISTS `bs_rebate_scheme_goods`;
CREATE TABLE `bs_rebate_scheme_goods` (
  `grsid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'grsid',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `rsid` int(11) DEFAULT NULL COMMENT '当前返利方案ID',
  `status` int(11) DEFAULT NULL COMMENT '状态  0 未启用 1启用    -1 过期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`grsid`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='团队商品返利方案关系表';

-- ----------------------------
-- Table structure for bs_rebate_scheme_item
-- ----------------------------
DROP TABLE IF EXISTS `bs_rebate_scheme_item`;
CREATE TABLE `bs_rebate_scheme_item` (
  `rsiid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'rsiid',
  `scheme_id` int(11) DEFAULT NULL COMMENT '所属方案',
  `item_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '名称',
  `type` int(11) DEFAULT NULL COMMENT '类型  1 金谷粒返利 2 订单返利',
  `precondition` int(11) DEFAULT NULL COMMENT '条件标志  0 无条件 1 有条件',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `rebate_level` int(11) DEFAULT NULL COMMENT '返利级别  1 1级 2 2级  3 3级',
  `rebate` float DEFAULT NULL COMMENT '返利数',
  `status` int(11) DEFAULT NULL COMMENT '状态  0 未启用 1启用    -1 过期',
  PRIMARY KEY (`rsiid`)
) ENGINE=InnoDB AUTO_INCREMENT=196 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='返利方案明细表';

-- ----------------------------
-- Table structure for bs_retail
-- ----------------------------
DROP TABLE IF EXISTS `bs_retail`;
CREATE TABLE `bs_retail` (
  `retail_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `com_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `trader_id` int(11) DEFAULT NULL COMMENT '经销商ID',
  `purchaser` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '购买人',
  `goods_id` int(11) DEFAULT NULL COMMENT '购买商品ID',
  `goods_sku_id` int(11) DEFAULT NULL COMMENT '商品SKUID',
  `unit_price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `unit_cost` decimal(10,2) DEFAULT NULL COMMENT '单位成本',
  `amount` int(11) DEFAULT NULL COMMENT '数量',
  `total` decimal(18,2) DEFAULT NULL COMMENT '总价',
  `is_discount` int(11) DEFAULT NULL COMMENT '是否优惠',
  `discount` decimal(10,2) DEFAULT NULL COMMENT '折扣',
  `end_cost_total` decimal(18,2) DEFAULT NULL COMMENT '最终成本',
  `end_total` decimal(18,2) DEFAULT NULL COMMENT '最终总价',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`retail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='零售';

-- ----------------------------
-- Table structure for ms_im_user
-- ----------------------------
DROP TABLE IF EXISTS `ms_im_user`;
CREATE TABLE `ms_im_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `im_user_id` int(11) DEFAULT NULL COMMENT '用户ID(微商Id)',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名称',
  `password` varchar(200) DEFAULT NULL COMMENT '密码',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `token` varchar(256) DEFAULT NULL COMMENT 'token',
  `add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) DEFAULT NULL COMMENT 'status',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_key` (`im_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=611 DEFAULT CHARSET=utf8mb4 COMMENT='IM用户表';

-- ----------------------------
-- Table structure for ms_media_data
-- ----------------------------
DROP TABLE IF EXISTS `ms_media_data`;
CREATE TABLE `ms_media_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'med_id',
  `topic_id` int(11) DEFAULT NULL COMMENT '素材主题ID',
  `trader_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `type` int(11) DEFAULT NULL COMMENT '媒体类型 1 图片 2 视频 3 声音',
  `media_path` varchar(255) DEFAULT NULL COMMENT '媒体相对路径',
  `thumb_path` varchar(255) DEFAULT NULL COMMENT '缩略图相对地址',
  `media_url` varchar(255) DEFAULT NULL COMMENT '媒体地址',
  `thumb_url` varchar(255) DEFAULT NULL COMMENT '缩略图地址',
  `introduce` varchar(500) DEFAULT NULL COMMENT '媒体介绍',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `comment` varchar(200) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `cover_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=336 DEFAULT CHARSET=utf8mb4 COMMENT='媒体素材库';

-- ----------------------------
-- Table structure for ms_media_topic
-- ----------------------------
DROP TABLE IF EXISTS `ms_media_topic`;
CREATE TABLE `ms_media_topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'mtid',
  `master_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `content` varchar(500) DEFAULT NULL COMMENT '素材内容',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8mb4 COMMENT='媒体素材库主题表';

-- ----------------------------
-- Table structure for ms_media_trader
-- ----------------------------
DROP TABLE IF EXISTS `ms_media_trader`;
CREATE TABLE `ms_media_trader` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `topic_id` int(11) DEFAULT NULL COMMENT '媒体ID',
  `trader_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `is_read` int(11) DEFAULT NULL COMMENT '是否查看',
  `add_time` datetime DEFAULT NULL COMMENT '分享时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=249 DEFAULT CHARSET=utf8mb4 COMMENT='媒体用户表';

-- ----------------------------
-- Table structure for ms_message_config
-- ----------------------------
DROP TABLE IF EXISTS `ms_message_config`;
CREATE TABLE `ms_message_config` (
  `id` int(11) NOT NULL COMMENT 'ID',
  `type` int(1) DEFAULT NULL COMMENT '类型 1系统 2用户注册 3订单提醒 4公告提醒 5 日志提醒 6充值提醒 7 提现提醒 8 直播提醒',
  `type_name` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `func_type` int(11) DEFAULT NULL COMMENT '功能类型',
  `func_type_name` varchar(50) DEFAULT NULL COMMENT '功能类型名称',
  `content_temple` varchar(500) DEFAULT NULL COMMENT '内容模板',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  `temple_address` varchar(255) DEFAULT NULL COMMENT '模板地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='消息配置表';

-- ----------------------------
-- Table structure for ms_message_queue
-- ----------------------------
DROP TABLE IF EXISTS `ms_message_queue`;
CREATE TABLE `ms_message_queue` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `biz_type` int(11) DEFAULT NULL COMMENT '业务类型 1系统 2用户注册 3订单提醒 4公告提醒 5 日志提醒 6充值提醒 7 提现提醒',
  `sender_id` int(11) DEFAULT NULL COMMENT '发送者 系统0',
  `receiver_id` int(11) DEFAULT NULL COMMENT '接收者',
  `title` varchar(200) DEFAULT NULL COMMENT '消息标题',
  `message` varchar(500) DEFAULT NULL COMMENT '消息内容',
  `biz_id` int(11) DEFAULT NULL COMMENT '业务ID',
  `add_time` datetime DEFAULT NULL COMMENT '发送时间',
  `is_send` int(11) DEFAULT NULL COMMENT '发送标志：0-未发送；1-发送成功；2-发送失败',
  `send_time` datetime DEFAULT NULL COMMENT '发送时间',
  `is_readed` int(11) DEFAULT NULL COMMENT '是否已读',
  `read_time` datetime DEFAULT NULL COMMENT '阅读时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `type` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2318 DEFAULT CHARSET=utf8mb4 COMMENT='消息队列表';

-- ----------------------------
-- Table structure for ms_notice
-- ----------------------------
DROP TABLE IF EXISTS `ms_notice`;
CREATE TABLE `ms_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sender_id` int(11) DEFAULT NULL COMMENT '发布人ID',
  `title` varchar(100) DEFAULT NULL COMMENT '公告标题',
  `content` text COMMENT '公告内容',
  `cover_thumb` varchar(255) DEFAULT NULL COMMENT '封面缩略图',
  `cover_pic` varchar(255) DEFAULT NULL COMMENT '封面正图',
  `add_time` datetime DEFAULT NULL COMMENT '发布时间',
  `team_id` int(11) DEFAULT NULL COMMENT '所属网络',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='公告表';

-- ----------------------------
-- Table structure for ms_notice_album
-- ----------------------------
DROP TABLE IF EXISTS `ms_notice_album`;
CREATE TABLE `ms_notice_album` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `notice_id` int(11) DEFAULT NULL COMMENT '公告ID',
  `type` int(11) DEFAULT NULL COMMENT '图片类型 1 封面 2 普通附件',
  `pic_address` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `comment` varchar(50) DEFAULT NULL COMMENT '附言',
  `addtime` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='公告图片表';

-- ----------------------------
-- Table structure for ms_notice_trader
-- ----------------------------
DROP TABLE IF EXISTS `ms_notice_trader`;
CREATE TABLE `ms_notice_trader` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `notice_id` int(11) DEFAULT NULL COMMENT '公告ID',
  `receiver_id` int(11) DEFAULT NULL COMMENT '微商ID',
  `is_read` int(11) DEFAULT NULL COMMENT '是否阅读',
  `read_time` datetime DEFAULT NULL COMMENT '阅读时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='公告阅读人表';

-- ----------------------------
-- Table structure for ms_smssendinfo
-- ----------------------------
DROP TABLE IF EXISTS `ms_smssendinfo`;
CREATE TABLE `ms_smssendinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sender` varchar(30) DEFAULT NULL COMMENT '发送人 默认"系统“',
  `receiveMobile` varchar(20) DEFAULT NULL COMMENT '接收手机号',
  `content` varchar(100) DEFAULT NULL COMMENT '内容',
  `addtime` datetime DEFAULT NULL COMMENT '发送时间',
  `status` int(11) DEFAULT NULL COMMENT '状态 0未成功发送 1 已成功发送',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  `msg_id` varchar(50) DEFAULT NULL,
  `caller_identity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='短信发送表';

-- ----------------------------
-- Table structure for ms_system_notice
-- ----------------------------
DROP TABLE IF EXISTS `ms_system_notice`;
CREATE TABLE `ms_system_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '消息标题',
  `content` varchar(1024) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '消息内容',
  `pic` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '图片',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `creat_time` datetime DEFAULT NULL COMMENT '添加时间',
  `push_time` datetime DEFAULT NULL COMMENT '发布时间',
  `expire_time` datetime DEFAULT NULL COMMENT '过期时间',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `user_id` int(11) DEFAULT NULL COMMENT '后台添加人',
  `priority` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='平台系统消息表';

-- ----------------------------
-- Table structure for ms_task
-- ----------------------------
DROP TABLE IF EXISTS `ms_task`;
CREATE TABLE `ms_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sender_id` int(11) DEFAULT NULL COMMENT '日志人',
  `type` int(11) DEFAULT NULL COMMENT '日志类型 1 日报 2 周报 3 月报 ',
  `task_goal` varchar(255) DEFAULT NULL COMMENT '任务目标',
  `execution` varchar(200) DEFAULT NULL COMMENT '完成情况',
  `next` varchar(255) DEFAULT NULL COMMENT '下一步',
  `comment` varchar(255) DEFAULT NULL COMMENT '备注',
  `pic_thumb` varchar(255) DEFAULT NULL COMMENT '首张缩略图',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `add_time` datetime DEFAULT NULL COMMENT '日志日期',
  `update_time` datetime DEFAULT NULL,
  `replyed_id` int(11) DEFAULT NULL COMMENT '所回复的日志id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8mb4 COMMENT='日志表';

-- ----------------------------
-- Table structure for ms_task_album
-- ----------------------------
DROP TABLE IF EXISTS `ms_task_album`;
CREATE TABLE `ms_task_album` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `log_id` int(11) DEFAULT NULL COMMENT '日志ID',
  `type` int(11) DEFAULT NULL COMMENT '图片类型 1 封面 2 普通附件',
  `pic_address` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `comment` varchar(50) DEFAULT NULL COMMENT '附言',
  `addtime` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='日志图片表';

-- ----------------------------
-- Table structure for ms_task_trader
-- ----------------------------
DROP TABLE IF EXISTS `ms_task_trader`;
CREATE TABLE `ms_task_trader` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `task_id` int(11) DEFAULT NULL COMMENT '日志ID',
  `trader_id` int(11) DEFAULT NULL COMMENT '微商ID',
  `is_read` int(11) DEFAULT NULL COMMENT '是否阅读',
  `read_time` datetime DEFAULT NULL COMMENT '阅读时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `is_reply` int(11) DEFAULT NULL COMMENT '是否已回复',
  `reply_time` datetime DEFAULT NULL COMMENT '回复时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=133 DEFAULT CHARSET=utf8mb4 COMMENT='日志阅读人表';

-- ----------------------------
-- Table structure for ps_log
-- ----------------------------
DROP TABLE IF EXISTS `ps_log`;
CREATE TABLE `ps_log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `description` varchar(100) DEFAULT NULL COMMENT '操作描述',
  `username` varchar(20) DEFAULT NULL COMMENT '操作用户',
  `spend_time` int(11) DEFAULT NULL COMMENT '消耗时间',
  `base_path` varchar(500) DEFAULT NULL COMMENT '根路径',
  `uri` varchar(500) DEFAULT NULL COMMENT 'URI',
  `url` varchar(500) DEFAULT NULL COMMENT 'URL',
  `method` varchar(10) DEFAULT NULL COMMENT '请求类型',
  `parameter` mediumtext,
  `user_agent` varchar(500) DEFAULT NULL COMMENT '用户标识',
  `ip` varchar(30) DEFAULT NULL COMMENT 'IP地址',
  `result` mediumtext,
  `permissions` varchar(100) DEFAULT NULL COMMENT '权限值',
  `start_time` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='操作日志';

-- ----------------------------
-- Table structure for ps_organization
-- ----------------------------
DROP TABLE IF EXISTS `ps_organization`;
CREATE TABLE `ps_organization` (
  `organization_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `pid` int(10) DEFAULT NULL COMMENT '所属上级',
  `name` varchar(20) DEFAULT NULL COMMENT '组织名称',
  `description` varchar(1000) DEFAULT NULL COMMENT '组织描述',
  `ctime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`organization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='组织';

-- ----------------------------
-- Table structure for ps_permission
-- ----------------------------
DROP TABLE IF EXISTS `ps_permission`;
CREATE TABLE `ps_permission` (
  `permission_id` int(10) unsigned NOT NULL COMMENT '编号',
  `system_id` int(10) unsigned NOT NULL COMMENT '所属系统',
  `pid` int(10) DEFAULT NULL COMMENT '所属上级',
  `name` varchar(20) DEFAULT NULL COMMENT '名称',
  `type` tinyint(4) DEFAULT NULL COMMENT '类型(1:目录,2:菜单,3:按钮)',
  `permission_value` varchar(50) DEFAULT NULL COMMENT '权限值',
  `uri` varchar(100) DEFAULT NULL COMMENT '路径',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态(0:禁止,1:正常)',
  `ctime` datetime DEFAULT NULL COMMENT '创建时间',
  `orders` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='权限';

-- ----------------------------
-- Table structure for ps_role
-- ----------------------------
DROP TABLE IF EXISTS `ps_role`;
CREATE TABLE `ps_role` (
  `role_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `title` varchar(20) DEFAULT NULL COMMENT '角色标题',
  `description` varchar(1000) DEFAULT NULL COMMENT '角色描述',
  `ctime` datetime DEFAULT NULL COMMENT '创建时间',
  `orders` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色';

-- ----------------------------
-- Table structure for ps_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `ps_role_permission`;
CREATE TABLE `ps_role_permission` (
  `role_permission_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `permission_id` int(10) unsigned NOT NULL COMMENT '权限编号',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`role_permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色权限关联表';

-- ----------------------------
-- Table structure for ps_system
-- ----------------------------
DROP TABLE IF EXISTS `ps_system`;
CREATE TABLE `ps_system` (
  `system_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `icon` varchar(50) DEFAULT NULL COMMENT '图标',
  `banner` varchar(150) DEFAULT NULL COMMENT '背景',
  `theme` varchar(50) DEFAULT NULL COMMENT '主题',
  `basepath` varchar(100) DEFAULT NULL COMMENT '根目录',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态(-1:黑名单,1:正常)',
  `name` varchar(20) DEFAULT NULL COMMENT '系统名称',
  `title` varchar(20) DEFAULT NULL COMMENT '系统标题',
  `description` varchar(300) DEFAULT NULL COMMENT '系统描述',
  `ctime` datetime DEFAULT NULL COMMENT '创建时间',
  `orders` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`system_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统';

-- ----------------------------
-- Table structure for ps_user
-- ----------------------------
DROP TABLE IF EXISTS `ps_user`;
CREATE TABLE `ps_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(20) NOT NULL COMMENT '帐号',
  `password` varchar(32) NOT NULL COMMENT '密码MD5(密码+盐)',
  `salt` varchar(32) DEFAULT NULL COMMENT '盐',
  `realname` varchar(20) DEFAULT NULL COMMENT '姓名',
  `avatar` varchar(150) DEFAULT NULL COMMENT '头像',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别',
  `locked` tinyint(4) DEFAULT NULL COMMENT '状态(0:正常,1:锁定)',
  `ctime` datetime DEFAULT NULL COMMENT '创建时间',
  `isSuper` tinyint(1) DEFAULT '0' COMMENT '是否超级管理员',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='用户';

-- ----------------------------
-- Table structure for ps_user_organization
-- ----------------------------
DROP TABLE IF EXISTS `ps_user_organization`;
CREATE TABLE `ps_user_organization` (
  `user_organization_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `organization_id` int(10) unsigned NOT NULL COMMENT '组织编号',
  PRIMARY KEY (`user_organization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户组织关联表';

-- ----------------------------
-- Table structure for ps_user_permission
-- ----------------------------
DROP TABLE IF EXISTS `ps_user_permission`;
CREATE TABLE `ps_user_permission` (
  `user_permission_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `permission_id` int(10) unsigned NOT NULL COMMENT '权限编号',
  `type` tinyint(4) DEFAULT NULL COMMENT '权限类型(-1:减权限,1:增权限)',
  PRIMARY KEY (`user_permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COMMENT='用户权限关联表';

-- ----------------------------
-- Table structure for ps_user_role
-- ----------------------------
DROP TABLE IF EXISTS `ps_user_role`;
CREATE TABLE `ps_user_role` (
  `user_role_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `role_id` int(10) DEFAULT NULL COMMENT '角色编号',
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户角色关联表';

-- ----------------------------
-- Table structure for ss_gold_grain
-- ----------------------------
DROP TABLE IF EXISTS `ss_gold_grain`;
CREATE TABLE `ss_gold_grain` (
  `ggid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `trader_id` int(11) DEFAULT NULL COMMENT '经销商ID',
  `import_total` decimal(18,2) DEFAULT NULL COMMENT '收入总额',
  `output_total` decimal(18,2) DEFAULT NULL COMMENT '支出总额',
  `balance` decimal(18,2) DEFAULT NULL COMMENT '余额',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL COMMENT '更新日期',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ggid`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='金谷粒表';

-- ----------------------------
-- Table structure for ss_gold_grain_detail
-- ----------------------------
DROP TABLE IF EXISTS `ss_gold_grain_detail`;
CREATE TABLE `ss_gold_grain_detail` (
  `ggdid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `trader_id` int(11) DEFAULT NULL COMMENT '所属经销商',
  `opposite__id` int(11) DEFAULT NULL COMMENT '对方账户ID',
  `order_id` int(11) DEFAULT NULL COMMENT '凭据ID',
  `type` int(11) DEFAULT NULL COMMENT '收支类型  1收入  2 支出',
  `brief` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '摘要',
  `clazz` int(11) DEFAULT NULL COMMENT '业务类型 1充值  2 支付',
  `amount` decimal(18,2) DEFAULT NULL COMMENT '数量',
  `before_amount` decimal(18,2) DEFAULT NULL COMMENT '之前数量',
  `after_amount` decimal(18,2) DEFAULT NULL COMMENT '之后数量',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ggdid`)
) ENGINE=InnoDB AUTO_INCREMENT=442 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='金谷粒详情表';

-- ----------------------------
-- Table structure for ss_goods_store
-- ----------------------------
DROP TABLE IF EXISTS `ss_goods_store`;
CREATE TABLE `ss_goods_store` (
  `gsid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `trader_id` int(11) DEFAULT NULL COMMENT '经销商ID',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `goods_sku_id` int(11) DEFAULT NULL COMMENT '商品SKUID',
  `quantity` int(11) DEFAULT NULL COMMENT '库存数量',
  `import_quantity` int(11) DEFAULT NULL COMMENT '收入总数',
  `output_quantity` int(11) DEFAULT NULL COMMENT '支出总数',
  `first_enter_date` datetime DEFAULT NULL COMMENT '第一次入库时间',
  `last_leave_date` datetime DEFAULT NULL COMMENT '最近一次出库时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`gsid`)
) ENGINE=InnoDB AUTO_INCREMENT=212 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='经销商库存表';

-- ----------------------------
-- Table structure for ss_goods_store_detail
-- ----------------------------
DROP TABLE IF EXISTS `ss_goods_store_detail`;
CREATE TABLE `ss_goods_store_detail` (
  `gsdid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `trader_id` int(11) DEFAULT NULL COMMENT '经销商ID',
  `opposite_trader_id` int(11) DEFAULT NULL COMMENT '对方ID',
  `order_id` int(11) DEFAULT NULL COMMENT '凭据ID',
  `type` int(11) DEFAULT NULL COMMENT '收支类型 1 收入  2 支出',
  `brief` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '摘要',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `goods_sku_id` int(11) DEFAULT NULL COMMENT '商品SKUID',
  `before_quantity` int(11) DEFAULT NULL COMMENT '之前数量',
  `after_quantity` int(11) DEFAULT NULL COMMENT '之后数量',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`gsdid`)
) ENGINE=InnoDB AUTO_INCREMENT=478 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='经销商库存详情表';

-- ----------------------------
-- Table structure for ss_org_stockpile
-- ----------------------------
DROP TABLE IF EXISTS `ss_org_stockpile`;
CREATE TABLE `ss_org_stockpile` (
  `stockpile_id` int(11) NOT NULL COMMENT 'id',
  `org_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `warehouse_id` int(11) DEFAULT NULL COMMENT '所在仓库',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品ID',
  `goods_sku_id` int(11) DEFAULT NULL COMMENT '商品SKUID',
  `import_quantity` int(11) DEFAULT NULL COMMENT '收入数量',
  `output_quantity` int(11) DEFAULT NULL COMMENT '支出数量',
  `quantity` int(11) DEFAULT NULL COMMENT '库存数量',
  `first_enter_date` datetime DEFAULT NULL COMMENT '第一次入库时间',
  `last_leave_date` datetime DEFAULT NULL COMMENT '最近一次出库时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`stockpile_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='厂商库存表';

-- ----------------------------
-- Table structure for ss_org_storepile_detail
-- ----------------------------
DROP TABLE IF EXISTS `ss_org_storepile_detail`;
CREATE TABLE `ss_org_storepile_detail` (
  `gsdid` int(11) NOT NULL,
  `org_id` int(11) DEFAULT NULL,
  `wid` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `brief` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `goods_sku_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`gsdid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='厂商库存详情表';

-- ----------------------------
-- Table structure for ss_org_warehouse
-- ----------------------------
DROP TABLE IF EXISTS `ss_org_warehouse`;
CREATE TABLE `ss_org_warehouse` (
  `wid` int(11) NOT NULL COMMENT 'id',
  `org_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `org_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '厂商名称',
  `warehouse_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '仓库名称',
  `chiefname` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '简称',
  `address_1` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '地址1',
  `position_num` int(11) DEFAULT NULL COMMENT '仓位数',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='厂商仓库表';

-- ----------------------------
-- Table structure for ts_organization
-- ----------------------------
DROP TABLE IF EXISTS `ts_organization`;
CREATE TABLE `ts_organization` (
  `org_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `pid` int(11) DEFAULT NULL COMMENT '所属上级',
  `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '组织名称',
  `description` varchar(1000) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '组织描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `chief_name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '简称',
  `type` int(11) DEFAULT NULL COMMENT '类型 1普通商家 2 特殊商家',
  `biz_license_num` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '营业执照号码 三证合一号码',
  `bank_num` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '银行开户号码',
  `area1` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '地址 省',
  `area2` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '地址 地区 市',
  `area3` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '地址 县 三级地址',
  `area4` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '地址 详细地址',
  `legal_person` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '法人',
  `legal_person_ID` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '法人身份证号码',
  `contact_person` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '联系人',
  `contact_person_phone` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '联系人手机号码',
  `contact_person_email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '联系人email',
  `contact_person_address` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '联系人地址',
  `license_pic` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '营业执照照片',
  `license_pic2` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `legal_person_pic` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '法人身份证照片',
  `legal_person_pic2` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `other_pic` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '其他照片',
  `other_pic2` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `logo_pic` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `source` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='组织';

-- ----------------------------
-- Table structure for us_account
-- ----------------------------
DROP TABLE IF EXISTS `us_account`;
CREATE TABLE `us_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `identity_type` int(1) DEFAULT NULL COMMENT '账号类型',
  `identifier` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户标识',
  `credential` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '密码凭证',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '变更时间',
  `status` int(1) NOT NULL DEFAULT '0' COMMENT '状态',
  `is_binded` int(1) DEFAULT NULL COMMENT '是否绑定 1绑定 0 未绑定',
  `source` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '来源(app,web,ios,android)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=587 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='登陆用户账号';

-- ----------------------------
-- Table structure for us_app_version
-- ----------------------------
DROP TABLE IF EXISTS `us_app_version`;
CREATE TABLE `us_app_version` (
  `app_id` int(11) NOT NULL COMMENT 'appID',
  `app_name` varchar(50) DEFAULT NULL COMMENT 'app名字',
  `app_code` varchar(80) DEFAULT NULL COMMENT 'app代码',
  `version_type` varchar(20) DEFAULT NULL COMMENT '版本类型  01 IOS  02 android ',
  `version_code` varchar(80) DEFAULT NULL COMMENT '版本号',
  `version_code_before` varchar(80) DEFAULT NULL COMMENT '版本上一版本',
  `version_name` varchar(50) DEFAULT NULL COMMENT '版本名称',
  `channel` varchar(500) DEFAULT NULL COMMENT '渠道代码 全部 all  多个渠道已“，”分割',
  `version_size` int(11) DEFAULT NULL COMMENT '版本大小',
  `download_url` varchar(255) DEFAULT NULL COMMENT '下载地址',
  `update_title` varchar(100) DEFAULT NULL COMMENT '升级提示标题',
  `update_detail` varchar(500) DEFAULT NULL COMMENT '升级提示详情',
  `status` int(11) DEFAULT NULL COMMENT '状态 0选择更新，1强制更新,-1 预制',
  `add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='app版本表';

-- ----------------------------
-- Table structure for us_certificate
-- ----------------------------
DROP TABLE IF EXISTS `us_certificate`;
CREATE TABLE `us_certificate` (
  `cert_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `trader_id` int(11) DEFAULT NULL COMMENT '微商ID',
  `team_id` int(11) DEFAULT NULL COMMENT '团队ID',
  `goods_id` int(11) DEFAULT NULL COMMENT '授权产品',
  `brand_id` int(11) DEFAULT NULL COMMENT '授权品牌',
  `org_id` int(11) DEFAULT NULL COMMENT '授权厂商',
  `lisencor_id` int(11) DEFAULT NULL COMMENT '授权人',
  `cert_code` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '授权码',
  `create_time` datetime DEFAULT NULL COMMENT '申请时间',
  `approve_time` datetime DEFAULT NULL COMMENT '批准时间',
  `start_time` datetime DEFAULT NULL COMMENT '授权开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '授权结束时间',
  `status` int(1) DEFAULT NULL COMMENT '状态 1审核中 2拒绝 3通过',
  `certificate` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cert_id`)
) ENGINE=InnoDB AUTO_INCREMENT=205 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='微商授权表';

-- ----------------------------
-- Table structure for us_certificate_album
-- ----------------------------
DROP TABLE IF EXISTS `us_certificate_album`;
CREATE TABLE `us_certificate_album` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `cert_id` int(11) DEFAULT NULL COMMENT '授权ID',
  `type` int(11) DEFAULT NULL COMMENT '图片类型 1 普通  2 附件',
  `pic_address` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `comment` varchar(50) DEFAULT NULL COMMENT '附言',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=162 DEFAULT CHARSET=utf8mb4 COMMENT='微商授权图片表';

-- ----------------------------
-- Table structure for us_fake_complain
-- ----------------------------
DROP TABLE IF EXISTS `us_fake_complain`;
CREATE TABLE `us_fake_complain` (
  `compid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `trader_id` int(11) DEFAULT NULL COMMENT '投诉人ID',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `goodsid` int(11) DEFAULT NULL COMMENT '商品ID',
  `refuserid` int(11) DEFAULT NULL COMMENT '被投诉人ID 相关人ID',
  `title` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '标题',
  `content` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '投诉内容',
  `imgaddress1` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '投诉图片1',
  `imgaddress2` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '投诉图片2',
  `imgaddress3` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '投诉图片3',
  `addtime` datetime DEFAULT NULL COMMENT '投诉时间',
  `status` int(11) DEFAULT NULL COMMENT '状态 ',
  `incharge` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '负责人ID',
  `handle_time` datetime DEFAULT NULL COMMENT '处理时间',
  `handlecontent` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '处理结果',
  `comment` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`compid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Table structure for us_group
-- ----------------------------
DROP TABLE IF EXISTS `us_group`;
CREATE TABLE `us_group` (
  `group_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `master_id` int(11) DEFAULT NULL COMMENT '群主ID',
  `group_name` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '群组名称',
  `type` int(1) DEFAULT NULL COMMENT '群组类型 1 队伍群  2 聊天群',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `cancel_time` datetime DEFAULT NULL COMMENT '解散时间',
  `status` int(1) DEFAULT NULL COMMENT '群组状态',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=226 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='我的群组';

-- ----------------------------
-- Table structure for us_group_member
-- ----------------------------
DROP TABLE IF EXISTS `us_group_member`;
CREATE TABLE `us_group_member` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `group_id` int(11) DEFAULT NULL COMMENT '群组ID',
  `trader_id` int(11) DEFAULT NULL COMMENT '微商ID',
  `create_time` datetime DEFAULT NULL COMMENT '加入时间',
  `dismiss_time` datetime DEFAULT NULL COMMENT '离开时间',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `is_master` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=737 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='微商群组成员表';

-- ----------------------------
-- Table structure for us_group_notice
-- ----------------------------
DROP TABLE IF EXISTS `us_group_notice`;
CREATE TABLE `us_group_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `group_id` int(11) DEFAULT NULL COMMENT '群ID',
  `notice` varchar(512) DEFAULT NULL COMMENT '群公告',
  `add_time` datetime DEFAULT NULL COMMENT '创建时间',
  `comment` varchar(50) DEFAULT NULL COMMENT '备注',
  `is_last` int(1) DEFAULT NULL COMMENT '是否最新一条',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COMMENT='群组公告';

-- ----------------------------
-- Table structure for us_invite_code
-- ----------------------------
DROP TABLE IF EXISTS `us_invite_code`;
CREATE TABLE `us_invite_code` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `invite_code` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'invitecode',
  `trader_id` int(11) DEFAULT NULL COMMENT '邀请人ID',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `rank` int(1) DEFAULT NULL COMMENT '邀请级别',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `expired_time` datetime DEFAULT NULL COMMENT '失效时间',
  `pic_address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1585 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='邀请码';

-- ----------------------------
-- Table structure for us_message_code
-- ----------------------------
DROP TABLE IF EXISTS `us_message_code`;
CREATE TABLE `us_message_code` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mobile` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'mobile',
  `code` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'code',
  `create_time` datetime DEFAULT NULL COMMENT '生成时间',
  `status` int(1) DEFAULT NULL COMMENT '生成时间 1发送 0未发送',
  `expired_time` datetime DEFAULT NULL COMMENT '失效时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1044 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='短信验证码';

-- ----------------------------
-- Table structure for us_org_user
-- ----------------------------
DROP TABLE IF EXISTS `us_org_user`;
CREATE TABLE `us_org_user` (
  `ouid` int(11) NOT NULL AUTO_INCREMENT,
  `org_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`ouid`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Table structure for us_region
-- ----------------------------
DROP TABLE IF EXISTS `us_region`;
CREATE TABLE `us_region` (
  `region_id` varchar(6) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '行政区划编号',
  `parent_id` varchar(6) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '行政区划父编号',
  `region_name` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '行政区划名称',
  `region_type` int(1) DEFAULT NULL COMMENT '行政区划级别，1：省，2：市，3：县',
  PRIMARY KEY (`region_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Table structure for us_system_settings
-- ----------------------------
DROP TABLE IF EXISTS `us_system_settings`;
CREATE TABLE `us_system_settings` (
  `sid` int(11) NOT NULL COMMENT 'sid',
  `platform` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '平台',
  `system` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '系统',
  `version` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '版本号',
  `channel` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '渠道',
  `type` int(11) DEFAULT NULL COMMENT '类型',
  `setting_key` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '参数名称',
  `setting_value` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '参数值',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态 1启用 0不启用',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统设置表';

-- ----------------------------
-- Table structure for us_team
-- ----------------------------
DROP TABLE IF EXISTS `us_team`;
CREATE TABLE `us_team` (
  `team_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `team_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '团队名称',
  `org_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '所属公司名称',
  `org_id` int(11) DEFAULT NULL COMMENT '所属公司',
  `type` int(1) DEFAULT NULL COMMENT '类型  1普通团队 2 内部团队',
  `level_num` int(1) DEFAULT NULL COMMENT '级别数',
  `alias` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '简称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `flag` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'flag',
  PRIMARY KEY (`team_id`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='销售团队';

-- ----------------------------
-- Table structure for us_team_rank
-- ----------------------------
DROP TABLE IF EXISTS `us_team_rank`;
CREATE TABLE `us_team_rank` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `rank_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '等级名称',
  `chief_name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '简称',
  `rank` int(1) DEFAULT NULL COMMENT '等级',
  `is_leaf` int(1) DEFAULT NULL COMMENT '是否叶子节点',
  PRIMARY KEY (`id`),
  UNIQUE KEY `KEY_TEAM_RANK` (`team_id`,`rank`)
) ENGINE=InnoDB AUTO_INCREMENT=395 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='团队等级';

-- ----------------------------
-- Table structure for us_trader
-- ----------------------------
DROP TABLE IF EXISTS `us_trader`;
CREATE TABLE `us_trader` (
  `trader_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '微商ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队ID',
  `rank` int(1) DEFAULT NULL COMMENT '网络级别',
  `parent_id` int(11) DEFAULT NULL COMMENT '上级ID',
  `nick_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '昵称',
  `avatar` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '头像',
  `inviter_id` int(11) DEFAULT NULL COMMENT '邀请人ID',
  `inviter_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邀请人姓名',
  `invite_code` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邀请码',
  `invite_type` int(1) DEFAULT NULL COMMENT '来源类型 1邀请 0平级推荐',
  `create_time` datetime DEFAULT NULL COMMENT '注册时间',
  `modified_time` datetime DEFAULT NULL COMMENT '更新时间',
  `end_time` datetime DEFAULT NULL COMMENT '注销时间',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `grant_code` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '授权编号',
  `is_pass` int(1) DEFAULT NULL COMMENT '备用状态',
  `is_default_team` int(1) DEFAULT NULL COMMENT '是否默认团队 1是 0 否',
  `rank1_id` int(11) DEFAULT NULL COMMENT '所属总代理id',
  PRIMARY KEY (`trader_id`)
) ENGINE=InnoDB AUTO_INCREMENT=544 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='微商身份';

-- ----------------------------
-- Table structure for us_trader_address
-- ----------------------------
DROP TABLE IF EXISTS `us_trader_address`;
CREATE TABLE `us_trader_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `trader_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `province` varchar(6) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '所属地区',
  `city` varchar(6) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '所属市县',
  `area` varchar(6) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '详细地址',
  `receiver` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_default` int(1) DEFAULT '0' COMMENT '默认(0,1默认)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=371 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='地址';

-- ----------------------------
-- Table structure for us_trader_application
-- ----------------------------
DROP TABLE IF EXISTS `us_trader_application`;
CREATE TABLE `us_trader_application` (
  `app_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '微商申请记录ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队ID',
  `rank` int(11) DEFAULT NULL COMMENT '网络级别',
  `parent_id` int(11) DEFAULT NULL COMMENT '上级ID',
  `avatar` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '头像',
  `nick_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '昵称',
  `inviter_id` int(11) DEFAULT NULL COMMENT '邀请人ID',
  `inviter_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邀请人姓名',
  `invite_code` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邀请码',
  `invite_type` int(1) DEFAULT NULL COMMENT '来源类型 1邀请 0 平级推荐',
  `create_time` datetime DEFAULT NULL COMMENT '申请时间',
  `modified_time` datetime DEFAULT NULL COMMENT '更新时间',
  `end_time` datetime DEFAULT NULL COMMENT '审核时间',
  `status` int(11) NOT NULL COMMENT '状态 0 待审核  1审核通过  2 审核拒绝',
  `comment` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `source_type` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '来源方式   市场活动代码 渠道代码',
  `trader_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`app_id`)
) ENGINE=InnoDB AUTO_INCREMENT=434 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='微商申请记录表';

-- ----------------------------
-- Table structure for us_trader_settings
-- ----------------------------
DROP TABLE IF EXISTS `us_trader_settings`;
CREATE TABLE `us_trader_settings` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `trader_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `skey` varchar(16) DEFAULT NULL,
  `svalue` varchar(16) DEFAULT NULL,
  `set_time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='设置';

-- ----------------------------
-- Table structure for us_trader_upgrade
-- ----------------------------
DROP TABLE IF EXISTS `us_trader_upgrade`;
CREATE TABLE `us_trader_upgrade` (
  `upgrade_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `trader_id` int(11) DEFAULT NULL COMMENT '微商ID',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `pre_rank` int(11) DEFAULT NULL COMMENT '升级前级别',
  `pre_parent_id` int(11) DEFAULT NULL COMMENT '升级前父ID',
  `rank` int(11) DEFAULT NULL COMMENT '升级级别',
  `grantor_id` int(11) DEFAULT NULL COMMENT '审批人',
  `apply_time` datetime DEFAULT NULL COMMENT '申请时间',
  `approve_time` datetime DEFAULT NULL COMMENT '批准时间',
  PRIMARY KEY (`upgrade_id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='微商升级表';

-- ----------------------------
-- Table structure for us_upgrade
-- ----------------------------
DROP TABLE IF EXISTS `us_upgrade`;
CREATE TABLE `us_upgrade` (
  `upgrade_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `trader_id` int(11) DEFAULT NULL COMMENT '微商ID',
  `team_id` int(11) DEFAULT NULL COMMENT '所属团队',
  `pre_rank` int(11) DEFAULT NULL COMMENT '升级前级别',
  `pre_parent_id` int(11) DEFAULT NULL COMMENT '升级前父ID',
  `rank` int(11) DEFAULT NULL COMMENT '升级级别',
  `grantor_id` int(11) DEFAULT NULL COMMENT '审批人',
  `apply_time` datetime DEFAULT NULL COMMENT '申请时间',
  `approve_time` datetime DEFAULT NULL COMMENT '批准时间',
  PRIMARY KEY (`upgrade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='微商升级表';

-- ----------------------------
-- Table structure for us_user
-- ----------------------------
DROP TABLE IF EXISTS `us_user`;
CREATE TABLE `us_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `password` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '密码',
  `real_name` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '姓名',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` varchar(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '性别 男 女',
  `phone` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `card_id` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '身份证号',
  `id_front` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '身份证正面',
  `id_back` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '身份证背面',
  `id_hand` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '身份证手持',
  `is_real_auth` int(1) DEFAULT '0' COMMENT '实名认证',
  `is_wx_binded` int(1) DEFAULT '0' COMMENT '微信绑定',
  `is_qq_binded` int(1) DEFAULT '0' COMMENT 'qq绑定',
  `province` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '所属地区省级',
  `city` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '所属地区地区级',
  `area` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '所属地区县级',
  `address` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '详细地址',
  `create_time` datetime DEFAULT NULL COMMENT '注册时间',
  `modified_time` datetime DEFAULT NULL COMMENT '更新时间',
  `end_time` datetime DEFAULT NULL COMMENT '注销时间',
  `status` int(1) DEFAULT NULL COMMENT '状态 1 正常  -1 注销',
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `user_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `comment` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `is_pass` int(1) DEFAULT NULL COMMENT '备用状态',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=521 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户表';

-- ----------------------------
-- Table structure for us_user_feedback
-- ----------------------------
DROP TABLE IF EXISTS `us_user_feedback`;
CREATE TABLE `us_user_feedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `content` varchar(512) DEFAULT NULL COMMENT '反馈内容',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COMMENT='反馈';
