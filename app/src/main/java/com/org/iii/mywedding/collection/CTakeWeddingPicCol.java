package com.org.iii.mywedding.collection;

/**
 * Created by iii on 2017/7/7.
 */

public class CTakeWeddingPicCol {
    private String collectionName;//作品名
    private String collectionImg;//作品封面
    private String collectionDes;//作品簡述
    private  int collectionFid;//作品fid
//    private String id;

    public CTakeWeddingPicCol(String collectionName, String collectionImg, String collectionDes,int collectionFid) {
        this.collectionName = collectionName;
        this.collectionImg = collectionImg;
        this.collectionDes = collectionDes;
        this.collectionFid = collectionFid;
//        this.id = id;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public int getCollectionFid() {
        return collectionFid;
    }

    public void setCollectionFid(int collectionFid) {
        this.collectionFid = collectionFid;
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
