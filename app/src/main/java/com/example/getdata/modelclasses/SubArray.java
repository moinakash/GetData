
package com.example.getdata.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubArray {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sector_id")
    @Expose
    private Integer sectorId;
    @SerializedName("gadget_year")
    @Expose
    private String gadgetYear;
    @SerializedName("worker_id")
    @Expose
    private Integer workerId;
    @SerializedName("garment_desination_classify")
    @Expose
    private String garmentDesinationClassify;
    @SerializedName("base_salary")
    @Expose
    private Integer baseSalary;
    @SerializedName("house_rent")
    @Expose
    private Integer houseRent;
    @SerializedName("medical_allowance")
    @Expose
    private Integer medicalAllowance;
    @SerializedName("transport_allowance")
    @Expose
    private Integer transportAllowance;
    @SerializedName("food")
    @Expose
    private Integer food;
    @SerializedName("hill_allowance")
    @Expose
    private Integer hillAllowance;
    @SerializedName("yearly_increment")
    @Expose
    private Integer yearlyIncrement;
    @SerializedName("total_money")
    @Expose
    private Integer totalMoney;
    @SerializedName("gadget_file")
    @Expose
    private String gadgetFile;
    @SerializedName("publication_status")
    @Expose
    private Integer publicationStatus;
    @SerializedName("us_id")
    @Expose
    private Integer usId;
    @SerializedName("lang_id")
    @Expose
    private Integer langId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("sector_name")
    @Expose
    private String sectorName;
    @SerializedName("bn_wtname")
    @Expose
    private String bnWtname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSectorId() {
        return sectorId;
    }

    public void setSectorId(Integer sectorId) {
        this.sectorId = sectorId;
    }

    public String getGadgetYear() {
        return gadgetYear;
    }

    public void setGadgetYear(String gadgetYear) {
        this.gadgetYear = gadgetYear;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getGarmentDesinationClassify() {
        return garmentDesinationClassify;
    }

    public void setGarmentDesinationClassify(String garmentDesinationClassify) {
        this.garmentDesinationClassify = garmentDesinationClassify;
    }

    public Integer getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Integer baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Integer getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(Integer houseRent) {
        this.houseRent = houseRent;
    }

    public Integer getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setMedicalAllowance(Integer medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    public Integer getTransportAllowance() {
        return transportAllowance;
    }

    public void setTransportAllowance(Integer transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    public Integer getHillAllowance() {
        return hillAllowance;
    }

    public void setHillAllowance(Integer hillAllowance) {
        this.hillAllowance = hillAllowance;
    }

    public Integer getYearlyIncrement() {
        return yearlyIncrement;
    }

    public void setYearlyIncrement(Integer yearlyIncrement) {
        this.yearlyIncrement = yearlyIncrement;
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getGadgetFile() {
        return gadgetFile;
    }

    public void setGadgetFile(String gadgetFile) {
        this.gadgetFile = gadgetFile;
    }

    public Integer getPublicationStatus() {
        return publicationStatus;
    }

    public void setPublicationStatus(Integer publicationStatus) {
        this.publicationStatus = publicationStatus;
    }

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getBnWtname() {
        return bnWtname;
    }

    public void setBnWtname(String bnWtname) {
        this.bnWtname = bnWtname;
    }

}
