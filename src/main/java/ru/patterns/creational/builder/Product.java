package ru.patterns.creational.builder;

public class Product {

    /**
     * создание объета доступно только через builder
     */
    private Product() {
    }

    private String name;
    private String type;
    private Double cost;

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    /**
     * внутренний класс строитель
     */
    public static class ProductBuilder {

        private final Product product;

        private ProductBuilder() {
            product = new Product();
        }

        public ProductBuilder name(String name) {
            this.product.name = name;
            return this;
        }

        public ProductBuilder type(String type) {
            this.product.type = type;
            return this;
        }

        public ProductBuilder cost(Double cost) {
            this.product.cost = cost;
            return this;
        }

        public Product build() {
            return this.product;
        }
    }

    @Override
    public String toString() {
        return "Product[name=" + name + ", type=" + type + ", cost=" + cost + "]";
    }
}
