package com.logiic.cardscan;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

import com.logiic.cardscan.base.TestingImageReaderInternal;

class TestingImageBridge implements TestingImageReaderInternal {
    private TestingImageReader testingImageReader;

    TestingImageBridge(@NonNull TestingImageReader testingImageReader) {
        this.testingImageReader = testingImageReader;
    }

    @Override
    public Bitmap nextImage() {
        return this.testingImageReader.nextImage();
    }
}
