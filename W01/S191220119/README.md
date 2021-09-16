# 捕风捉影
191220119 王毓琦

## 视频选段
选取[第10集 捕风捉影](https://www.bilibili.com/video/BV1zQ4y1d7dQ?p=10)当中6:59～8:11的片段

## 类型设计
示意图如下：

![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/ricky9w/jwork-2021/main/W01/S191220119/uml/characters.pu)

所有物体均抽象为 `Being` 类，生物为 `Creatrue` 类，情节中涉及的道具为 `Prob` 类，对于这一片段，本片段中道具就包括武器 `Weapon` 类和普通的石头 `Stone` 类

`Human` 有体力 `energy` ，体力会对人的动作及其效果带来影响

`Monster` 有蓝条 `magic` ，蓝条空了对 `Monster` 的攻击也会产生影响

attack()方法可以接收可选参数 `weapon` ，使用武器可以为攻击带来加成。使用**函数重载**的方式实现了对可选参数的支持

## 桥段场景
示意图如下：

![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/ricky9w/jwork-2021/main/W01/S191220119/uml/timeline.pu)

## 运行结果
```
六娃 said to 癞蛤蟆: 哈哈哈你来抓我吧，抓不着我了吧，我在这呢，哈哈哈
癞蛤蟆 heard 哈哈哈你来抓我吧，抓不着我了吧，我在这呢，哈哈哈
癞蛤蟆 said to 六娃: 好哇，你往哪里跑！
六娃 heard 好哇，你往哪里跑！
癞蛤蟆 attack 六娃 with 三叉戟 of 1 points
蜈蚣精 said to 六娃: 看你往哪走
六娃 heard 看你往哪走
蜈蚣精 said to 蜈蚣精: 诶，在哪呢
蜈蚣精 heard 诶，在哪呢
六娃 said to 蜈蚣精: 我在这呢
蜈蚣精 heard 我在这呢
六娃 attack 蜈蚣精 with 石头 of 2 points
蜈蚣精 am attacked of 2 points
蜈蚣精 said to 六娃: 我的妈呀，你饶了我吧
六娃 heard 我的妈呀，你饶了我吧
六娃 attack 蜈蚣精 with 狼牙棒 of 4 points
蜈蚣精 am attacked of 4 points
六娃 said to 蜈蚣精: 你们这些妖精，无恶不作，捉了我兄弟，害我爷爷，我今天要好好教训你们这群混蛋
蜈蚣精 heard 你们这些妖精，无恶不作，捉了我兄弟，害我爷爷，我今天要好好教训你们这群混蛋
```
