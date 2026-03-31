const BASE_URL = "http://localhost:8080";

function login() {
  const userId = document.getElementById("userId").value;
  const userPass = document.getElementById("userPass").value;

  fetch(`${BASE_URL}/api/auth/login`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      userId: userId,
      userPass: userPass,
    }),
  })
    .then((response) => response.json())
    .then((data) => {
      if (data.message === "Login Successful") {
        // Save role in localStorage
        localStorage.setItem("userRole", data.userRole);
        localStorage.setItem("userId", data.userId);

        // Role Based Redirect
        if (data.userRole === "Admin") {
          window.location.href = "admin/admin-dashboard.html";
        } else if (data.userRole === "Airline") {
          window.location.href = "airline/airline-dashboard.html";
        } else if (data.userRole === "User") {
          window.location.href = "user/user-dashboard.html";
        }
      } else {
        document.getElementById("message").innerText = "Invalid Credentials";
      }
    })
    .catch((error) => {
      document.getElementById("message").innerText = "Server Error";
      console.error("Error:", error);
    });
}
