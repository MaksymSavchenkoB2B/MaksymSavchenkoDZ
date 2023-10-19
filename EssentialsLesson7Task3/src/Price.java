public class Price {
        private String product;
        private String shop;
        private double price;

        public Price(String product, String shop, double price) {
            this.product = product;
            this.shop = shop;
            this.price = price;
        }

        public String getShop() {
            return shop;
        }

        public String getProduct() {
            return product;
        }

        public double getPrice() {
            return price;
        }
    }



