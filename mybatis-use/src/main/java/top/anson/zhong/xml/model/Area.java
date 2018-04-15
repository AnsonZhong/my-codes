package top.anson.zhong.xml.model;

public class Area {
    private int id;
    private String code;
    private String pccode;
    private String name;
    private String desc1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPccode() {
        return pccode;
    }

    public void setPccode(String pccode) {
        this.pccode = pccode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", pccode='" + pccode + '\'' +
                ", name='" + name + '\'' +
                ", desc1='" + desc1 + '\'' +
                '}';
    }
}
