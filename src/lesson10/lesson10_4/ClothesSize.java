package lesson10.lesson10_4;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

public enum ClothesSize {
    XXS(40){
        public String getDescription(){
            return "Children's size";
        }
    },XS(42),S(44),M(46),L(48), XL(50), XXL(56),XXXL(60);
    private int euroSize;

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription(){
        return "Adult size";
    }
}
