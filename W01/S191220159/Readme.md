# 六娃智取妖精守卫

选取视频 <https://www.bilibili.com/video/BV1zQ4y1d7dQ?p=11>
第4:17~6:03的桥段

类型设计（建模）如下：

![charracter](http://www.plantuml.com/plantuml/png/NP6_J_im4CLt_nKPlz-X4gd4q0KLc11232bYG0oNv9fQYUtexi8F5VvtNDin3PdUvyNtNdBUiW39P8QYt9JhzKLvkL6g6O2vk45jk-Ae2lzKGYUmO51zpmTk2K4cmiMPbzV2e77q6Jnj9U7ZViyemUGHeT-vV_y33Pe5RGBZtZ39KJTzaYsvqSjSV2TeOgSGZEaG2zH9WdY_aKGrFZ6s6UvzRi0Sz-0i2r9Cx7zhXNJN0UN9oZVKPqaxNpwUyNMiNOPN-kCPZdaPB20J1vnu_jM3RcV91_SUn_DsLwklgtWPIeMqwCplbKhV_zS-RManl4NR-fl-0G00)

桥段场景如下：

![timeline](http://www.plantuml.com/plantuml/png/fLJVJzDG67s_VyLDzi2JJ0GrMQ8IOkAhQA8FneUEbQtGTRDhhUF1W3Zj1hgD7r4eYqI8J11PL7JCZlqplUtT4_-2NtSNkGCh4PSjsRtVwNVETthkxSC9JKjd8k6mOHZzKKcM_5__M2ePVYp5n5HuvDx0rEXGTY1sDJPw8trj4FNXIv7B5_5JF1WPkeBGS4OJL4rFoaWOqr8gPX-IsoNLMVWZP716Uc88kATCAokqiavo-mmHbGHbN8zAIXpMeLkgaEr1joiBr5hnlXnY1dy4G4EOwC138x8mDdcY-vf9LpUEyOOUJobnXiUXsxgQbaMCH4MJj6oN8RT0Dhvtm1EIdj1nwEvaTaJMnLxKGfxibZge63IRad3efg1Edi9Ho_AQPJPx6anK3J6AG_SJajQB8vjRxJTLraz8Yaft68IOOnSUW1LYzk7rhgO8TkTQTFz7SDrfjhobAa9ipUgY0W3EiGWcfJgnb__2idJerESGuXu2a3ybW9XGQ99_HLiMGfqrguDq7c1FuzCSR1t1xTKIRUpW4oHCRz30WIh-Mshkwrb2QFtzQLkvO76sSfk1Rw1Se7jvfAGq4QjIFA6XJcngCqVsEqX83FiLNb8WATz95iTP8x9eyjyZUzurosv-oMcySEhRtiS6YpliCtZHT6SFY5bpcklEpq-0WWfaqvqja5hHdTu-icSuLITVQVSe1AUJ0RXuietp6SdT5G2bUzyu5ts6TR9MfQqLyhn5FfjUPTeVnToX-pN88rakm2YzZLbQU9KiBkUY9yKz87FpYvvr04nkeU2jsLx5yYepuAVtxE0Vw8DjPiUJS_6E6Eln49gO3SVU39Y1kvHWXAqFf5X6w7Zl3mrzMHR4euZF32Ld2qja1FzEeH-qrtcO3cx7zijv21efRO4bmTU4-_QGDE7a3KFyzAJy2m00)

得到运行结果：

```
六娃 pick up 酒壶  
六娃 use 酒壶 to attarct 青蛙精  
酒壶 attract 青蛙精  
青蛙精 is attracted  
六娃 drop 酒壶  
青蛙精 move to 大门  
大门 open  
六娃 disappeared  
青蛙精 pick up 酒壶  
六娃 move to 大门  
青蛙精 move to 大门  
大门 close  
青蛙精 kick 酒壶 to attarct 蜈蚣精  
酒壶 attract 蜈蚣精  
蜈蚣精 is attracted  
蜈蚣精 tell 青蛙精'谁?'  
青蛙精 heard: 谁?  
青蛙精 tell 蜈蚣精'哈哈哈哈哈，我扔了个空酒壶，又惹到你们了，大惊小怪！'  
蜈蚣精 heard: 哈哈哈哈哈，我扔了个空酒壶，又惹到你们了，大惊小怪！  
六娃 pick up 钉子  
六娃 use 钉子 to attarct 蜈蚣精  
钉子 attract 蜈蚣精  
蜈蚣精 is attracted  
蜈蚣精 tell 蝙蝠兵'你在这儿守着，别走开啊！'  
蝙蝠兵 heard: 你在这儿守着，别走开啊！  
蜈蚣精 move to 钉子  
蜈蚣精 tell 蝙蝠兵'可别打盹！把眼睛睁大点！'  
蝙蝠兵 heard: 可别打盹！把眼睛睁大点！  
蜈蚣精 move to 钉子  
六娃 drop 钉子  
钉子 stab 蜈蚣精  
蜈蚣精 is stabbed  
蜈蚣精 triggar 蜘蛛网  
蜘蛛网 trap 蜈蚣精  
蜈蚣精 is trapped  
青蛙精 tell 蜈蚣精'哈哈，又掉进网里了吧！'  
蜈蚣精 heard: 哈哈，又掉进网里了吧！  
六娃 appeared
```
