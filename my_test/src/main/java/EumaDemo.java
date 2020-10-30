import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Auther :${Mr.zhang}
 * Time:2020/10/30
 */
public enum  EumaDemo {
    lv1(1,"123"),
    lv2(2,"234"),
    lv3(3,"345"),
    lv4(4,"456");

    private int id;
    private String name;

    EumaDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
