package bean;

import java.io.Serializable;

/**
 * @author wangjianlong
 */
public class CityBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String citiesName;

    public String getCitiesName() {
        return citiesName;
    }

    public void setCitiesName(String citiesName) {
        this.citiesName = citiesName;
    }

    @Override
    public String toString() {
        return "CityBean{" +
                "citiesName='" + citiesName + '\'' +
                '}';
    }
}
