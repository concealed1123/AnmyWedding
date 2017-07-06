package com.org.iii.mywedding;

/**
 * Created by iii on 2017/7/6.
 */

public class WeddingRECSolutions {
    private String solutionsImage;
    private String servicesName;
    private String solutionName;
    private String maxPrice;

    public WeddingRECSolutions(String solutionsImage, String servicesName, String solutionName, String maxPrice) {
        this.solutionsImage = solutionsImage;
        this.servicesName = servicesName;
        this.solutionName = solutionName;
        this.maxPrice = maxPrice;
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

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }
}
