// ShoppingCart Class
class ShoppingCart {
    // Mutable list to hold products
    private val cartItems: MutableList<Pair<Product, Int>> = mutableListOf()

    // Method to add product to the cart
    fun addProduct(product: Product, quantity: Int) {
        if (product.isAvailable() && product.quantityInStock >= quantity) {
            cartItems.add(Pair(product, quantity))
            println("Product added:${product.name}, Quantity:$quantity")
        } else {
            println("Product ${product.name} is not available in the desired quantity.")
        }
    }

    // Method to remove product from the cart
    fun removeProduct(product: Product) {
        cartItems.removeAll { it.first == product }
        println("Product removed:${product.name}")
    }

    // Method to calculate total price of the cart
    fun calculateTotal(): Double {
        return cartItems.sumByDouble { it.first.price * it.second }
    }

    // Method to check out and clear the cart
    fun checkout() {
        cartItems.forEach { (product, quantity) ->
            product.quantityInStock -= quantity
        }
        println("Checkout complete.")
        cartItems.clear()
    }
}
