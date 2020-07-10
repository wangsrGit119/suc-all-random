package bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangjianlong
 */
public class ProvinceBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String provinceName;
    private List<CityBean> cities;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public List<CityBean> getCities() {
        return cities;
    }

    public void setCities(List<CityBean> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "ProvinceBean{" +
                "provinceName='" + provinceName + '\'' +
                ", cities=" + cities +
                '}';
    }
}
