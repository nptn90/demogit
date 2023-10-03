package test.demo.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        //List String
        List<String> stringList = List.of("abc", "xyz", "123", "ccc", "aaa");
        List<String> numberList = List.of("123", "222", "333", "345", "111");

//        for (int i = 0; i < stringList.size(); i++) {
//            if(stringList.get(i).contains("a")) {
//                System.out.println(stringList.get(i));
//            }
//        }

//        for (String number : numberList) {
//            Integer intNum = Integer.parseInt(number);
//            System.out.println(intNum);
//        }

        stringList.stream()
                .filter(i -> i.contains("a"))
                .peek(i -> System.out.println(i))
                .toArray();

        numberList.stream()
                .map(i -> Integer.parseInt(i))
                .peek(intNum -> System.out.println(intNum))
                .collect(Collectors.toList());

        Function<Integer, Integer> increaseBy1 = (number) -> number + 1;
        System.out.println(increaseBy1.apply(3));
        System.out.println(increaseBy1.apply(5));

        List<HocSinh> hocSinhList = List.of(new HocSinh("NHan", 18), new HocSinh("Tung", 23), new HocSinh("AAA", 20));
        System.out.println(hocSinhList.stream()
                .filter(hocsinh -> hocsinh.getAge() >= 20)
                .map(HocSinh::getName)
                .collect(Collectors.toList()));
    }
}
