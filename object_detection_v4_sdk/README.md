## 目录：
http://aias.top/

# 目标检测(支持601分类)SDK
检测图片中601个分类的目标。

### 支持openimages_v4数据集分类如下：
- Tortoise
- Container
- Magpie
- Sea turtle
- Football
- Ambulance
- Ladder
- Toothbrush
- Syringe
- Sink
- ...

[点击下载](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/object_detection_sdk/openimages_v4_classes.txt)

### SDK检测器：
-  SSDMobilenetV2Detection
ssd, backbone: mobilenetV2

## 运行例子 - SSDMobilenetV2DetectionExample
- 测试图片
![img](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/object_detection_sdk/SSDMobilenetV2Detection.png)

运行成功后，命令行应该看到下面的信息:
```text
...
[INFO ] - [
	class: "Human face", probability: 0.79220, bounds: [x=0.524, y=0.236, width=0.085, height=0.237]
	class: "Dog", probability: 0.74944, bounds: [x=0.022, y=0.345, width=0.223, height=0.542]
	class: "Clothing", probability: 0.41576, bounds: [x=0.425, y=0.400, width=0.368, height=0.388]
	class: "Human face", probability: 0.41436, bounds: [x=0.322, y=0.209, width=0.094, height=0.154]
	class: "Girl", probability: 0.41029, bounds: [x=0.257, y=0.133, width=0.569, height=0.692]
]
```

### 帮助 
添加依赖库：lib/aias-object-detection-v4-lib-0.1.0.jar

## QQ群：
![Screenshot](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/OCR/OCR_QQ.png)
