
fun main() {
    // Creating some Product objects


    val laptop = Product("Laptop", 1000.0, 5)
    val smartphone = Product("Smartphone", 600.0, 10)
    val tablet = Product("Tablet", 300.0, 7)

    // Printing product details
    println(laptop.productInfo())
    println(smartphone.productInfo())
    println(tablet.productInfo())


    val cart = ShoppingCart()

    cart.addProduct(laptop, 2)
    cart.addProduct(smartphone, 1)

    // Calculating total cost
    println("Total cost:${cart.calculateTotal()}")


    cart.checkout()

    // Showing updated stock after checkout
    println("Updated stock for ${laptop.name}:${laptop.quantityInStock}")
    println("Updated stock for ${smartphone.name}: ${smartphone.quantityInStock}")
}
