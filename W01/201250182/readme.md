# Java 高级程序设计 homework series one

## 201250182 郑义

> 节选片段 葫芦兄弟第一部P6 00:33 - 1:40
>
> https://www.bilibili.com/video/BV1zQ4y1d7dQ?p=6



出现人物：两只小怪、爷爷、刀枪不入的黄娃。

初始设定：

1. 小怪：
	1. 属性：血、攻击伤害、防御力、
	2. 行为：攻击、飞行、跳、说话、被绊倒(扣血)、受伤(扣血)、move
2. 爷爷：
	1. 属性：血、攻击伤害、防御力
	2. 行为：踢石头、说话。
3. 黄娃：
	1. 属性：血、攻击伤害、防御力。
	2. 行为：攻击、抢夺武器、move



片段叙述的故事：

1. 爷爷保护受伤的橙娃，被小怪追击
2. 黄娃前来保护爷爷。说：“来吧！”
3. 小怪1停了会说，看了一眼黄娃说：“你们跑不了啦”
4. 黄娃 跳下来。和小怪1开始打架。击中小怪两次
5. 小怪2过来帮忙(想要偷袭)。
6. 爷爷说：“当心”。踢石头，绊倒了小怪2。
7. 黄娃抢走了小怪1的武器。并踢倒了小怪1。
8. 黄娃大笑。
9. 小怪2飞过来和黄娃打架。逼迫黄娃倒退到悬崖。
10. 黄娃摔倒。武器丢失。
11. 小怪1搬起石头想要砸黄娃，被黄娃一拳打碎。石头砸到小怪2的鼻子（扣血）
12. 黄娃大笑。小怪2想要攻击黄娃。黄娃免疫伤害，并且夺过武器。
13. 黄娃踢飞小怪2，然后用武器杀死小怪2
14. 小怪1飞走逃跑



程序输出：

```java
batOne appear.
batTwo appear.
yellowBaby told batOne and batTwo, 来吧！
batOne listened 来吧！
batTwo listened 来吧！
batOne told yellowBaby and grandFather, 你们跑不了啦！
yellowBaby listened 你们跑不了啦！
grandFather listened 你们跑不了啦！
batTwo say: 啊啊啊啊啊啊啊啊...
yellowBaby say: 嗨呀呀呀呀呀呀呀呀呀呀！
背景音乐开始播放！
yellowBaby attacked batOne, and cause 20 damage
batOne has received 20 damage.
yellowBaby attacked batOne, and cause 20 damage
batOne has received 20 damage.
yellowBaby attacked batOne, and cause 20 damage
batOne has received 20 damage.
yellowBaby attacked batOne, and cause 20 damage
batOne has received 20 damage.
grandFather told yellowBaby,当心！
yellowBaby listened 当心！
grandFather kicked the stone to stumbled W01.com.Monster@1b6d3586
batTwo has received 10 damage.
batTwo say: Ouch! I am stumbled!
yellowBaby grab batOne's weapon,
yellowBaby 踢走了 batOne
yellowBaby say : 哈哈哈哈哈哈...
yellowBaby have weapon!
yellowBaby attacked batTwo, and cause 30 damage
batTwo has received 30 damage.
batTwo have weapon!
batTwo attacked yellowBaby, and cause 30 damage
yellowBaby has received 30 damage.
yellowBaby have weapon!
yellowBaby attacked batTwo, and cause 30 damage
batTwo has received 30 damage.
batTwo have weapon!
batTwo attacked yellowBaby, and cause 30 damage
yellowBaby has received 30 damage.
yellowBaby is at a disadvantage.
yellowBaby lose weapon!
batTwo say : 哈哈哈哈哈哈...
batOne throw the stone!
grandFather say: 哈....坏了
yellowBaby crush the stone!
batTwo has received 10 damage.
yellowBaby say : 哈哈哈哈哈哈...
yellowBaby 发动技能：金刚不坏之身！
batTwo have weapon!
yellowBaby grab batTwo's weapon,
batTwo has received 30 damage.
batTwo is dead!
batOne escape!
背景音乐暂停播放！batOne appear.
batTwo appear.
yellowBaby told batOne and batTwo, 来吧！
batOne listened 来吧！
batTwo listened 来吧！
batOne told yellowBaby and grandFather, 你们跑不了啦！
yellowBaby listened 你们跑不了啦！
grandFather listened 你们跑不了啦！
batTwo say: 啊啊啊啊啊啊啊啊...
yellowBaby say: 嗨呀呀呀呀呀呀呀呀呀呀！
背景音乐开始播放！
yellowBaby attacked batOne, and cause 20 damage
batOne has received 20 damage.
yellowBaby attacked batOne, and cause 20 damage
batOne has received 20 damage.
yellowBaby attacked batOne, and cause 20 damage
batOne has received 20 damage.
yellowBaby attacked batOne, and cause 20 damage
batOne has received 20 damage.
grandFather told yellowBaby,当心！
yellowBaby listened 当心！
grandFather kicked the stone to stumbled W01.com.Monster@1b6d3586
batTwo has received 10 damage.
batTwo say: Ouch! I am stumbled!
yellowBaby grab batOne's weapon,
yellowBaby 踢走了 batOne
yellowBaby say : 哈哈哈哈哈哈...
yellowBaby have weapon!
yellowBaby attacked batTwo, and cause 30 damage
batTwo has received 30 damage.
batTwo have weapon!
batTwo attacked yellowBaby, and cause 30 damage
yellowBaby has received 30 damage.
yellowBaby have weapon!
yellowBaby attacked batTwo, and cause 30 damage
batTwo has received 30 damage.
batTwo have weapon!
batTwo attacked yellowBaby, and cause 30 damage
yellowBaby has received 30 damage.
yellowBaby is at a disadvantage.
yellowBaby lose weapon!
batTwo say : 哈哈哈哈哈哈...
batOne throw the stone!
grandFather say: 哈....坏了
yellowBaby crush the stone!
batTwo has received 10 damage.
yellowBaby say : 哈哈哈哈哈哈...
yellowBaby 发动技能：金刚不坏之身！
batTwo have weapon!
yellowBaby grab batTwo's weapon,
batTwo has received 30 damage.
batTwo is dead!
batOne escape!
背景音乐暂停播放！
```



uml如下：

时序图：

![PlantUML diagram](http://www.plantuml.com/plantuml/png/hLL1Rn915BxFhvY4S_a174ZZmQiNRwQ70SP2kkoIPP1mMuAnxPfILej6azgAI4aiMeC618b_Pj-mdFmBZenX1j814fliWTdvtdlV-xx7szqY8ouhvIr4qinnSOgm1pR5CPTcr9k7PKT_Kw6MvPJlaLG5n-JlVnVxBh4pzmdBKXV7nA62CeIH52bId2yLSsc4PFgTH-AMKdilASy9J0e5IbmaQwbhULvSgy8xYqW8_EZBCR8THh6Rsy-o1ERd7w5nzVjdTJL0vDeGOE9N9Zc6HNEOPNFsGTn8T0MtQ3Yfc2mpiEXZGI2SN8RZwsWGXCEJSFGCcXsDJ5AJTVjWoKXhktq5h_objg7ft_h4ut5TEOsxIgFAm-ik1DwQ1w6v-KAib5MYUydvAO7dWwVLKMBgzVBE4xeCIbaaVQ2SuMTZE1pV4SJagwGX3ofOvybh_QXJXUeWQlMGPfZ9UMN2v2NygWd7z2YTe2GG3LlJYpwqlnafJiS-U2_G-ZRz5hH7lDU1DzsrG55kzk7THdV4D4ol0xDi8aSuzE7u1Eec_ILGwhzEOGcvgooREsi4qAZFF6yZaWTdGlTRUUcmS2Ya_ogbD-Ybz9Gs61F9IPXU3lMPMTaJHL9PdhFpKx4Sv58q-owqcRRgCl-sxc_6dGRWTxdlHRN94gVPOG17RyNQ-alkn_DezEa_9s3x0UT-azS74cYUNzuRXwFtkXqbgkLuUW57D_2vpxscySiX_WBHzvkPLnCBshG8dGBQfNP6V8N_0000)



类图：

![image-20210911183237833](../../../../../Typora Image/image-20210911183237833.png)