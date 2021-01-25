/**
 * projectName: JUC fileName: SearchString.java packageName: Interview date: 2020-09-06 copyright(c)
 * 2017-2020 xxx公司
 */
package JUC.com.Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @version: V1.0
 * @author: mikael
 * @className: SearchString
 * @packageName: Interview
 * @description: Java查找数组重复元素，并打印重复元素、重复次数、重复元素位置
 * @data: 2020-09-06
 */
public class SearchString {
  public static void main(String[] args) {
    String[] strings = {"aa", "bb", "bb", "cc", "cc"};
    HashMap<String, Map<Integer, ArrayList>> map = getMap(strings);
    HashMap<String, Map<Integer, ArrayList>> map2 = getMap2(strings);
    System.out.println(map2);
    System.out.println(map);
  }

  // String 为出现的字符；integer 为出现的次数，ArrayList 为出现的位置
  public static HashMap<String, Map<Integer, ArrayList>> getMap(String[] strings) {
    HashMap<String, Map<Integer, ArrayList>> stringHashMap = new HashMap<>(); // key 记录出现的字符
    for (int i = 0; i < strings.length; i++) {
      HashMap<Integer, ArrayList> integerStringHashMap =
          new HashMap<>(); // key 记录次数 arraylist 为记录出现的位置
      Map<Integer, ArrayList> integerArrayListMap = stringHashMap.get(strings[i]);
      if (stringHashMap.get(strings[i]) == null) {
        ArrayList<Integer> objects1 = new ArrayList<>();
        objects1.add(i);
        integerStringHashMap.put(1, objects1);
        stringHashMap.put(strings[i], integerStringHashMap);
      } else {
        // keySet() 遍历 map中的主键
        for (int c : stringHashMap.get(strings[i]).keySet()) {
          // 获取主键的ArrayList
          System.out.println(c);
          ArrayList arrayList = stringHashMap.get(strings[i]).get(c);
          arrayList.add(i);
          // 计算出现的次数
          c++;
          stringHashMap.get(strings[i]).put(c, arrayList);
          stringHashMap.get(strings[i]).remove(--c);
        }
      }
    }
    return stringHashMap;
  }

  public static HashMap<String, Map<Integer, ArrayList>> getMap2(String[] strings) {
    HashMap<String, Map<Integer, ArrayList>> stringMapHashMap = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
      String str = strings[i];
      HashMap<Integer, ArrayList> integerArrayListHashMap = new HashMap<>();
      // 不在stringMapHashMap中
      if (!stringMapHashMap.containsKey(str)) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(i);
        integerArrayListHashMap.put(1, objects);
        stringMapHashMap.put(str, integerArrayListHashMap);
      } else {
        for (int c : stringMapHashMap.get(str).keySet()) {
          ArrayList arrayList = stringMapHashMap.get(str).get(c);
          c++;
          arrayList.add(i);
          stringMapHashMap.get(str).put(c, arrayList);
          stringMapHashMap.get(str).remove(--c);
        }
      }
    }
    return stringMapHashMap;
  }
}
