class Product {

    val name: String
    var price: Double
    var quantityInStock: Int

    constructor(name: String, price: Double, quantityInStock: Int) {
        this.name = name
        this.price = price
        this.quantityInStock = quantityInStock
    }

    // Method to return product details
    fun productInfo(): String {
        return "Product:$name, Price:$price, Quantity in Stock:$quantityInStock"
    }
    // Method to check if the product is available
    fun isAvailable(): Boolean {
        return quantityInStock > 0
    }
}