package utils;

import bean.ProvinceBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * 初始化city
 * @author wangjianlong
 */
public class InitCityBean {
    private static String cities = "";
    public static List<ProvinceBean> allCity = null;
    static {cities = "[\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"石家庄市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"邯郸市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"唐山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"保定市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"秦皇岛市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"邢台市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"张家口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"承德市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"沧州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"廊坊市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"衡水市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"辛集市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"晋州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新乐市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"遵化市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"迁安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"霸州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"三河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"定州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"涿州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安国市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"高碑店市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"泊头市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"任丘市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"黄骅市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"河间市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"冀州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"深州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"南宫市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"沙河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"武安市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"河北省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"太原市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"大同市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"朔州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阳泉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"长治市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"晋城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"忻州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"吕梁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"晋中市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临汾市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"运城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"古交市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"潞城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"高平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"原平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"孝义市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"汾阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"介休市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"侯马市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"霍州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"永济市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"河津市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"山西省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"呼和浩特市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"包头市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乌海市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"赤峰市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"呼伦贝尔市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"通辽市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乌兰察布市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"鄂尔多斯市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"巴彦淖尔市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"满洲里市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"扎兰屯市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"牙克石市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"根河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"额尔古纳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乌兰浩特市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阿尔山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"霍林郭勒市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"锡林浩特市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"二连浩特市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"丰镇市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"内蒙古自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"沈阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"大连市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"朝阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阜新市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"铁岭市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"抚顺市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"本溪市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"辽阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"鞍山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"丹东市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"营口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"盘锦市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"锦州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"葫芦岛市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新民市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"瓦房店市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"庄河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"北票市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"凌源市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"调兵山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"开原市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"灯塔市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"海城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"凤城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"东港市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"大石桥市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"盖州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"凌海市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"北镇市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"兴城市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"辽宁省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"长春市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"吉林市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"白城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"松原市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"四平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"辽源市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"通化市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"白山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"德惠市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"榆树市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"磐石市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"蛟河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"桦甸市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"舒兰市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"洮南市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"大安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"双辽市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"公主岭市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"梅河口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"集安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"延吉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"图们市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"敦化市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"珲春市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"龙井市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"和龙市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"扶余市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"吉林省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"哈尔滨市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"齐齐哈尔市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"黑河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"大庆市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"伊春市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"鹤岗市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"佳木斯市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"双鸭山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"七台河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"鸡西市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"牡丹江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"绥化市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"尚志市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"五常市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"讷河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"北安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"五大连池市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"铁力市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"同江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"富锦市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"虎林市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"密山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"绥芬河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"海林市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宁安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安达市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"肇东市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"海伦市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"穆棱市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"东宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"抚远市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"黑龙江省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"南京市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"徐州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"连云港市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宿迁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"淮安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"盐城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"扬州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"泰州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"南通市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"镇江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"常州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"无锡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"苏州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"常熟市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"张家港市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"太仓市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"昆山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"江阴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宜兴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"溧阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"扬中市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"句容市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"丹阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"如皋市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"海门市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"启东市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"高邮市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"仪征市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"兴化市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"泰兴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"靖江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"东台市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"邳州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新沂市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"江苏省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"杭州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宁波市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"湖州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"嘉兴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"舟山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"绍兴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"衢州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"金华市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"台州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"温州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"丽水市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"建德市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"慈溪市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"余姚市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"平湖市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"海宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"桐乡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"诸暨市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"嵊州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"江山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"兰溪市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"永康市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"义乌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"东阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临海市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"温岭市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"瑞安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乐清市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"龙泉市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"浙江省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"合肥市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"芜湖市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"蚌埠市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"淮南市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"马鞍山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"淮北市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"铜陵市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安庆市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"黄山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"滁州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阜阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宿州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"六安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"亳州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"池州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宣城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"巢湖市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"桐城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"天长市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"明光市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"界首市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宁国市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"安徽省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"厦门市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"福州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"南平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"三明市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"莆田市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"泉州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"漳州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"龙岩市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宁德市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"福清市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"长乐市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"邵武市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"武夷山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"建瓯市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"永安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"石狮市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"晋江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"南安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"龙海市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"漳平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"福安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"福鼎市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"福建省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"南昌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"九江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"景德镇市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"鹰潭市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新余市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"萍乡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"赣州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"上饶市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"抚州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宜春市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"吉安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"瑞昌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"共青城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乐平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"瑞金市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"德兴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"丰城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"樟树市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"高安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"井冈山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"贵溪市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"江西省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"济南市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"青岛市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"聊城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"德州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"东营市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"淄博市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"潍坊市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"烟台市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"威海市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"日照市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临沂市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"枣庄市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"济宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"泰安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"莱芜市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"滨州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"菏泽市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"胶州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"即墨市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"平度市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"莱西市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临清市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乐陵市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"禹城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安丘市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"昌邑市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"高密市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"青州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"诸城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"寿光市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"栖霞市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"海阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"龙口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"莱阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"莱州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"蓬莱市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"招远市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"荣成市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乳山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"滕州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"曲阜市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"邹城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新泰市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"肥城市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"山东省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"郑州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"开封市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"洛阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"平顶山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"鹤壁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新乡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"焦作市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"濮阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"许昌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"漯河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"三门峡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"南阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"商丘市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"周口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"驻马店市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"信阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"荥阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新郑市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"登封市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新密市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"偃师市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"孟州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"沁阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"卫辉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"辉县市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"林州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"禹州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"长葛市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"舞钢市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"义马市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"灵宝市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"项城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"巩义市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"邓州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"永城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"汝州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"济源市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"河南省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"武汉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"十堰市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"襄阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"荆门市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"孝感市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"黄冈市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"鄂州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"黄石市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"咸宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"荆州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宜昌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"随州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"丹江口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"老河口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"枣阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宜城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"钟祥市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"汉川市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"应城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安陆市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"广水市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"麻城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"武穴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"大冶市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"赤壁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"石首市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"洪湖市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"松滋市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宜都市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"枝江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"当阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"恩施市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"利川市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"仙桃市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"天门市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"潜江市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"湖北省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"长沙市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"衡阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"张家界市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"常德市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"益阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"岳阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"株洲市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"湘潭市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"郴州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"永州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"邵阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"怀化市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"娄底市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"耒阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"常宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"浏阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"津市市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"沅江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"汨罗市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临湘市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"醴陵市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"湘乡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"韶山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"资兴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"武冈市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"洪江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"冷水江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"涟源市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"吉首市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"湖南省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"广州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"深圳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"清远市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"韶关市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"河源市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"梅州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"潮州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"汕头市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"揭阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"汕尾市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"惠州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"东莞市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"珠海市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"中山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"江门市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"佛山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"肇庆市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"云浮市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阳江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"茂名市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"湛江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"英德市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"连州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乐昌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"南雄市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"兴宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"普宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"陆丰市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"恩平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"台山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"开平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"鹤山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"四会市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"罗定市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阳春市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"化州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"信宜市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"高州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"吴川市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"廉江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"雷州市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"广东省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"南宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"桂林市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"柳州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"梧州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"贵港市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"玉林市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"钦州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"北海市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"防城港市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"崇左市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"百色市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"河池市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"来宾市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"贺州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"岑溪市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"桂平市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"北流市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"东兴市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"凭祥市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宜州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"合山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"靖西市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"广西壮族自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"海口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"三亚市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"三沙市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"儋州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"文昌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"琼海市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"万宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"东方市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"五指山市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"海南省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"成都市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"广元市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"绵阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"德阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"南充市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"广安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"遂宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"内江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乐山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"自贡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"泸州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宜宾市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"攀枝花市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"巴中市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"达州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"资阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"眉山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"雅安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"崇州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"邛崃市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"都江堰市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"彭州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"江油市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"什邡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"广汉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"绵竹市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阆中市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"华蓥市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"峨眉山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"万源市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"简阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"西昌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"康定市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"马尔康市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"四川省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"贵阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"六盘水市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"遵义市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安顺市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"毕节市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"铜仁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"清镇市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"赤水市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"仁怀市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"凯里市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"都匀市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"兴义市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"福泉市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"贵州省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"昆明市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"曲靖市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"玉溪市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"丽江市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"昭通市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"普洱市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临沧市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"保山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宣威市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"芒市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"瑞丽市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"大理市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"楚雄市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"个旧市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"开远市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"蒙自市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"弥勒市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"景洪市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"文山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"香格里拉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"腾冲市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"云南省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"西安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"延安市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"铜川市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"渭南市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"咸阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"宝鸡市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"汉中市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"榆林市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"商洛市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"安康市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"韩城\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"华阴\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"兴平\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"陕西省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"兰州市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"嘉峪关市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"金昌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"白银市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"天水市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"酒泉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"张掖市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"武威市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"庆阳市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"平凉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"定西市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"陇南市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"玉门市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"敦煌市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"临夏市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"合作市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"甘肃省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"西宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"海东市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"格尔木市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"德令哈市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"玉树市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"青海省\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"拉萨市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"日喀则市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"昌都市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"林芝市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"山南市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"西藏自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"银川市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"石嘴山市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"吴忠市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"中卫市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"固原市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"灵武市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"青铜峡市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"宁夏回族自治区\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"台北市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新北市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"桃园市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"台中市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"台南市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"高雄市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"基隆市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"新竹市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"嘉义市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"台湾\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"北京市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"北京市\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"天津市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"天津市\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"上海市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"上海市\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"重庆市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"重庆市\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"香港特别行政区\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"香港\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"澳门特别行政区\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"澳门\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"cities\": [\n" +
            "            {\n" +
            "                \"citiesName\": \"乌鲁木齐市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"克拉玛依市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"吐鲁番市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"哈密市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"喀什市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阿克苏市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"和田市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阿图什市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阿拉山口市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"博乐市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"昌吉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阜康市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"库尔勒市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"伊宁市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"奎屯市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"塔城市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"乌苏市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阿勒泰市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"霍尔果斯市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"石河子市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"阿拉尔市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"图木舒克市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"五家渠市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"北屯市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"铁门关市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"双河市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"可克达拉市\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"citiesName\": \"昆玉市\"\n" +
            "            }\n" +
            "        ],\n" +
            "        \"provinceName\": \"新疆维吾尔自治区\"\n" +
            "    }\n" +
            "]";
    }
    private   void  init(){
        Gson gson = new Gson();
        allCity = gson.fromJson(cities, new TypeToken<List<ProvinceBean>>() {
        }.getType());
    }

   public InitCityBean(){
        init();
   }


}
