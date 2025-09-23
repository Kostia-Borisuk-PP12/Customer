package app12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Створюємо список продуктів
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0),
                new Product("TV", "Electronics", 900.0),
                new Product("Microwave", "Appliances", 200.0)
        );

        // 1. Згрупуємо продукти за категоріями
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println("Продукти за категоріями:");
        groupedByCategory.forEach((category, items) -> {
            System.out.println(category + ": " + items);
        });

        // 2. Знайдемо середню ціну у кожній категорії
        Map<String, Double> avgPriceByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));

        System.out.println("\nСередня ціна по категоріях:");
        avgPriceByCategory.forEach((category, avgPrice) ->
                System.out.println(category + " = " + avgPrice));

        // 3. Знайдемо категорію з найвищою середньою ціною
        Optional<Map.Entry<String, Double>> maxCategory = avgPriceByCategory.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        maxCategory.ifPresent(entry ->
                System.out.println("\nКатегорія з найвищою середньою ціною: "
                        + entry.getKey() + " (" + entry.getValue() + ")"));
    }
}
