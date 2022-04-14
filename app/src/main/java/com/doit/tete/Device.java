package com.doit.tete;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Device {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("groupCode")
    @Expose
    private String groupCode;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("modelName")
    @Expose
    private String modelName;
    @SerializedName("deviceName")
    @Expose
    private String deviceName;
    @SerializedName("deviceDesc")
    @Expose
    private String deviceDesc;

    public Device(List<Device> devices) {

    }

    public Device(String toString) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", groupCode='" + groupCode + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", modelName='" + modelName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceDesc='" + deviceDesc + '\'' +
                '}';
    }
}
