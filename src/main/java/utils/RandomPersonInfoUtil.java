package utils;

import bean.CityBean;
import bean.ProvinceBean;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

/**
 * @author wangjianlong
 */
public class RandomPersonInfoUtil {

    static {
        InitCityBean initCityBean = new InitCityBean();
    }
    private static String emil_prefix = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static List<ProvinceBean> provinceBeans = InitCityBean.allCity;
    private static String firstName = "赵钱孙李周吴郑王冯陈褚卫蒋沈韩杨朱秦尤许何吕施张孔曹严华金魏陶姜戚谢邹喻柏水窦章云苏潘葛奚范彭郎鲁韦昌马苗凤花方俞任袁柳酆鲍史唐费廉岑薛雷贺倪汤滕殷罗毕郝邬安常乐于时傅皮卞齐康伍余元卜顾孟平黄和穆萧尹姚邵湛汪祁毛禹狄米贝明臧计伏成戴谈宋茅庞熊纪舒屈项祝董梁杜阮蓝闵席季麻强贾路娄危江童颜郭梅盛林刁钟徐邱骆高夏蔡田樊胡凌霍虞万支柯咎管卢莫经房裘缪干解应宗宣丁贲邓郁单杭洪包诸左石崔吉钮龚程嵇邢滑裴陆荣翁荀羊於惠甄魏加封芮羿储靳汲邴糜松井段富巫乌焦巴弓牧隗山谷车侯宓蓬全郗班仰秋仲伊宫宁仇栾暴甘钭厉戎祖武符刘姜詹束龙叶幸司韶郜黎蓟薄印宿白怀蒲台从鄂索咸籍赖卓蔺屠蒙池乔阴郁胥能苍双闻莘党翟谭贡劳逄姬申扶堵冉宰郦雍却璩桑桂濮牛寿通边扈燕冀郏浦尚农温别庄晏柴瞿阎充慕连茹习宦艾鱼容向古易慎戈廖庚终暨居衡步都耿满弘匡国文寇广禄阙东殴殳沃利蔚越夔隆师巩厍聂晁勾敖融冷訾辛阚那简饶空曾毋沙乜养鞠须丰巢关蒯相查后江红游竺权逯盖益桓公万俟司马上官欧阳夏侯诸葛闻人东方赫连皇甫尉迟公羊澹台公冶宗政濮阳淳于仲孙太叔申屠公孙乐正轩辕令狐钟离闾丘长孙慕容鲜于宇文司徒司空亓官司寇仉督子车颛孙端木巫马公西漆雕乐正壤驷公良拓拔夹谷宰父谷粱晋楚阎法汝鄢涂钦段干百里东郭南门呼延归海羊舌微生岳帅缑亢况后有琴梁丘左丘东门西门商牟佘佴伯赏南宫墨哈谯笪年爱阳佟第五言福百家姓续";
    private static String lastName_girl = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽 ";
    private static String lastName_boy = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘";
    private static final String[] email_suffix = "@gmail.com,@yahoo.com,@qq.com,@live.com,@qq.com,@0355.net,@163.com,@163.net,@263.net,@3721.net,@yeah.net,@126.com,@sina.com,@sohu.com,@yahoo.com.cn".split(",");
    private static int[] sex = {0, 1};


    /**
     * 获取随机数
     * @param length
     * @return
     */
    public static int getRandom(int length) {
        Random random = new Random();
        return random.nextInt(length);
    }

    /**
     * 获取随机8位数
     * @return
     */
    public static String getNumEndNum(){
        String num_end = String.valueOf(getRandom(99999999));
        while ( num_end.length() != 8){
            getNumEndNum();
        }
        return num_end;
    }

    /**
     * 随机邮箱生成
     * @return
     */
    public static String getEmail() {
        StringBuffer sb = new StringBuffer();
        int length = emil_prefix.length();
        for (int i = 0; i < 8; i++) {
            int random_pre = getRandom(length);
            sb.append(emil_prefix.charAt(random_pre));
        }
        int random_suf = getRandom(email_suffix.length);
        sb.append(email_suffix[random_suf]);
        return sb.toString();
    }


    public static String[] telFirst = "178,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
    /**
     * 返回随机手机号码
     */
    public static String getRandomTelephoneNumber() {
        int random = getRandom(telFirst.length);
        String startNum = telFirst[random];
        return startNum + getNumEndNum();
    }

    /**
     * 返回中文姓名
     */
    public static String getRandomChineseName() {
        String first = "";
        String second = "";
        String third = "";
        int sexType = getRandom(2);
        //姓名
        int fn = getRandom(firstName.length());
        first = firstName.charAt(fn)+"";
        //名字
        if(sexType == sex[0]){
            int random1 = getRandom(lastName_boy.length());
            second =  lastName_boy.charAt(random1) + "";
            int random2 = getRandom(lastName_boy.length());
            third = lastName_boy.charAt(random2)+"";
        }else {
            int random1 = getRandom(lastName_girl.length());
            second =  lastName_girl.charAt(random1) + "";
            int random2 = getRandom(lastName_girl.length());
            third = lastName_girl.charAt(random2)+"";
        }
        return first + second + third;
    }


    /**
     * 随机位置获取
     * @return
     */
    public static String getRandomLocation(){
        String location = null;
        String provinceName =null;
        String cityName = null;
        //province
        int randomIndex_province = getRandom(provinceBeans.size());
        ProvinceBean provinceBean = provinceBeans.get(randomIndex_province);
        provinceName = provinceBean.getProvinceName();
        //city
        int randomIndex_city = getRandom(provinceBean.getCities().size());
        CityBean cityBean = provinceBean.getCities().get(randomIndex_city);
        cityName = cityBean.getCitiesName();
        if(provinceName.equals(cityName)){
            return provinceName;
        }else {
            location = provinceName +" "+ cityName;

        }
        return location;
    }

    /**
     * 生成随机时间
     * @return
     */
    public static LocalDateTime randomDate() {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(getRandom(365));
        return localDateTime;
    }

}
