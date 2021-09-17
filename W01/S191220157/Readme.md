

# W01 张嘉麒191220157

## 选取视频

​	https://www.bilibili.com/video/BV1zQ4y1d7dQ?p=8 中7:43-9:54的桥段

## 类型设计（建模）

​	http://www.plantuml.com/plantuml/png/TLDFJnD15B_FfvY4CqdF7WmduraF7eo71XTjBBkaRasubT92krRNfOX5Mw56I0M55T5GkdO_ZFjcbbE_Wh_PwRObA7cPXD_i-_rvyxhmtCuMxE9odcKNRQl0xnQNioQVkuE_J8OPffspL_c3d6dmkKnc5hjNNCqfJA7ZtljczfcXUXMQOejMOILdcReTdp95DlzmpFReTi9zYrDGOeds_0JPwLnLjvXfsGRF6qksWfh1A5ZJaFN2I1LnyTOP1Nlwef1xyjJcrj94cecQ9zzNG4RDpL7Ge6elFlaIXxkCV9U-lO4GLUlHvOQwyzgw_fJAkf3tCLV4gRsKLibwJdnQdx48rUGhHisQBd16l_UZmTUelqUVZw0e_6sjnSWzaeDTk8ENg5-JvJuymeswIz2MEEkItw7DI_9-K2KKdGFoFf7_7JWuhhbZQXOOh1u_1giU21x5on3zCwDXT5WM5LUVYLIZ3ZKAryV_KtYC4gsXNFk9SKybqWcaKuzFpwVPGRiZpuO8I-qURU-Jsui69SHIb8WINRmIZeE0C8GSiyGyDQyzQ-AfOG1o-1gT-eGt11fJg0ParciuNIQtfJApl6MjSFdXd6f-x1t7pY7rrgyswbJQkhbhTDBupsgAGLTPlJdXXEDVTYTFBpwsPULNTE7WjUZW7Sxh-viom9JU2TdfejW2zF2R_0i0

## 桥段场景

​	http://www.plantuml.com/plantuml/png/LP31QiCm38RlVWeVsms_mHY5NNRPPPSTWqYqrDIHZInJHjcxprEIekOWaFn_NooVgW1BMv8R4zJgtnX16gE_ET-_AXnfzWGBQlzS2yBbS7I_M_wzBK1RE9BuYHjTrkZKqHxT6g0H3VUHgGgo8Ij8hDymIioamy_s4pttiXeAOm76uHe9T-kCCYWd4ITZL_Jsm9dJhsumFuOqvdDEzvwnoehcWdGuccsCP30MSxY_tqje9MnBFWxrnTo-VyXwMVTV0iVvBE59rKvhcFALmgiEJaXJMz8V

## 得到运行结果

```
葫芦娃进行一个酒的喝
【见底了】
葫芦娃说：“哼!”
蛇精说：“啊？”
蝎子精说：“我的酒哇，全让这小子喝光了，呜呜呜...”
葫芦娃说：“哈哈哈哈，你们也太小气了，只给我这么点酒喝，我还没尝出味儿来呢就没了。”
蛇精说：“如意如意，按我心意，快快显灵。”
葫芦娃说：“妖精你在唠叨什么，还不把酒拿来！”
蛇精说：“美酒美酒快出来”
蛇精说：“好香啊”
【如意显灵ing】
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃面色大改，站不稳了
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
蛇精说：“哈哈，果然上了套了！”
葫芦娃进行一个酒的喝
【见底了】
【但是没有完全见底】
葫芦娃醉了，睡睡

```

## 作业心得

java中没有“显式“的指针，导致我使用对象作为参数和函数返回值时感到困惑。后阅读资料，整理如下：

​	1、若传递的是基本类型，则传递*值的拷贝*；

​	2、若传递的是对象，一般情况下行为表现为对对象的*传值*，但实际传递的是堆中对象的地址的拷贝，对对象而言是*传址*。例如，对象obj的地址为addr，传参后为addr1，两者都指向堆中存放obj的地址，因而通过addr1修改obj的行为会对addr指向的obj产生影响（本来就是同一个obj）。但若addr1指向的内存地址被更改（如重新new了，或者指向别的对象），那么addr指向原对象obj，addr1指向新对象，函数返回后可能给人*传值*的错觉。