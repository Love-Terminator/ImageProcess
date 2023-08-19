package org.image.process.service.impl;

import com.alibaba.fastjson.JSON;
import org.image.process.service.ImageOperation;

public class ImageOperationImpl implements ImageOperation {
    @Override
    public void imageClassify(byte[] imageData) {
        System.out.println(imageData);
        return;
    }
}
