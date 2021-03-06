package com.org.iii.mywedding.solutions;

/**
 * Created by Michael on 2017/7/6.
 */

public class TakeWeddingPicSolutions {
    private String storeName;//店家名稱
    private String imagePic;//方案封面
    private String serviceName;//服務名稱
    private String maxPrice;//最高價

    public TakeWeddingPicSolutions(String storeName, String imagePic, String serviceName, String maxPrice) {
        this.storeName = storeName;
        this.imagePic = imagePic;
        this.serviceName = serviceName;
        this.maxPrice = maxPrice;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getImagePic() {
        return imagePic;
    }

    public void setImagePic(String imagePic) {
        this.imagePic = imagePic;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }
}
