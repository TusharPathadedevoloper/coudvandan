document.getElementById("survey-form").addEventListener("submit", function (e) {
    e.preventDefault();
    showPopup();
    displayResults();
});

document.getElementById("reset-button").addEventListener("click", function () {
    document.getElementById("survey-form").reset();
});

function showPopup() {
    document.getElementById("popup").style.display = "block";
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}

function displayResults() {
    const resultsContainer = document.getElementById("popup-results");
    resultsContainer.innerHTML = "";
    
    const form = document.getElementById("survey-form");
    const elements = form.elements;
    
    for (let i = 0; i < elements.length; i++) {
        const element = elements[i];
        if (element.type !== "button" && element.type !== "checkbox") {
            resultsContainer.innerHTML += `<p><strong>${element.previousElementSibling.textContent}:</strong> ${element.value}</p>`;
        }
        if (element.type === "checkbox" && element.checked) {
            resultsContainer.innerHTML += `<p><strong>${element.previousElementSibling.textContent}:</strong> ${element.value}</p>`;
        }
    }
}
