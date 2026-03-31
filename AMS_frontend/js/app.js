const BASE_URL = "http://localhost:8080";

function searchFlights() {
  const origin = document.getElementById("origin").value;
  const dest = document.getElementById("dest").value;

  fetch(`${BASE_URL}/api/flights/search?origin=${origin}&dest=${dest}`)
    .then((response) => response.json())
    .then((data) => {
      let tableBody = document.querySelector("#flightTable tbody");
      tableBody.innerHTML = "";

      data.forEach((flight) => {
        let row = `
                    <tr>
                        <td>${flight.fltId}</td>
                        <td>${flight.fltOrigin}</td>
                        <td>${flight.fltDest}</td>
                        <td>${flight.fltTkPrice}</td>
                    </tr>
                `;
        tableBody.innerHTML += row;
      });
    })
    .catch((error) => console.error("Error:", error));
}
