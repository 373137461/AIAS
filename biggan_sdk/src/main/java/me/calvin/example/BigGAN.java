package me.calvin.example;

import ai.djl.ModelException;
import ai.djl.inference.Predictor;
import ai.djl.modality.cv.Image;
import ai.djl.repository.zoo.Criteria;
import ai.djl.repository.zoo.ModelZoo;
import ai.djl.repository.zoo.ZooModel;
import ai.djl.training.util.ProgressBar;
import ai.djl.translate.TranslateException;
import me.calvin.example.utils.BigGANTranslator;
import me.calvin.example.utils.ImageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * An example of generation using BigGAN.
 */
public final class BigGAN {

    private static final Logger logger = LoggerFactory.getLogger(BigGAN.class);

    public BigGAN() {
    }

    public static void main(String[] args) throws IOException, ModelException, TranslateException {
        // size 支持 128, 256, 512
        int size = 512;
        // imageClass 支持imagenet类别1~1000
        long imageClass = 156;

        Criteria<Long, Image> criteria = new BigGAN().generate(size, 0.4f);
        Image image = null;
        try (ZooModel<Long, Image> model = ModelZoo.loadModel(criteria);
             Predictor<Long, Image> generator = model.newPredictor()) {
            image = generator.predict(imageClass);
        }

        ImageUtils.saveImage(image, "image" + imageClass + ".png", "build/output/");
        logger.info("Generated image has been saved in: {}", "build/output/");
    }

    public Criteria<Long, Image> generate(int size, float truncation) {

        String url = null;
        if (size == 128) {
            size = 120;
            url = "https://djl-model.oss-cn-hongkong.aliyuncs.com/models/biggan128.zip";
        } else if (size == 256) {
            size = 140;
            url = "https://djl-model.oss-cn-hongkong.aliyuncs.com/models/biggan256.zip";
        } else if (size == 512) {
            size = 128;
            url = "https://djl-model.oss-cn-hongkong.aliyuncs.com/models/biggan512.zip";
        }

        BigGANTranslator translator = new BigGANTranslator(size, truncation);
        Criteria<Long, Image> criteria =
                Criteria.builder()
                        .optEngine("PyTorch") // Use PyTorch engine
                        .setTypes(Long.class, Image.class)
                        .optModelUrls(url)
                        //            .optModelUrls("/Users/calvin/BigGAN-Generator-Pretrained-Pytorch/")
                        //            .optModelName("traced_biggan512_model")
                        .optTranslator(translator)
                        .optProgress(new ProgressBar())
                        .build();
        return criteria;
    }
}
