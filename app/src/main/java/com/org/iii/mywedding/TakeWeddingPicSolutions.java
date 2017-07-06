package com.org.iii.mywedding;

/**
 * Created by iii on 2017/7/6.
 */

public class TakeWeddingPicSolutions {
    private String solutionsImage;
    private String servicesName;
    private String solutionName;
    private String maxPrice;

    public TakeWeddingPicSolutions(String solutionsImage, String servicesName, String solutionName, String maxPrice) {
        this.solutionsImage = solutionsImage;
        this.servicesName = servicesName;
        this.solutionName = solutionName;
        this.maxPrice = maxPrice;
    }

    public String getSoutionName() {
        return solutionName;
    }

    public void setSoutionName(String soutionName) {
        this.solutionName = soutionName;
    }

    public String getSolutionsImage() {
        return solutionsImage;
    }

    public void setSolutionsImage(String solutionsImage) {
        this.solutionsImage = solutionsImage;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }
}