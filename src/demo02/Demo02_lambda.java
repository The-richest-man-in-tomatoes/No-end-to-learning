package demo02;

import java.util.HashMap;

public class Demo02_lambda {
    public static void main(String[] args) {
        Demo02_lambda lambda = new Demo02_lambda();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (a, b) -> { return a * b;};

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + lambda.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lambda.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + lambda.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lambda.operate(10, 5, division));


        GreetingService greetingService = message -> {
            System.out.println("Hello" + message);
        };

        GreetingService greetingService1 = (message) ->
                System.out.println("Hello" + message);

        greetingService.sayMessage(" World");
        greetingService1.sayMessage(" World");

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("1",2);

        ObjectHashMap objectHashMap = (key, map) -> {
            if (map.containsKey(key)) {
                return 1;
            }
            return 0;
        };

        int i = lambda.putListToMap("1", hashMap, objectHashMap);
        System.out.println(i);

        new GreetingService() {
            @Override
            public void sayMessage(String message) {

            }
        };

        // lambda实现interface
        // 精简
        GreetingService greetingService2 = (str) -> System.out.println(str + "world!!");
        greetingService2.sayMessage("Hello");

        // 极简
        ((GreetingService)(str) -> System.out.println(str + "world!!")).sayMessage("Hello ");

    }



    interface MathOperation {
        int operation(int a, int b);
    }

    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return  mathOperation.operation(a, b);
    }

    interface ObjectHashMap {
        int map(String key, HashMap<String, Object> map);
    }

    private int putListToMap(String key, HashMap<String, Object> map, ObjectHashMap objectHashMap){
        return objectHashMap.map(key, map);
    }

}




