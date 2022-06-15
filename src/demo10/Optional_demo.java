package demo10;

import java.util.Locale;
import java.util.Optional;

public class Optional_demo {
    private static OrderEntity orderEntity;

    public static void main(String[] args) {
        OrderEntity order = getOrder();
        System.out.println(order);
        getOrderName(order);
        System.out.println(order);


    // ----------------------------------------------------------------

        String userName = "null";

        Optional<String> optional = Optional.ofNullable(userName);
        System.out.println(optional.isPresent());

    // ----------------------------------------------------------------

        String name = "meite";
        String meite = Optional.ofNullable(name).orElse("meite");
        System.out.println(meite);

    // -----------------------------------------------------------------

        System.out.println(Optional.ofNullable(name).filter(x -> "meite".equals(x)).isPresent());

    }

    public static OrderEntity getOrder() {
        return  Optional.ofNullable(orderEntity).orElseGet(() -> createOrder());
    }

    public static String getOrderName(OrderEntity orderEntity) {
        return Optional.ofNullable(orderEntity).map(entity -> entity.getName()).map(entityName -> entityName.toUpperCase()).orElse("df");
    }

    private static OrderEntity createOrder() {
        return new OrderEntity("zhy", 22);
    }
}
