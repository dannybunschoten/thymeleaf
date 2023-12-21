document.querySelectorAll('.quantity-field input[type="number"]').forEach(input => {
    input.addEventListener('change', function() {
        console.log("hittt")
        // Assuming each item has its own price label
        let priceLabel = input.closest('.item').querySelector('.item-price');

        // Assuming the base price of the item is constant and known (€19.95 in this case)
        // Alternatively, you can store and retrieve the base price dynamically
        const basePrice = 19.95;

        // Retrieve the current quantity entered
        const quantity = parseInt(input.value);

        // Calculate the new price based on the quantity
        let newPrice = basePrice * quantity;

        // Update the text of the price label
        priceLabel.textContent = "€" + newPrice.toFixed(2);
        document.getElementById("subtotal-price").textContent = "€" + newPrice.toFixed(2);
        document.getElementById("total-price").textContent = "€" + newPrice.toFixed(2); 
    });
});
