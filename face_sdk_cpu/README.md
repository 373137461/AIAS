## 目录：
http://aias.top/


# 人脸识别
广义的人脸识别实际包括构建人脸识别系统的一系列相关技术，包括人脸图像采集、人脸定位、人脸识别预处理、身份确认以及身份查找等；
而狭义的人脸识别特指通过人脸进行身份确认或者身份查找的技术或系统。
人脸识别是一项热门的计算机技术研究领域，它属于生物特征识别技术，是对生物体（一般特指人）本身的生物特征来区分生物体个体。
生物特征识别技术所研究的生物特征包括脸、指纹、手掌纹、虹膜、视网膜、声音（语音）、体形、个人习惯（例如敲击键盘的力度和频率、签字）等，
相应的识别技术就有人脸识别、指纹识别、掌纹识别、虹膜识别、视网膜识别、语音识别（用语音识别可以进行身份识别，也可以进行语音内容的识别，
只有前者属于生物特征识别技术）、体形识别、键盘敲击识别、签字识别等。

## 行业现状
人脸识别技术目前已经广泛应用于包括人脸门禁系统、刷脸支付等各行各业。随着人脸识别技术的提升，应用越来越广泛。目前中国的人脸识
别技术已经在世界水平上处于领先地位，在安防行业，国内主流安防厂家也都推出了各自的人脸识别产品和解决方案，泛安防行业是人脸识别技术主要应用领域。

## 技术发展趋势
目前人脸识别技术广泛采用的是基于神经网络的深度学习模型。利用深度学习提取出的人脸特征，相比于传统技术，能够提取更多的特征，
更能表达人脸之间的相关性，能够显著提高算法的精度。近些年大数据技术以及算力都得到了大幅提升，而深度学习非常依赖于大数据与算力，
这也是为什么这项技术在近几年取得突破的原因。更多更丰富的数据加入到训练模型中，意味着算法模型更加通用，更贴近现实世界。另一方面，算力的提升，
使得模型可以有更深的层级结构，同时深度学习的理论模型本身也在不断的完善中，模型本身的优化将会极大地提高人脸识别的技术水平。

## 人脸识别SDK功能
人脸识别涉及的关键技术包含：人脸检测，人脸关键点，人脸特征提取，人脸比对，人脸对齐。
其中人脸对齐使用了opencv，由于opencv会导致jar包过大，所以将其抽取出来，作为一个单独的项目在需要的时候引入使用。
![face_sdk](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/face_sdk/images/face_sdk.png)

本文的例子给出了人脸检测，人脸关键点，人脸特征提取，人脸比对的参考实现。
###人脸检测(含5个人脸关键点)提供了两个模型的实现：
1. 大模型: 
模型推理例子代码: [RetinaFaceDetectionExample.java](https://github.com/mymagicpower/AIAS/blob/main/face_sdk_cpu/src/main/java/me/calvin/example/RetinaFaceDetectionExample.java).  

2. 小模型: 
模型推理例子代码: [LightFaceDetectionExample.java](https://github.com/mymagicpower/AIAS/blob/main/face_sdk_cpu/src/main/java/me/calvin/example/LightFaceDetectionExample.java).  

###人脸特征提取：
模型推理例子代码: [FeatureExtractionExample.java](https://github.com/mymagicpower/AIAS/blob/main/face_sdk_cpu/src/main/java/me/calvin/example/FeatureExtractionExample.java).  

###人脸特征比对：
特征比对例子代码: [FeatureComparisonExample.java](https://github.com/mymagicpower/AIAS/blob/main/face_sdk_cpu/src/main/java/me/calvin/example/FeatureComparisonExample.java).  


## 运行人脸检测的例子
1. 首先下载例子代码
```bash
git clone https://github.com/mymagicpower/AIAS.git
```

2. 导入examples项目到IDE中：
```
cd face_sdk
```

3. 运行成功后，命令行应该看到下面的信息:
```text
[INFO ] - Face detection result image has been saved in: build/output/retinaface_detected.png
[INFO ] - [
	class: "Face", probability: 0.99993, bounds: [x=0.552, y=0.762, width=0.071, height=0.156]
	class: "Face", probability: 0.99992, bounds: [x=0.696, y=0.665, width=0.071, height=0.155]
	class: "Face", probability: 0.99976, bounds: [x=0.176, y=0.778, width=0.033, height=0.073]
	class: "Face", probability: 0.99961, bounds: [x=0.934, y=0.686, width=0.032, height=0.068]
	class: "Face", probability: 0.99949, bounds: [x=0.026, y=0.756, width=0.039, height=0.078]
]
```
输出图片效果如下：
![detected-faces](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/face_sdk/images/retinaface_detected.png)

## 运行人脸特征提取的例子
1. 运行成功后，命令行应该看到下面的信息:  

```text
[INFO ] - [-0.04026184, -0.019486362, -0.09802659, 0.01700999, 0.037829027, ...]
```

## 运行人脸特征比对的例子
 `src/test/resources/kana1.jpg`  
![kana1](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/face_sdk/images/kana1.jpg)     
 `src/test/resources/kana2.jpg`  
![kana2](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/face_sdk/images/kana2.jpg)  
1. 运行成功后，命令行应该看到下面的信息: 
例子中比对使用的是欧式距离的计算方式。
```text
[INFO ] - 0.9022607
```

### 帮助 
[点击下载SDK](https://djl-model.oss-cn-hongkong.aliyuncs.com/jars/aais-face-lib-0.1.0.jar). 

添加依赖lib - aais-face-lib-0.1.0.jar：
![lib](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/OCR/images/lib.png)


## QQ群：
![Screenshot](https://djl-model.oss-cn-hongkong.aliyuncs.com/AIAS/OCR/OCR_QQ.png)
