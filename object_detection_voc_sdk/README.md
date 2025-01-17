## 目录：
http://aias.top/

# 目标检测(支持voc数据集分类)SDK
检测图片中20个分类的目标。

### 支持分类如下：
- aeroplane
- bicycle
- bird
- boat
- bottle
- bus
- car
- cat
- chair
- cow
- diningtable
- dog
- horse
- motorbike
- person
- pottedplant
- sheep
- sofa
- train
- tvmonitor

[点击下载](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/object_detection_sdk/voc_classes.txt)

### SDK包含两个检测器：
-  SSDResnet50Detection
SSD, backbone: resnet50
-  YoloMobilenetV1Detection
yolo, backbone: mobilenet1.0

## 运行例子 - SSDResnet50DetectionExample
- 测试图片
![img](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/object_detection_sdk/SSDResnet50Detection.png)

运行成功后，命令行应该看到下面的信息:
```text
...
[INFO ] - [
	class: "dog", probability: 0.85052, bounds: [x=0.028, y=0.360, width=0.214, height=0.528]
	class: "sofa", probability: 0.80193, bounds: [x=0.055, y=0.142, width=0.847, height=0.759]
	class: "person", probability: 0.75147, bounds: [x=0.387, y=0.111, width=0.359, height=0.740]
	class: "cat", probability: 0.71961, bounds: [x=0.260, y=0.561, width=0.254, height=0.250]
	class: "person", probability: 0.62601, bounds: [x=0.260, y=0.154, width=0.201, height=0.433]
]
```

### 帮助 
添加依赖库：lib/aias-object-detection-voc-lib-0.1.0.jar

## QQ群：
![Screenshot](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/OCR/OCR_QQ.png)
