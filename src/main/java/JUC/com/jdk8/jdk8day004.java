package JUC.com.jdk8;


import JUC.com.thread.day009.User;

import java.util.Optional;

/** 判断object是否为空 */
public class jdk8day004 {
  /**
   * https://blog.csdn.net/zjhred/article/details/84976734?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase
   *
   * @param args
   */
  public static void main(String[] args) {
    User user = null;

    // 判断user是否为null;
    Optional<User> user1 = Optional.ofNullable(user);
    System.out.println(user1);
    User user2 = new User(8, "hfjks");
    Optional<User> user22 = Optional.ofNullable(user2);
    System.out.println(user22.get());
    String s = "sf";
    // jdk8的方式
    try {
      // 如果user为空则抛出一个exception出来
      Optional.ofNullable(user).orElseThrow(() -> new Exception("user 为kong"));
    } catch (Exception e) {
      // 打印出错的位置和信息
      e.printStackTrace();
    }
    // 如果user 为空就new User(88, "hua") 返回
    User hua = Optional.ofNullable(user).orElse(new User(88, "hua"));
    // 如果usre2 不为空,则orElse中就不会执行
    User hua2 = Optional.ofNullable(user2).orElse(new User(33, "hua33"));
    System.out.println(hua.toString());
    System.out.println(hua2.toString());
  }
}
