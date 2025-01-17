## 目录：
http://aias.top/

# 口罩检测SDK
口罩检测助力抗击肺炎，人工智能技术正被应用到疫情防控中来。
抗疫切断传播途径中，佩戴口罩已经几乎成为了最重要的举措之一。但是在实际场景中，仍然有不重视、不注意、侥幸心理的人员不戴口罩，尤其在公众场合，给个人和公众造成极大的风险隐患。
而基于人工智能的口罩检测功能可以基于摄像头视频流进行实时检测。

### SDK功能
- 人脸检测
- 口罩检测

## 运行例子
1. 首先下载例子代码
```bash
git clone https://github.com/mymagicpower/AIAS.git
```

2. 导入examples项目到IDE中：
```
cd mask_sdk_cpu
```

3. 运行成功后，命令行应该看到下面的信息:
```text
[INFO ] - [
	class: "MASK", probability: 0.99998, bounds: [x=0.608, y=0.603, width=0.148, height=0.265]
	class: "MASK", probability: 0.99998, bounds: [x=0.712, y=0.154, width=0.129, height=0.227]
	class: "NO MASK", probability: 0.99997, bounds: [x=0.092, y=0.123, width=0.066, height=0.120]
	class: "NO MASK", probability: 0.99986, bounds: [x=0.425, y=0.146, width=0.062, height=0.114]
	class: "MASK", probability: 0.99981, bounds: [x=0.251, y=0.671, width=0.088, height=0.193]
]
[INFO ] - Face mask detection result image has been saved in: build/output/face-masks.png
```
输出图片效果如下：
![result](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/mask_sdk/face-masks.png)


添加依赖库 lib/aais-mask-lib-0.1.0.jar

## QQ群：
![Screenshot](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/OCR/OCR_QQ.png)
