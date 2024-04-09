package ntu.edu.bt_recyclerview;

public class LandScape {
    String landscapeCaption;//Đại diện cho Caption
    String landscapeImg; //Đại diện cho file ảnh


    public LandScape(String landscapeCaption, String landscapeImg) {
        this.landscapeCaption = landscapeCaption;
        this.landscapeImg = landscapeImg;
    }
    public String getLandscapeCaption() {
        return landscapeCaption;
    }

    public void setLandscapeCaption(String landscapeCaption) {
        this.landscapeCaption = landscapeCaption;
    }

    public String getLandscapeImg() {
        return landscapeImg;
    }

    public void setLandscapeImg(String landscapeImg) {
        this.landscapeImg = landscapeImg;
    }
}
