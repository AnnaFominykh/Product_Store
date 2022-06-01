public class Discount {
    private String ProdName;
    private String ProdCategory;
    private int percent;

    public String getProdName() {
        return ProdName;
    }

    public String getProdCategory() {
        return ProdCategory;
    }

    public void setProdCategory(String prodCategory) {
        ProdCategory = prodCategory;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
