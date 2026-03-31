// Show Logged in Admin Name
document.getElementById("adminName").innerText =
  "User: " + localStorage.getItem("userId");

// Live Date Time
function updateDateTime() {
  const now = new Date();
  document.getElementById("dateTime").innerText =
    now.toLocaleDateString() + " | " + now.toLocaleTimeString();
}
setInterval(updateDateTime, 1000);

// Redirect Function
function goTo(page) {
  window.location.href = page;
}

// Logout
function logout() {
  localStorage.clear();
  window.location.href = "../login.html";
}
