package JUC.com.Interview;

import java.util.Set;
import java.util.TreeSet;
// 向treeset 添加元素必须是同一类的
// 可以按照添加进集合中的顺序遍历元素指定
// 当向TreeSet中添加一个自定义类的对象时 要求自定义类实现cmparable接口并重写方法
// 添加元素时首先按照compareto方法进行比较一旦返回0，
// 虽然只是比较的值相同但程序仍然会认为对象是相同的，进而后面一个不能进来

public class comparableTest {
  public static void main(String[] args) {
    Set set = new TreeSet();
    set.add(new person(25, "kk"));
    set.add(new person(23, "pp"));
    set.add(new person(22, "pp"));
    set.add(new person(21, "pp"));
    set.add(new person(21, "pp"));
    System.out.println(set.size());
    for (Object i : set) {
      System.out.println(i);
    }
  }
}

class person implements Comparable {
  Integer age;
  String name;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    person other = (person) obj;
    if (age != other.age) return false;
    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;
    return true;
  }

  @Override
  public String toString() {
    return "person [age=" + age + ", name=" + name + "]";
  }

  public person() {
    super();
  }

  public person(int age, String name) {
    super();
    this.age = age;
    this.name = name;
  }

  // 当向TreeSet中添加person类的对象时依据此方法确定按照那个属性排列
  @Override
  public int compareTo(Object o) {
    if (o instanceof person) {
      // ps这里的age name因为是Integer 和String类型的，所以都已经重写了compareTo方法，我们就可以直接拿来用。
      person p = (person) o;
      // return -this.age.compareTo(p.age);
      // return this.name.compareTo(p.name);
      int i = this.age.compareTo(p.age);
      if (i == 0) {
        return this.name.compareTo(p.name); // 如果age是一样的，我们就来判断名字是不是一样的。
      } else {
        return i;
      }
    }
    return 0; // 返回的数是0代表两个元素相同，正数说明大于，负数说明小于
  }
}
