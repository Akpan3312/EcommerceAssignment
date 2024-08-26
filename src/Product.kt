class Product(val name: String, var price: Double, var quantityInStock: Int) {

    // Method to return product details
    fun productInfo(): String {
        return "Product:$name, Price:$price, Quantity in Stock:$quantityInStock"
    }
    // Method to check if the product is available
    fun isAvailable(): Boolean {
        return quantityInStock > 0
    }
}