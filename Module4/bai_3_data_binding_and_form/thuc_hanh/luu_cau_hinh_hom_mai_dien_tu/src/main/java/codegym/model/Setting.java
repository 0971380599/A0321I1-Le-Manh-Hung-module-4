package codegym.model;

import java.util.Arrays;

public class Setting {
    private String[] languageArr = {"English", "Vietnamese", "Japanese", "Chinese"};
    private String language;
    private int pageSize;
    private boolean spamsFilter;
    private String Signature;

    public Setting() {
    }

    public Setting(int language, int pageSize, boolean spamsFilter, String signature) {
        this.language = languageArr[language];
        this.pageSize =pageSize;
        this.spamsFilter = spamsFilter;
        Signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(boolean spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    @Override
    public String toString() {
        return "Setting{" +
                ", language='" + language + '\'' +
                ", pageSize=" + pageSize +
                ", spamsFilter=" + spamsFilter +
                ", Signature='" + Signature + '\'' +
                '}';
    }
}
