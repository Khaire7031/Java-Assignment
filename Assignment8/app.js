function validateForm() {
    var fullName = document.getElementById("fullName").value;
    var email = document.getElementById("email").value;
    var phoneNumber = document.getElementById("phoneNumber").value;
    var address = document.getElementById("address").value;
    var initialDeposit = document.getElementById("initialDeposit").value;

    var errorMessage = document.getElementById("errorMessage");
    errorMessage.innerHTML = "";

    // Simple validation for demonstration purposes
    if (!fullName || !email || !phoneNumber || !address || !initialDeposit) {
        errorMessage.innerHTML = "All fields are required.";
        return false;
    }

    // Additional validation logic can be added based on requirements

    return true;
}