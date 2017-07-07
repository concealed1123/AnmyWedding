package com.org.iii.mywedding.collection;

/**
 * Created by iii on 2017/7/7.
 */

public class CWeddingSiteCollection {
    private String collectionName;//作品名
    private String collectionImg;//作品封面
    private String collectionDes;//作品簡述

    public CWeddingSiteCollection(String collectionName, String collectionImg, String collectionDes) {
        this.collectionName = collectionName;
        this.collectionImg = collectionImg;
        this.collectionDes = collectionDes;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCollectionImg() {
        return collectionImg;
    }

    public void setCollectionImg(String collectionImg) {
        this.collectionImg = collectionImg;
    }

    public String getCollectionDes() {
        return collectionDes;
    }

    public void setCollectionDes(String collectionDes) {
        this.collectionDes = collectionDes;
    }
}
