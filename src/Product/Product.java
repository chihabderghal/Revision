package Product;

    public class Product {
        public String size, color, productGender;
        protected float price;

        public float getPrice() {
            return price;
        }

        public Product(String size, String color, String productGender, float price) {
            this.size = size;
            this.color = color;
            this.productGender = productGender;
            this.price = price;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getProductGender() {
            return productGender;
        }

        public void setProductGender(String productGender) {
            this.productGender = productGender;
        }
    }