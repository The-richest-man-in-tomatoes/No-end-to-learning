package demo06;

public class UserVO {
     private String name;
     private Integer age;

     public UserVO(String name, Integer age) {
          this.name = name;
          this.age = age;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Integer getAge() {
          return age;
     }

     public void setAge(Integer age) {
          this.age = age;
     }

     @Override
     public int hashCode() {
          return name.hashCode();
     }

     @Override
     public boolean equals(Object obj) {
          if (obj instanceof UserVO) {
               return name.equals(((UserVO) obj).name) && age.equals(((UserVO)obj).age);
          } else {
               return false;
          }
     }

     @Override
     public String toString() {
          return "{UserVO" +
                  "Name:" + name + '\'' +
                  ", age= " + age +
                  '}';
     }
}
